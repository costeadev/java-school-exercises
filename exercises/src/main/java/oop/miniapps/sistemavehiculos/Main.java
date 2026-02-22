package oop.miniapps.sistemavehiculos;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Conducible> vehiculos = new ArrayList<>();

        vehiculos.add(new Coche());
        vehiculos.add(new Moto());
        vehiculos.add(new Camion());

        for (Conducible c : vehiculos) {
            c.arrancar();
            c.detener();
        }
    }
}
