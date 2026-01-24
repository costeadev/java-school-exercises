package oop.classes.Ej21;

public class Departamento {

    private final String name;
    private Empleado director;
    private Empleado[] empleados;

    Departamento(String name, Empleado director, Empleado[] empleados) {
        this.name = name;
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

    public String getname() {
        return name;
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
        System.arraycopy(empleados, 0, newArray, 0, empleados.length);
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
                    .append(empleado.getname())
                    .append("\n");
        }
        return sb.toString();
    }

    @Override
    public String toString() {
        return String.format("""
                        name: %s
                        Director: %s
                        Empleados: 
                        %s
                        """,
                name,
                director.getname(),
                listarEmpleados()
        );
    }
}
