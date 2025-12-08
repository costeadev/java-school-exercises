package my_tests;

public class PruebaClases {
    public static class Coche {
        String marca = "Seat";
        String color = "Azul";
        int caballos = 120;
    }

    public static void main(String[] args) {
        Coche miCoche = new Coche();
        System.out.println(miCoche.marca);
        System.out.println(miCoche.color);
        System.out.println(miCoche.caballos);
    }
}
