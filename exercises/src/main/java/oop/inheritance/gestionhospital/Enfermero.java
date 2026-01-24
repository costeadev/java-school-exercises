package oop.inheritance.gestionhospital;

public class Enfermero extends Empleado {
    private Turno turno;
    private double bonusNoche = 20;

    public Enfermero(String nombre, String dni, double salarioBase, Turno turno) {
        super(nombre, dni, salarioBase);
        this.turno = turno;
    }

    @Override
    public double calcularSalario() {
        if (turno == Turno.NOCHE) {
            return getSalarioBase() * (1 + bonusNoche / 100);
        } else {
            return getSalarioBase();
        }
    }
}
