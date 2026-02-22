package oop.miniapps.sistemavehiculos;

public class Coche implements Conducible {
    @Override
    public void arrancar() {
        System.out.println("stutututututututu OMG IS THAT A SUPRA");
    }
    @Override
    public void detener() {
        System.out.println("*motor detenido*");
    }
}
