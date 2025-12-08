package if_statements;

import java.util.Scanner;

/*
 * Recibir un numero entre 1 y 99 e indicar si su decena es un número par o impar.
 */

public class Ex15 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Introduce un número (1-99): ");
		int num = scan.nextInt();
		
		scan.close();
		
		boolean validInput = (num > 0 && num < 100);
		
		if (!validInput) {
			System.err.println("El número introducido no es válido.");
			return;
		}
		
		int tens = num/10;

		if (tens == 0) {
			System.out.println("El número no tiene decenas");
		} else {
			String parity = (tens % 2 == 0) ? "par" : "impar";
			System.out.printf("La decena (%d) de %d es %s", tens, num, parity);
		}
		
	}
}
