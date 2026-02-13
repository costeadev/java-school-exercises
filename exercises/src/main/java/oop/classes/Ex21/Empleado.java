package oop.classes.Ex21;

public class Empleado {

    private final String nif;
    private final String name;
    private double sueldo;
    private Departamento departamento;

    public Empleado(String nif, String name, double sueldo) {
        this.nif = nif;
        this.name = name;

        if (sueldo <= 0) {
            throw new IllegalArgumentException("El sueldo debe ser positivo");
        }
        this.sueldo = sueldo;
    }

    public String getNif() {
        return nif;
    }

    public String getname() {
        return name;
    }

    public double getSueldo() {
        return sueldo;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }

    void increaseSueldo(double porcentaje) {
        if (porcentaje <= 0) {
            throw new IllegalArgumentException("El porcentaje debe ser positivo");
        }
        sueldo += sueldo * porcentaje / 100;
    }

    @Override
    public String toString() {
        return String.format("""
                        NIF: %s
                        name: %s
                        Sueldo: %.2f€
                        Departamento: %s
                        """,
                nif,
                name,
                sueldo,
                (departamento != null) ? departamento.getname() : "Sin departamento"
        );
    }
}
