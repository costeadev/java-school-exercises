package inheritance.gestionhospital;

import java.util.Arrays;

public class Hospital {
    private Empleado[] empleados;

    public Hospital() {
        empleados = new Empleado[0];
    }

    public void agregarEmpleado(Empleado e) {
        if (buscarEmpleadoPorDni(e.getDni()) != null) {
            throw new IllegalArgumentException("Empleado ya existe");
        }
        // Add nueva posicion al array
        empleados = Arrays.copyOf(empleados, empleados.length + 1);
        // Add empleado a la ultima posicion
        empleados[empleados.length - 1] = e;
    }

    public void mostrarEmpleados() {
        System.out.println("=== TODOS LOS EMPLEADOS ===");
        for (Empleado e : empleados) {
            e.mostrarDatos();
        }
    }

    public double calcularGastoTotal() {
        double total = 0;
        for (Empleado e : empleados) {
            total += e.calcularSalario();
        }
        return total;
    }

    private Empleado buscarEmpleadoPorDni(String dni) {
        for (Empleado e : empleados) {
            if (e.getDni().equals(dni)) return e;
        }
        return null;
    }
}
