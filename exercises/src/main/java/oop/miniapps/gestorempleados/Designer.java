package oop.miniapps.gestorempleados;

public class Designer extends Empleado {

    private String herramientaDesign;
    private String plusCreativo;

    public Designer(String nombre, double salarioBase, String herramientaDesign, String plusCreativo) {
        super(nombre, salarioBase);
        this.herramientaDesign = herramientaDesign;
        this.plusCreativo = plusCreativo;
    }

    public String getHerramientaDesign() {
        return herramientaDesign;
    }

    public String getPlusCreativo() {
        return plusCreativo;
    }

    @Override
    public double calcularSalario() {
        if (plusCreativo.equals("Gimp")) {
            return super.getSalarioBase() + 3000;
        } else if (plusCreativo.equals("Photoshop")) {
            return super.getSalarioBase() - 600;
        }
        return super.getSalarioBase();
    }
}
