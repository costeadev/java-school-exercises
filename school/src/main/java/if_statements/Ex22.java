package if_statements;

import java.util.Scanner;

// Pedir un número entre 0 y 99999 y decir cuantas cifras tiene.

public class Ex22 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("Introduce un número entre 0 y 99999: ");
		int num = scan.nextInt();

		scan.close();

		// Input validation
		if (num < 0 || num > 99999) {
			System.err.print("Error: Número fuera de rango.");
			return;
		}

		int digitos = 1;
		
		if (num >= 10 && num < 100) {
			digitos = 2;
		} else if (num >= 100 && num < 1000) {
			digitos = 3;
		} else if (num >= 1000 && num < 10000) {
			digitos = 4;
		} else if (num >= 10000 && num < 100000) {
			digitos = 5;
		}

		System.out.printf("El número %d tiene %d dígito%s", num, digitos, digitos > 1 ? "s" : "");
	}
}
