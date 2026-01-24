package basics.forloops;

import java.util.Scanner;

// Pedir un número y calcular su factorial.

public class Ex11 {
	
	public static void main(String[] args) {
		
		// Entrada de usuario
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Introduce un número para calcular su factorial: ");
		int n = scan.nextInt();
		
		scan.close();
		
		
		// Calcular el factorial de 'n'
		long totalFactorial = 1;
		for (int i = 2; i <= n; i++) totalFactorial *= i;
		
		System.out.printf("!%d = %d", n, totalFactorial);
	}
}   