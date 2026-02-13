package oop.inheritance.pacientehospital;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Hospital {
    private List<Paciente> pacientes;
    private List<Doctor> doctores;

    public Hospital() {
        pacientes = new ArrayList<>();
        doctores = new ArrayList<>();
    }

    public List<Paciente> getPacientes() {
        return pacientes;
    }

    public List<Doctor> getDoctores() {
        return doctores;
    }

    public void addPaciente(Paciente p) {
        if (p == null) {
            throw new IllegalArgumentException("Paciente no puede ser null");
        }

        if (pacienteExiste(p)) {
            throw new IllegalArgumentException("Paciente existe ya");
        }

        pacientes.add(p);
    }

    public void addDoctor(Doctor d) {
        if (d == null) {
            throw new IllegalArgumentException("Doctor no puede ser null");
        }

        if (doctorExiste(d)) {
            throw new IllegalArgumentException("Doctor existe ya");
        }

        doctores.add(d);
    }

    public Optional<Paciente> findPacienteByDni(String dni) {
        for (Paciente p : pacientes) {
            if (p.getDni().equals(dni)) {
                return Optional.of(p);
            }
        }
        return Optional.empty();
    }

    public Optional<Doctor> findDoctorByDni(String dni) {
        for (Doctor d : doctores) {
            if (d.getDni().equals(dni)) {
                return Optional.of(d);
            }
        }
        return Optional.empty();
    }

    public String pacientesPorDoctor(Doctor doctor) {
        if (doctor == null) {
            throw new IllegalArgumentException("Doctor no puede ser null");
        }

        if (!doctorExiste(doctor)) {
            throw new IllegalArgumentException("Doctor no existe");
        }

        StringBuilder sb = new StringBuilder();

        sb.append(String.format("=== PACIENTES DEL DOCTOR %s ===\n", doctor.getNombre()));

        for (Paciente p : pacientes) {
            for (Cita c : p.getHistorialMedico()) {
                if (c.getDoctorAsignado().equals(doctor)){
                    sb.append("\n");
                    sb.append(p);
                    break;
                }
            }
        }
        return sb.toString();
    }

    public String citasEnFecha(Doctor doctor, LocalDate fecha) {
        if (doctor == null) {
            throw new IllegalArgumentException("Doctor no puede ser null");
        }

        if (!doctorExiste(doctor)) {
            throw new IllegalArgumentException("Doctor no existe");
        }

        StringBuilder sb = new StringBuilder();

        sb.append("=== CITAS EN FECHA ===\n");

        for (Paciente p : pacientes) {
            for (Cita c : p.getHistorialMedico()) {
                if (c.getDoctorAsignado().equals(doctor) && c.getFecha().equals(fecha)){
                    sb.append(c);
                    sb.append("\n");
                    break;
                }
            }
        }
        return sb.toString();
    }

    public String informeGastos(Paciente paciente) {
        StringBuilder sb = new StringBuilder();
        for (Cita c : paciente.getHistorialMedico()) {
            if (c instanceof Tratamiento t) {
                sb.append(String.format("%s %.2f€", t.getDescripcion(), t.getCosto()));
            }
        }
        return sb.toString();
    }

    private boolean doctorExiste(Doctor doctor) {
        for (Doctor d : doctores) {
            if (d.equals(doctor)) {
                return true;
            }
        }
        return false;
    }

    private boolean pacienteExiste(Paciente paciente) {
        for (Paciente p : pacientes) {
            if (p.equals(paciente)) {
                return true;
            }
        }
        return false;
    }
}
