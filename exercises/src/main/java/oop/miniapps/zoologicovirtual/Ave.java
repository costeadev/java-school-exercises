package oop.miniapps.zoologicovirtual;

public class Ave extends Animal {

    public Ave(String nombre, int edad) {
        super(nombre, edad);
    }

    @Override
    public void hacerSonido() {
        System.out.println("pio pio");
    }
}
