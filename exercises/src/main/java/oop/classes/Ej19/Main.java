package oop.classes.Ej19;

import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Edificio[] edificios = new Edificio[10];
        Random r = new Random();

        for (int i = 0; i < edificios.length; i++) {
            edificios[i] = new Edificio(r.nextInt(61), r.nextInt(61), r.nextDouble(61), "Madrid");
        }

        int iteCount = 0;
        int largeBuildingsCount = 0;

        for (Edificio e : edificios) {
            if (e.debePasarITE()) {
                iteCount++;
            }
            if (e.getSuperficieTotal() > 500) {
                largeBuildingsCount++;
            }
        }

        System.out.printf("%d edificios deben pasar la ITE\n", iteCount);
        System.out.printf("%d edificios pasan de 500m2 en superficie total", largeBuildingsCount);
    }
}
