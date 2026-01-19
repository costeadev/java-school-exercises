package classes.Ej21;

public class Main {
    public static void main(String[] args) {
        Empleado empleado1 = new Empleado("231323F","Jaimito", 1200);
        Empleado empleado2 = new Empleado("7789223C","Paquito", 2500);

        Empleado[] iniciales = { empleado1, empleado2 };
        Departamento departamento = new Departamento("Marketing", empleado2, iniciales);

        System.out.println(departamento);
        System.out.printf("Sueldo medio: %.2f%n%n", departamento.getSueldoMedio());

        Empleado empleado3 = new Empleado("102934T", "Manolito", 4000);
        departamento.addEmpleado(empleado3);
        departamento.setDirector(empleado3);

        System.out.println(departamento);
        System.out.printf("Sueldo medio: %.2f\n\n", departamento.getSueldoMedio());
    }
}
