package oop.inheritance.hospital;

public class Medico extends Empleado {
    private final String especialidad;
    private final int numberGuardias;

    public Medico(String name,
                  String id,
                  double salarioBase,
                  String especialidad,
                  int numberGuardias) {
        super(name, id, salarioBase);
        this.especialidad = especialidad;
        this.numberGuardias = numberGuardias;
    }

    @Override
    public double calcularSalario() {
        return getSalarioBase() + (numberGuardias * 50);
    }
}