package oop.inheritance.gestionhospital;

public class Enfermero extends Empleado {
    private final Turno turno;
    private final double bonusNoche = 20;

    public Enfermero(String name, String id, double salarioBase, Turno turno) {
        super(name, id, salarioBase);
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
