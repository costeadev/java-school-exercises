package oop.inheritance.gestionhospital;

public class Administrativo extends Empleado {
    private int horasExtra;

    public Administrativo(String nombre, String dni, double salarioBase, int horasExtra) {
        super(nombre, dni, salarioBase);
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
