package oop.inheritance.pacientehospital;

import utils.Keyboard;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Optional;
import java.util.OptionalInt;

public class Main {
    final static DateTimeFormatter DATE_FORMAT = DateTimeFormatter.ofPattern("dd-MM-yyyy");;
    final static DateTimeFormatter TIME_FORMAT = DateTimeFormatter.ofPattern("HH:mm");

    public static void main(String[] args) {
        Hospital hospital = bootstrapHospital();
        runApplication(hospital);
    }

    private static void runApplication(Hospital hospital) {
        int opcion;
        do {
            System.out.println("""
                    === MENU DE OPCIONES ===
                    1. Crear
                    2. Buscar
                    3. Informes
                    0. Salir
                    """);
            opcion = Keyboard.readInt("Elige una opcion: ");
            switch (opcion) {
                case 1 -> {
                    crearFlow(hospital);
                }
                case 2 -> {
                    busquedaFlow(hospital);
                }
                case 3 -> {
                    informeFlow(hospital);
                }
                case 0 -> {
                    System.out.println("Hasta luego! :)");
                }
                default -> {
                    System.err.println("Opcion no valida");
                }
            }
        } while (opcion != 0);
    }

    private static void crearFlow(Hospital hospital) {
        int opcion;
        do {
            System.out.println("""
                    === MENU DE CREACION ===
                    1. Paciente
                    2. Medico
                    3. Cita
                    4. Tratamiento
                    0. Volver
                    """);
            opcion = Keyboard.readInt("Elige una opcion: ");
            switch (opcion) {
                case 1 -> {
                    System.out.println("=== CREAR CLIENTE ===");
                    String dni = Keyboard.readString("DNI: ");
                    String nombre = Keyboard.readString("Nombre: ");
                    try {
                        hospital.addPaciente(new Paciente(dni, nombre));
                    } catch (Exception e) {
                        System.err.println("Error: " + e.getMessage());
                        break;
                    }
                    System.out.println("Paciente creado exitosamente");
                }
                case 2 -> {
                    System.out.println("=== CREAR DOCTOR ===");
                    String dni = Keyboard.readString("DNI: ");
                    String nombre = Keyboard.readString("Nombre: ");
                    String especialidad = Keyboard.readString("Especialidad: ");
                    try {
                        hospital.addDoctor(new Doctor(dni, nombre, especialidad));
                    } catch (Exception e) {
                        System.err.println("Error: " + e.getMessage());
                        break;
                    }
                    System.out.println("Doctor creado exitosamente");
                }
                case 3 -> {
                    Optional<Cita> citaOpt = crearCita(hospital);
                    Optional<Paciente> pacienteOpt = buscarPaciente(hospital);

                    if (citaOpt.isEmpty() || pacienteOpt.isEmpty()) {
                        System.err.println("No se pudo crear la cita");
                        return;
                    }

                    pacienteOpt.get().asignarCita(citaOpt.get());
                }
                case 4 -> {
                    Optional<Cita> citaOpt = crearCita(hospital);
                    if (citaOpt.isEmpty()) {
                        System.err.println("No se pudo crear la cita");
                        return;
                    }
                    Cita cita = citaOpt.get();

                    Optional<Paciente> pacienteOpt = buscarPaciente(hospital);
                    if (pacienteOpt.isEmpty()) {
                        System.err.println("Paciente no encontrado");
                        return;
                    }
                    Paciente paciente = pacienteOpt.get();

                    String descripcion = Keyboard.readString("Descripcion: ");
                    double costo = Keyboard.readDouble("Coste: ");

                    try {
                        Tratamiento tratamiento = new Tratamiento(
                                cita.getFecha(),
                                cita.getHora(),
                                cita.getDoctorAsignado(),
                                descripcion,
                                costo
                        );
                        // asignar tratamiento
                        paciente.asignarTratamiento(tratamiento);
                    } catch (Exception e) {
                        System.err.println("Error: " + e.getMessage());
                    }
                }
                case 0 -> {
                    System.out.println("Volviendo...");
                }
            }
        } while (opcion != 0);
    }

    private static void busquedaFlow(Hospital hospital) {
        int opcion;
        do {
            System.out.println("""
                === MENU DE BUSQUEDA ===
                1. Buscar paciente
                2. Buscar medico
                0. Salir
                """);
            opcion = Keyboard.readInt("Elige una opcion: ");
            switch (opcion) {
                case 1 -> {
                    System.out.println("=== BUSCAR PACIENTE ===");
                    Optional<Paciente> pacienteOpt = buscarPaciente(hospital);
                    if (pacienteOpt.isEmpty()) {
                        System.err.println("No se encontró el paciente");
                        return;
                    }
                    System.out.println("\nPaciente encontrado");
                    System.out.println(pacienteOpt.get() + "\n");
                }
                case 2 -> {
                    System.out.println("=== BUSCAR MEDICO ===");
                    Optional<Doctor> doctorOpt = buscarDoctor(hospital);
                    if (doctorOpt.isEmpty()) {
                        System.err.println("No se encontró el doctor");
                        return;
                    }
                    System.out.println("\nDoctor encontrado");
                    System.out.println(doctorOpt.get() + "\n");
                }
                case 0 -> {
                    System.out.println("Volviendo...");
                }
                default -> {
                    System.err.println("Opcion no valida");
                }
            }
        } while (opcion != 0);
    }

    private static void informeFlow(Hospital hospital) {
        int opcion;
        do {
            System.out.println("""
                === INFORMES ===
                1. Pacientes de un doctor
                2. Citas de un doctor en una fecha determinada
                3. Citas de un paciente
                4. Gastos de un paciente
                0. Salir
                """);
            opcion = Keyboard.readInt("Elige un opcion: ");

            switch (opcion) {
                case 1 -> {
                    Optional<Doctor> doctorOpt = buscarDoctor(hospital);
                    if (doctorOpt.isEmpty()) {
                        System.err.println("El doctor no se encontro");
                        return;
                    }
                    System.out.println(hospital.pacientesPorDoctor(doctorOpt.get()));
                }
                case 2 -> {
                    Optional<Doctor> doctorOpt = buscarDoctor(hospital);
                    String fechaStr = Keyboard.readString("Fecha (dd-MM-YYYY)");
                    LocalDate fecha = LocalDate.parse(fechaStr, DATE_FORMAT);
                    if (doctorOpt.isEmpty()) {
                        System.err.println("El doctor no se encontro");
                        return;
                    }
                    System.out.println(hospital.citasEnFecha(doctorOpt.get(), fecha));
                }
                case 3 -> {
                    Optional<Paciente> pacienteOpt = buscarPaciente(hospital);
                    if (pacienteOpt.isEmpty()) {
                        System.err.println("El paciente no se encontro");
                        return;
                    }
                    System.out.println((pacienteOpt.get().citasToString()));
                }
                case 4 -> {
                    Optional<Paciente> pacienteOpt = buscarPaciente(hospital);
                    if (pacienteOpt.isEmpty()) {
                        System.err.println("El paciente no se encontro");
                        return;
                    }
                    System.out.println(hospital.informeGastos(pacienteOpt.get()));
                }
                case 0 -> {
                    System.out.println("Volviendo...");
                }
                default -> {
                    System.err.println("Opcion invalida");
                }
            }
        } while (opcion != 0);
    }

    private static Optional<Cita> crearCita(Hospital hospital) {
        LocalDate fecha = LocalDate.parse(
                Keyboard.readString("Fecha (dd-MM-yyyy): "), DATE_FORMAT);
        LocalTime hora = LocalTime. parse(
                Keyboard.readString("Hora (hh:mm): "), TIME_FORMAT);

        String dniDoctor = Keyboard.readString("DNI doctor: ");

        Optional<Doctor> doctorOpt = hospital.findDoctorByDni(dniDoctor);

        return hospital.findDoctorByDni(dniDoctor)
                .map(doctor -> new Cita(fecha, hora, doctor));
    }

    private static Optional<Paciente> buscarPaciente(Hospital hospital) {
        String dniPaciente = Keyboard.readString("DNI paciente: ");
        return hospital.findPacienteByDni(dniPaciente);
    }

    private static Optional<Doctor> buscarDoctor(Hospital hospital) {
        String dniDoctor = Keyboard.readString("DNI doctor: ");
        return hospital.findDoctorByDni(dniDoctor);
    }

    private static Hospital bootstrapHospital() {
        Hospital hospital = new Hospital();

        Paciente paciente1 = new Paciente("123", "Bivonius");
        Paciente paciente2 = new Paciente("456", "Aseihc Onafets");
        Paciente paciente3 = new Paciente("789", "Barbilla Carmesi");

        Doctor doctor1 = new Doctor("135", "Elliot Alderson", "Psicologia");
        Doctor doctor2 = new Doctor("246", "Mr. Robot", "Neumologia");

        Cita cita1 = new Cita(LocalDate.now(), LocalTime.of(23,59), doctor1);
        Cita cita2 = new Cita(LocalDate.now(), LocalTime.of(23,59), doctor1);
        Cita cita3 = new Cita(LocalDate.now(), LocalTime.of(23,59), doctor2);

        Tratamiento tratamiento1 = new Tratamiento(
                LocalDate.now(), LocalTime.of(23,59), doctor2, "Paracetamol", 20);

        hospital.addPaciente(paciente1);
        hospital.addPaciente(paciente2);
        hospital.addPaciente(paciente3);

        hospital.addDoctor(doctor1);
        hospital.addDoctor(doctor2);

        paciente1.asignarCita(cita1);
        paciente2.asignarCita(cita2);
        paciente3.asignarCita(cita3);

        paciente1.asignarTratamiento(tratamiento1);

        return hospital;
    }
}
