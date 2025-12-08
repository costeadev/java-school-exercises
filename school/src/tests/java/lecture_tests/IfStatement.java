package lecture_tests;

import java.util.Scanner;

public class IfStatement {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Introduce un número: ");
		int n = scan.nextInt();
		
		// Manera normal
		if (n < 0) System.out.println("Numero no valido");

		// MANERA MALVADA
		if (n < 0) 
			System.out.println("Numero no valido");
	}
}
