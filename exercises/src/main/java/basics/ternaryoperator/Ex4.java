package basics.ternaryoperator;

import java.util.Scanner;

/*
 * Diseña un programa que lea por teclado
 *  una variable entera para representar
 *   la age de un usuario.
 *   Luego, muestra un mensaje que diga "Eres mayor de age:”
 *   seguido de true si es verdad o false si no lo es.
 */

public class Ex4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("--- COMPROBAR SI EL USUARIO ES MAYOR DE age ---");

        System.out.print("age: ");
        int ageUsuario = scanner.nextInt();

        boolean mayorDeage = (ageUsuario >= 18);
        System.out.printf("Eres mayor de age: %b", mayorDeage);

        scanner.close();
    }
}
