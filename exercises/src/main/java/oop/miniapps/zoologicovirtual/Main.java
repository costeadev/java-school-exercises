package oop.miniapps.zoologicovirtual;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        Set<Animal> animales = new HashSet<>();

        Perro perro = new Perro("Paco", 20);
        Gato gato = new Gato("Antonio", 10);
        Ave ave = new Ave("Antonio", 15);

        if (!animales.add(perro)) {
            System.out.println("Animal duplicado");
        } else {
            System.out.println("Animal añadido");
        }

        if (!animales.add(gato)) {
            System.out.println("Animal duplicado");
        } else {
            System.out.println("Animal añadido");
        }

        if (!animales.add(ave)) {
            System.out.println("Animal duplicado");
        } else {
            System.out.println("Animal añadido");
        }

        Ave ave2 = new Ave("Not Antonio", 51);
        if (!animales.add(ave2)) {
            System.out.println("Animal duplicado");
        } else {
            System.out.println("Animal añadido");
        }
    }
}
