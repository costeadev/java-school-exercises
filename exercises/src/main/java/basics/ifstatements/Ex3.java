package basics.ifstatements;

/*
 * Realizar un programa que dado un number entero indique si es o no par.
 */

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce un number: ");
        int num = scanner.nextInt();

        boolean isEven = (num % 2 == 0);

        // Una forma bastante más compacta de hacerlo
        //System.out.printf("%d es %s", num, (num % 2 == 0) ? "par" : "impar" );

        if (isEven) {
            System.out.printf("%n%d es par", num);
        } else {
            System.out.printf("%n%d es impar", num);
        }

        scanner.close();


    }
}
