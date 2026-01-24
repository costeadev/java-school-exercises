package ifstatements;

import java.util.Scanner;

/*
 * Realizar un programa que lea un número (que debe ser menor de 10) e indique si es o no primo.
 */

public class Ex4 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("--- COMPROBAR SI UN NUMERO ES PRIMO ---");
		
		System.out.print("Número (1-9): ");
		int num = scan.nextInt();
		
		boolean isValid = (num > 0 && num < 10);
		if (!isValid) {
			System.err.println("ERROR: Número fuera de rango. (1-9)");
			return;
		}
		
		// Ya, la condición es horripilante pero estoy trabajando sin bucles for :'(
		boolean isPrime = (num == 2 || num == 3 || num == 5 || num == 7);

		System.out.printf("%d %s", num, (isPrime) ? "es primo" : "no es primo");

		scan.close();
	}
}
