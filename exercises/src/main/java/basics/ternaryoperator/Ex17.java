package basics.ternaryoperator;

import java.util.Scanner;

/*
 * Escribe un programa que lea por teclado
 * tres variables enteras y muestre en pantalla la suma de dichos números,
 * pero si la suma es mayor que 100,
 * muestra un mensaje indicando que es demasiado grande
 */

public class Ex17 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("--- ES DEMASIADO GRANDE LA SUMA DE 3 NÚMEROS? ---");

        System.out.print("Número 1: ");
        int num1 = scan.nextInt();

        System.out.print("Número 2: ");
        int num2 = scan.nextInt();

        System.out.print("Número 3: ");
        int num3 = scan.nextInt();

        int suma = num1 + num2 + num3;

        String demasiadoGrande = (suma > 100)
                ? "La suma es demasiado grande"
                : "La suma es: " + suma;

        System.out.println(demasiadoGrande);

        scan.close();
    }
}
