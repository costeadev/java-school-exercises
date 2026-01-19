package classes.Ej21;

public class Empleado {

    private String nif;
    private String nombre;
    private double sueldo;
    private Departamento departamento;

    public Empleado(String nif, String nombre, double sueldo) {
        this.nif = nif;
        this.nombre = nombre;

        if (sueldo <= 0) {
            throw new IllegalArgumentException("El sueldo debe ser positivo");
        }
        this.sueldo = sueldo;
    }

    public String getNif() {
        return nif;
    }

    public String getNombre() {
        return nombre;
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
                Nombre: %s
                Sueldo: %.2f€
                Departamento: %s
                """,
                nif,
                nombre,
                sueldo,
                (departamento != null) ? departamento.getNombre() : "Sin departamento"
        );
    }
}
