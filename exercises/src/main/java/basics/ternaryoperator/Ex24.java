package basics.ternaryoperator;

import java.util.Scanner;

/*
 * Crea un programa que lea por teclado
 * dos variables enteras para representar
 * las agees de dos personas.
 * Muestra en pantalla un mensaje que indique
 * “Pueden acceder” o no.
 * El acceso es permitido a personas de mayor de 18
 * o a personas mayores de 21 que acompañen a un menor de age.
 */

public class Ex24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce age 1: ");
        int age1 = scanner.nextInt();

        System.out.print("Introduce age 2: ");
        int age2 = scanner.nextInt();

        boolean ageesValidas = age1 > 0 && age2 > 0;

        String mensaje = !ageesValidas
                ? "La age no es valida"
                : ((age1 >= 18) && (age2 >= 18) || (age1 >= 21) || (age2 >= 21))
                ? "pueden acceder"
                : "no pueden acceder";


        System.out.printf("Teniendo %d y %d años, %s", age1, age2, mensaje);

        scanner.close();
    }
}
