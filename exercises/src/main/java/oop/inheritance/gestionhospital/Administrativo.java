package oop.inheritance.gestionhospital;

public class Administrativo extends Empleado {
    private final int horasExtra;

    public Administrativo(String name, String id, double salarioBase, int horasExtra) {
        super(name, id, salarioBase);
        this.horasExtra = horasExtra;
    }

    @Override
    public double calcularSalario() {
        if (horasExtra > 0) {
            return getSalarioBase() + horasExtra * 15;
        }
        return 0; // No se si esta bien
    }
}
