package if_statements;

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
		
		System.out.print("Introduce un número: ");
		int num1 = scan.nextInt();
		
		System.out.print("Introduce otro número: ");
		int num2 = scan.nextInt();
		
		System.out.print("Introduce ('1' para sumar) ('2' para restar): ");
		int op = scan.nextInt();
		
		scan.close();
		
		switch (op) {
		case 1: 
			System.out.printf("%n%d + %d = %d", num1, num2, num1 + num2);
			break;
		case 2: 
			System.out.printf("%n%d - %d = %d", num1, num2, num1 - num2);
			break;
		default: 
			System.out.println("Operación no válida");
			break;
		}
	}
}
