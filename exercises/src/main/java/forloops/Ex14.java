package forloops;

import java.util.Scanner;

/*
 * Programa que lea de forma repetida un número N.
 * Para cada número leído:
 * Calculará y mostrará la suma 1+2+3+...+N.
 * Cada vez que muestre el resultado,
 * el programa preguntará al usuario si desea continuar
 * Si se introduce 's', el programa continuará. 
 * En caso contrario finalizará. 
 */

public class Ex14 {
	public static void main(String[] args) {
		
		// Scanner para entrada de usuario
		Scanner scan = new Scanner(System.in);
		
		// Declarar variables
		int n;
		boolean continuar = true;
		
		// Loop general
		while (continuar) {
			
			// Pedir al usuario un número (n)
			System.out.print("Introduce un número: ");
			n = scan.nextInt();
			
			// Añadir 1+2+3+...+N
			int total = 0;
			for (int i = 1; i <= n; i++) {
				total += i;
			}
			
			System.out.printf("El resultado es: %d%n", total);
			
			// Preguntar al usuario si continuar
			System.out.print("\nIntroduce 's' para continuar: ");
			int respuesta = Character.toLowerCase(scan.next().charAt(0));
			
			System.out.println(); // Nueva linea (Para formato bonito)
			
			// Continuar el bucle solo si continuar == 's'
			if (respuesta != 's') continuar = false;
		}
		
		scan.close();
		
		// Avisar de que el programa ha acabado
		System.out.println("--- PROGRAMA TERMINADO ---");
	}
}
