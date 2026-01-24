package basics.forloops;

/*
 * Usando una sola variable,
 * escribe un programa que imprima en pantalla
 * los números de 1 a 10
 * y los números de 10 a 1 al lado:
 * 1   10
 * 2   9
 * 3   8
 */

public class Ex19 {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            System.out.printf("%d %d %n", i, 11 - i);
        }
    }
}
