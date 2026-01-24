package forloops;

import java.util.Scanner;

/*
 * Pide un número (que debe estar entre 0 y 10)
 * Mostrar la tabla de multiplicar de dicho número. 
 */

public class Ex28 {
	public static void main(String[] args) {
		
		// Entrada del usuario
		Scanner scan = new Scanner(System.in);
		
		int num;
		do {
			System.out.print("Introduce un número del 0 al 10: ");
			num = scan.nextInt();
			if (num < 0 || num > 10) {
				System.err.println("Valor no válido. El número debe estar entre 0 y 10");
			}
		} while (num < 0 || num > 10);
		
		scan.close();
		
		// Imprimir tabla de multiplicar
		for (int i = 1; i <= 10; i++) {
			System.out.printf("%d x %d = %d%n", num, i, num*i);
		}
	}
}
