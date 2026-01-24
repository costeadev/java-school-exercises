package ifstatements;

import java.util.Scanner;

/*
 * Recibe 3 números, op, num1 y num2.
 * si op es 1, escribe num1+num2, 
 * si op es 2, escribe num1-num2,
 * en todos los otros casos escribe “Operación no valida”
 */

public class Ex20 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("--- SUMAR O RESTAR 2 NUMEROS ---");
		
		System.out.print("Número 1: ");
		int num1 = scan.nextInt();
		
		System.out.print("Número 2: ");
		int num2 = scan.nextInt();
		
		System.out.print("'1' = suma / '2' = resta: ");
		int op = scan.nextInt();
		
		switch (op) {
		case 1: 
			System.out.printf("\n%d + %d = %d", num1, num2, num1 + num2);
			break;
		case 2: 
			System.out.printf("\n%d - %d = %d", num1, num2, num1 - num2);
			break;
		default: 
			System.out.println("Operación no válida");
			break;
		}

		scan.close();
	}
}
