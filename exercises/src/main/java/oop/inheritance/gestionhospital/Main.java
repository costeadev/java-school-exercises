package oop.inheritance.gestionhospital;

public class Main {
    public static void main(String[] args) {
        Hospital hospital = bootstrap();
        hospital.mostrarEmpleados();
        System.out.printf("El gasto total es: %.2f€", hospital.calcularGastoTotal());
    }

    public static Hospital bootstrap() {
        Hospital hospital = new Hospital();
        Enfermero enfermero = new Enfermero("Jorge Angel", "123456X", 1300, Turno.NOCHE);
        Medico medico = new Medico("Antonia", "293930L", 2000, "Cardiologia", 10);
        Administrativo administrativo = new Administrativo("Juan Miguel", "99321A", 2300, 5);
        hospital.agregarEmpleado(enfermero);
        hospital.agregarEmpleado(medico);
        hospital.agregarEmpleado(administrativo);
        return hospital;
    }
}
