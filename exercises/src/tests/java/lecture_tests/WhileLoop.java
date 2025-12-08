package lecture_tests;

import java.util.Scanner;

public class WhileLoop {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		
		// Pedir datos al usuario
		System.out.print("Introduce un número positivo: ");
		int num = scan.nextInt();
		
		// Bucle
		while (num < 0) { 
			// If num == negativo
			System.out.print("Introduce un número POSITIVO: ");
			//num = scan.nextInt();
		}
		// If num == positivo
		System.out.print("Gracias por introducir un número positivo :)");
	}
}
