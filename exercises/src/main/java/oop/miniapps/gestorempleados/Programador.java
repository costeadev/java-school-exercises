package oop.miniapps.gestorempleados;

public class Programador extends Empleado {

    private String lenguajePrincipal;
    private String lenguajePlus;

    public Programador(String nombre, double salarioBase, String lenguajePrincipal, String lenguajePlus) {
        super(nombre, salarioBase);
        this.lenguajePrincipal = lenguajePrincipal;
        this.lenguajePlus = lenguajePlus;
    }

    public String getLenguajePrincipal() {
        return lenguajePrincipal;
    }

    public String getLenguajePlus() {
        return lenguajePlus;
    }

    @Override
    public double calcularSalario() {
        if (lenguajePlus.equals("C")) {
            return super.getSalarioBase() + 3000;
        } else if (lenguajePlus.equals("Java")) {
            return super.getSalarioBase() - 600;
        }
        return super.getSalarioBase();
    }
}

