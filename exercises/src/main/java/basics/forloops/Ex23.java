package basics.forloops;

import java.util.Scanner;

/*
 * Programa que pida un number
 * y muestre la lista de números primos inferiores a ese number.
 *
 * Mis disculpas si la persona leyendo esto no sabe usar métodos/funciones, pero me parece criminal no usarlos.
 */

public class Ex23 {

    // Devolver si un number es primo o no
    public static boolean esPrimo(int num) {
        if (num < 2) return false; // 0, 1 y negativos -> no primos
        if (num == 2) return true; // 2 -> primo
        if (num % 2 == 0) return false; // numbers pares > 2 -> no primos

        int raiz = (int) Math.sqrt(num);
        for (int i = 3; i <= raiz; i += 2) {
            if (num % i == 0) return false; // divisible -> no primo
        }
        return true; // no se encuentran divisores -> primo
    }

    public static void main(String[] args) {

        // Entrada de usuario
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce un number: ");
        int num = scanner.nextInt();
        if (num <= 2) {
            System.err.println("Este number no tiene números primos inferiores.");
            System.exit(0);
        }

        scanner.close();


        System.out.printf("%n---PRIMOS MENORES QUE %d ---%n", num);

        System.out.println(2); // Imprimimos 2, porque es el único number primo par.
        // Comprobar los números desde 3 hasta 'num', de 2 en 2 (porque no hay números primos pares mayores que 2).
        for (int i = 3; i < num; i += 2) {
            if (esPrimo(i)) { // Si 'i' es primo, se imprime
                System.out.println(i);
            }
        }
    }
}
