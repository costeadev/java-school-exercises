package basics.forloops;

import java.util.Random;
import java.util.Scanner;

/*
 * Programar un juego de adivinanza.
 *
 * El programa pedirá al usuario:
 * - inicio
 * - fin
 * - Un number de intentos.
 *
 *  El programa obtendrá a continuación un number aleatorio entre max y min,
 *  y el usuario deberá adivinarlo utilizando como mucho n intentos.
 *
 *  Cada vez que el usuario introduce un number,
 *  el programa le dice si es mayor o menor.
 *
 *  Al final el programa indica si se ha ganado o no
 *  (para generar un number aleatorio se puede utilizar la clase Random o Math).
 */

public class Ex24 {
    public static void main(String[] args) {

        System.out.println("--- ADIVINA EL number ---");

        // Lectura por teclado
        Scanner scanner = new Scanner(System.in);

        System.out.print("Desde: ");
        int inicio = scanner.nextInt();

        int fin;
        do {
            System.out.print("Hasta: ");
            fin = scanner.nextInt();
            if (inicio >= fin) {
                System.err.println("Este value debe ser mayor que el anterior.");
            }
        } while (inicio >= fin);


        int intentosMax;
        do {
            System.out.print("Intentos: ");
            intentosMax = scanner.nextInt();
            if (intentosMax < 1) {
                System.err.println("Debes por lo menos poner un intento.");
            }
        } while (intentosMax < 1);


        // Generar number aleatorio
        Random random = new Random();
        int num = random.nextInt(inicio, fin + 1); // random.nextInt no imprime el parámetro 'fin', por eso añadimos 1.

        // Variables
        int intentos = 0;
        int guess; // Esta palabra creo que no existe en español y queda 1000 veces mejor que "intento" o "adivinanza"

        System.out.println("\n--- HORA DE ADIVINAR ---\n");

        // Bucle adivinar
        do {
            System.out.printf("Intento %d: ", intentos + 1);
            guess = scanner.nextInt();

            if (guess == num) {    // number adivinado
                System.out.print("\nHas ganado! YIPEEEEEE\n");
                break; // Salida bucle
            } else { // number NO adivinado
                System.out.printf("El number es %s que %d\n", num > guess ? "mayor" : "menor", guess);
                intentos++;
            }
        } while (intentos < intentosMax); // Mientras siga habiendo intentos disponibles

        if (intentos == intentosMax) { // Si se queda sin intentos
            System.out.println("\nTas quedao sin intentos :(");
        }

        System.out.println("\n--- FIN DEL JUEGO---");

        scanner.close();
    }
}
