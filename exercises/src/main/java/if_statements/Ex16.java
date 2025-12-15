package if_statements;

import java.util.Scanner;

/*
 *  Recibir un numero entre 1 y 99 e indicar si su decena es un número par o impar. 
 *  (pero con un algoritmo diverso del que has usado en el ejercicio 4)
 */

public class Ex16 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("--- COMPROBAR SI LA DECENA DE UN NUMERO ES PAR O IMPAR ---");
		
		System.out.print("Introduce un número (1-99): ");
		int num = scan.nextInt();
		
		boolean validInput = (num > 0 && num < 100);
		if (!validInput) {
			System.err.println("El número introducido no es válido.");
			return;
		}
		
		int units = num % 10;
		int tens = (num - units) / 10;

		if (num - units == 0) {
			System.out.println("El número no tiene decenas");
		} else {
			String parity = (tens % 2 == 0) ? "par" : "impar";
			System.out.printf("La decena (%d) de %d es %s", tens, num, parity);
		}

		scan.close();
	}
}
