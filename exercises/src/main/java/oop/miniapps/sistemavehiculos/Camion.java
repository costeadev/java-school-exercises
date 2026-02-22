package oop.miniapps.sistemavehiculos;

public class Camion implements Conducible {
    @Override
    public void arrancar() {
        System.out.println("EuroTruck Simulator 2");
    }
    @Override
    public void detener() {
        System.out.println("*entrega de 12t de platanos finalizada*");
    }
}
