package forloops;

import java.util.Scanner;

/*
 * Pedir 10 números. 
 * Y mostrar al final si se ha introducido alguno negativo
 */

public class Ex16 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		// Declaración de variables
		int num;
		int contadorNegativos = 0;
		
		// Bucle principal
		for (int i = 1; i <= 10; i++) {
			// Pedir número
			System.out.print("Introduce un número: ");
			num = scan.nextInt();
			
			if (num < 0) contadorNegativos++; 
		}
		
		scan.close();
		
		// Imprimir cuantos números negativos hay o si no ha habido.
		if (contadorNegativos > 0) {
			System.out.printf("Se han introducido %d números negativos.", contadorNegativos);
		} else {
			System.out.println("No se ha introducido ningún número negativo.");
		}
	}
}
