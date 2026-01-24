package basics.forloops;

import java.util.Scanner;
import java.util.Random;

/*
 * Programar un juego de adivinanza.
 * 
 * El programa pedirá al usuario:
 * - inicio
 * - fin
 * - Un número de intentos.
 * 
 *  El programa obtendrá a continuación un número aleatorio entre max y min,
 *  y el usuario deberá adivinarlo utilizando como mucho n intentos.
 *  
 *  Cada vez que el usuario introduce un número,
 *  el programa le dice si es mayor o menor.
 *  
 *  Al final el programa indica si se ha ganado o no
 *  (para generar un número aleatorio se puede utilizar la clase Random o Math). 
 */

public class Ex24 {
	public static void main(String[] args) {
		
		System.out.println("--- ADIVINA EL NÚMERO ---");
		
		// Lectura por teclado
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Desde: ");
		int inicio = scan.nextInt();
		
		int fin;
		do {
			System.out.print("Hasta: ");
			fin = scan.nextInt();
			if (inicio >= fin) {System.err.println("Este valor debe ser mayor que el anterior.");}
		} while (inicio >= fin);


		int intentosMax;
		do {
		    System.out.print("Intentos: ");
			intentosMax = scan.nextInt();
			if (intentosMax < 1) {System.err.println("Debes por lo menos poner un intento.");}
		} while (intentosMax < 1);
		
		
		// Generar número aleatorio
		Random random = new Random();
		int num = random.nextInt(inicio,fin + 1); // random.nextInt no imprime el parámetro 'fin', por eso añadimos 1.  
		
		// Variables
		int intentos = 0;
		int guess; // Esta palabra creo que no existe en español y queda 1000 veces mejor que "intento" o "adivinanza"
		
		System.out.println("\n--- HORA DE ADIVINAR ---\n");
		
		// Bucle adivinar
		do {
			System.out.printf("Intento %d: ", intentos+1);
			guess = scan.nextInt();
			
			if (guess == num) {	// Numero adivinado 
				System.out.printf("\nHas ganado! YIPEEEEEE\n");
				break; // Salida bucle
			} else { // Número NO adivinado
				System.out.printf("El número es %s que %d\n", num > guess ? "mayor" : "menor", guess);
				intentos++;
			}
		} while (intentos < intentosMax); // Mientras siga habiendo intentos disponibles
		
		if (intentos == intentosMax) { // Si se queda sin intentos
			System.out.println("\nTas quedao sin intentos :(");
		}
				
		System.out.println("\n--- FIN DEL JUEGO---");
		
		scan.close();
		}
	}
