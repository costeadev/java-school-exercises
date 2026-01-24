package oop.classes.Ej21;

public class Departamento {

    private String nombre;
    private Empleado director;
    private Empleado[] empleados;

    Departamento(String nombre, Empleado director, Empleado[] empleados) {
        this.nombre = nombre;
        this.empleados = empleados;

        // Ensure director is an employee
        boolean found = false;
        for (Empleado empleado : empleados) {
            if (empleado == director) {
                found = true;
                break;
            }
        }

        if (!found) {
            throw new IllegalArgumentException("El director debe pertenecer al departamento");
        }

        this.director = director;
        director.setDepartamento(this);
    }

    public String getNombre() {
        return nombre;
    }

    public Empleado getDirector() {
        return director;
    }

    public void setDirector(Empleado newDirector) {
        if (newDirector.getDepartamento() == null || newDirector.getDepartamento() != this) {
            throw new IllegalArgumentException("El director debe ser un empleado del departamento");
        }
        this.director = newDirector;
    }

    void addEmpleado(Empleado newEmpleado) {
        if (newEmpleado == null) {
            throw new IllegalArgumentException("Empleado nulo");
        }

        // Prevent duplicates by NIF
        for (Empleado empleado : empleados) {
            if (empleado.getNif().equals(newEmpleado.getNif())) {
                return;
            }
        }

        Empleado[] newArray = new Empleado[empleados.length + 1];
        for (int i = 0; i < empleados.length; i++) {
            newArray[i] = empleados[i];
        }
        newArray[empleados.length] = newEmpleado;
        empleados = newArray;

        newEmpleado.setDepartamento(this);
    }

    double getSueldoMedio() {
        double suma = 0;
        for (Empleado empleado : empleados) {
            suma += empleado.getSueldo();
        }
        return empleados.length == 0 ? 0 : suma / empleados.length;
    }

    private String listarEmpleados() {
        StringBuilder sb = new StringBuilder();
        for (Empleado empleado : empleados) {
            sb.append(empleado.getNif())
                    .append(" - ")
                    .append(empleado.getNombre())
                    .append("\n");
        }
        return sb.toString();
    }

    @Override
    public String toString() {
        return String.format("""
                Nombre: %s
                Director: %s
                Empleados: 
                %s
                """,
                nombre,
                director.getNombre(),
                listarEmpleados()
        );
    }
}
