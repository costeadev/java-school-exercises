package basics.ifstatements;

import java.util.Scanner;

// Pedir un number entre 0 y 99999 y decir cuantas cifras tiene.

public class Ex23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("--- CONTAR CIFRAS DE UN number ---");

        System.out.print("Introduce un number entre 0 y 99999: ");
        int num = scanner.nextInt();

        if (num < 0 || num > 99999) {
            System.err.print("Error: number fuera de rango.");
            return;
        }

        int digitos = 1;
        int
                decenasMillar = 0,
                millares = 0,
                centenas = 0,
                decenas = 0,
                unidades = 0;

        String reversed = "" + unidades;

        if (num >= 10 && num < 100) {
            digitos = 2;
            decenas = num / 10;
            unidades = num % 10;
            reversed = "" + unidades + decenas;
        } else if (num >= 100 && num < 1000) {
            digitos = 3;
            centenas = num / 100;
            decenas = (num % 100) / 10;
            unidades = num % 10;
            reversed = "" + unidades + decenas + centenas;
        } else if (num >= 1000 && num < 10000) {
            digitos = 4;
            millares = num / 1000;
            centenas = (num % 1000) / 100;
            decenas = (num % 100) / 10;
            unidades = num % 10;
            reversed = "" + unidades + decenas + centenas + millares;
        } else if (num >= 10000 && num < 100000) {
            digitos = 5;
            decenasMillar = num / 10000;
            millares = (num % 10000) / 1000;
            centenas = (num % 1000) / 100;
            decenas = (num % 100) / 10;
            unidades = num % 10;
            reversed = "" + unidades + decenas + centenas + millares + decenasMillar;
        }


        System.out.println("------------------");
        System.out.println(num);
        System.out.println("------------------");
        System.out.printf("- %d dígito%s%n", digitos, digitos > 1 ? "s" : "");
        System.out.printf("- %d decenas de millar, %d millares, %d centenas, %d decenas y %d unidades%n", decenasMillar, millares, centenas, decenas, unidades);
        System.out.printf("- Reversed: %s", reversed);

        scanner.close();
    }
}
