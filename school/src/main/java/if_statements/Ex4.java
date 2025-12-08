package if_statements;

import java.util.Scanner;

/*
 * Realizar un programa que lea un número (que debe ser menor de 10) e indique si es o no primo.
 */

public class Ex4 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Introduce un número entre 1 y 9: ");
		int num = scan.nextInt();
		
		scan.close();
		
		boolean isValid = (num > 0 && num < 10);
		
		// Ya, la condición es horripialnte pero estoy trabajando sin bucles for :'(
		boolean isPrime = (num == 2 || num == 3 || (num > 1 && num % 2 != 0 && num % 3 != 0));
		
		if (!isValid) {
			System.err.println("ERROR: Número fuera de rango. (1-9)");
			return;
		}
		
		System.out.printf("%d %s", num, (isPrime) ? "es primo" : "no es primo");
	}
}
