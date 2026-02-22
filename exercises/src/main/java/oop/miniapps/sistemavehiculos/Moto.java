package oop.miniapps.sistemavehiculos;

public class Moto implements Conducible {
    @Override
    public void arrancar() {
        System.out.println("stutututututututu OMG IS THAT A HARLEY");
    }
    @Override
    public void detener() {
        System.out.println("*motor de moto detenido*");
    }
}
