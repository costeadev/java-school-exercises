package basics.forloops;

import java.util.Scanner;

/*
 * Pedir :
 * - Una palabra
 * - Un number N
 *
 * Escribe una cadena de caracteres en la que cada letra de la palabra se repite N veces.
 * Ejemplo: Gato 3
 * Resultado: GGGaaatttooo
 */

public class Ex33 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedir palabra al usuario y eliminar espacios sobrantes
        System.out.print("Introduce una palabra: ");
        String word = scanner.nextLine().trim();

        // Pedir el number de repeticiones
        System.out.print("Introduce un number: ");
        int n = scanner.nextInt();

        scanner.close();

        // Recorrer cada letra de la palabra
        for (int i = 0; i < word.length(); i++) {
            // Imrpimir la letra actual 'n' veces
            for (int j = 1; j <= n; j++) {
                System.out.print(word.charAt(i));
            }
        }
    }
}
