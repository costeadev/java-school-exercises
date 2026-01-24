package oop.inheritance.gestionhospital;

public class Medico extends Empleado {
    private String especialidad;
    private int numeroGuardias;

    public Medico(String nombre,
                  String dni,
                  double salarioBase,
                  String especialidad,
                  int numeroGuardias) {
       super(nombre, dni, salarioBase);
       this.especialidad = especialidad;
       this.numeroGuardias = numeroGuardias;
    }

    @Override
    public double calcularSalario() {
        return getSalarioBase() + (numeroGuardias * 50);
    }
}