package basics.ternaryoperator;

import java.util.Scanner;

/*
 * Crea un programa que lea por teclado
 * tres variables enteras para representar
 * las agees de tres personas.
 * Muestra en pantalla un mensaje que indique
 * si al menos dos de ellas son mayores de 21 años

 */

public class Ex21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("age persona 1: ");
        int age1 = scanner.nextInt();

        System.out.print("age persona 2: ");
        int age2 = scanner.nextInt();

        System.out.print("age persona 3: ");
        int age3 = scanner.nextInt();

        String resultado = (age1 < 0 || age1 > 130 || age2 < 0 || age2 > 130 || age3 < 0 || age3 > 130)
                ? "age no válida"
                : ((age1 >= 21 && age2 >= 21) || (age1 >= 21 && age3 >= 21) || (age2 >= 21 && age3 >= 21))
                ? "Al menos 2 personas son mayores de 21"
                : "No hay por lo menos 2 personas mayores de 21";

        System.out.println(resultado);

        scanner.close();
    }
}
