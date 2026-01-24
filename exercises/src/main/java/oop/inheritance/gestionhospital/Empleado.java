package oop.inheritance.gestionhospital;

public abstract class Empleado {
    private String name;
    private String id;
    private double salarioBase;

    public Empleado(String name, String id, double salarioBase) {
        this.name = name;
        this.id = id;
        this.salarioBase = salarioBase;
    }

    public String getname() {
        return name;
    }

    public void setname(String name) {
        this.name = name;
    }

    public String getid() {
        return id;
    }

    public void setid(String id) {
        this.id = id;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public abstract double calcularSalario();

    public void mostrarDatos() {
        System.out.printf("""
                name: %s/ id: %s/ Salario base: %.2f€
                """, name, id, calcularSalario());
    }
}

