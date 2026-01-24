package basics.forloops;

import java.util.Scanner;

/*
 * Pedir 5 números 
 * Indicar si alguno es múltiplo de 3.
 */

public class Ex18 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		// Declaración de variables
		boolean hayMultiploDe3 = false;
		int num;
		
		// Bucle principal
		for (int i = 1; i <= 5; i++) {
			
			System.out.print("Introduce un número: ");
			num = scan.nextInt();
			
			if (num % 3 == 0) hayMultiploDe3 = true;
		}
		
		scan.close();
		
		System.out.println(hayMultiploDe3 ? "Sí, al menos un número es múltiplo de 3." : "No, ninguno es múltiplo de 3.");
	}
}
