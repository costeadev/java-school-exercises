package forloops;

/**
 * Programa que dado un número entero lo exprese en el sistema de numeración romano
 */

import java.util.Scanner;

public class Ex27Corrected {

    public static void main(String[] args) {

        // Entrada del usuario
        Scanner scan = new Scanner(System.in);

        System.out.print("Introduce un número entero (0-3999): ");
        int num = scan.nextInt();
        while (num < 1 || num > 3999) {
            System.out.println("Número no válido, prueba de nuevo");
            num = scan.nextInt();
        }

        scan.close();

        /*
         * Esta parte es un poco freestyle, puede sacar los digitos de mil maneras. Aquí algunas:
         * 1. Convertir 'num' a String. Usar .charAt() y convertir cada digito a int (Para que los switch funcionen)
         * 2. Bucle que saca los digitos de derecha a izquierda y los vaya guardando en un array.
         * 3. Bucle que saca los digitos de izquierda a derecha y los vaya guardando en un array.
         * 4. Calcular cada digito por separado (Lo que he usado yo)
         */

        // Crear una variable por cada digito de 'num'
        int millares = num / 1000;
        int centenas = (num % 1000) / 100;
        int decenas = (num % 100) / 10;
        int unidades = num % 10;

        // Añadir cada digito en numero romano a romanNum para luego imprimirlo
        String romanNum = "";

        // Millares
        switch (millares) {
            case 1 -> romanNum += "M";
            case 2 -> romanNum += "MM";
            case 3 -> romanNum += "MMM";
        }

        // Centenas
        switch (centenas) {
            case 1 -> romanNum += "C";
            case 2 -> romanNum += "CC";
            case 3 -> romanNum += "CCC";
            case 4 -> romanNum += "CD";
            case 5 -> romanNum += "D";
            case 6 -> romanNum += "DC";
            case 7 -> romanNum += "DCC";
            case 8 -> romanNum += "DCCC";
            case 9 -> romanNum += "CM";
        }

        // Decenas
        switch (decenas) {
            case 1 -> romanNum += "X";
            case 2 -> romanNum += "XX";
            case 3 -> romanNum += "XXX";
            case 4 -> romanNum += "XL";
            case 5 -> romanNum += "L";
            case 6 -> romanNum += "LX";
            case 7 -> romanNum += "LXX";
            case 8 -> romanNum += "LXXX";
            case 9 -> romanNum += "XC";
        }

        // Unidades
        switch (unidades) {
            case 1 -> romanNum += "I";
            case 2 -> romanNum += "II";
            case 3 -> romanNum += "III";
            case 4 -> romanNum += "IV";
            case 5 -> romanNum += "V";
            case 6 -> romanNum += "VI";
            case 7 -> romanNum += "VII";
            case 8 -> romanNum += "VIII";
            case 9 -> romanNum += "IX";
        }

        // Imprimir resultado
        System.out.printf("%d = %s", num, romanNum);
    }

}