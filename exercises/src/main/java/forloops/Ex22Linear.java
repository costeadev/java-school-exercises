package for_loops;

import java.util.Scanner;

/*
 * Un número perfecto es un entero positivo
 * igual a la suma de sus divisores (exceptuando como divisor al propio número). 
 * Escriba un programa que acepte un entero positivo y determine si es un número perfecto. 
 */

public class Ex22Linear {
	public static void main(String[] args) {
		
		// Entrada del usuario
		Scanner scan = new Scanner(System.in);
		int num;
		
		// Pedir número hasta que sea positivo
		do {
			System.out.print("Introduce un número entero positivo: ");
			num = scan.nextInt();
			if (num <= 0) {
				System.err.println("Número no válido. Debe ser un entero positivo");
			}
		} while (num <= 0);
		
		scan.close();
		
		// Calcular la suma de todos los divisores de 'num'
		int sumaDivisores = 0;
		for (int i = 1; i <= num / 2; i++) {
			if (num % i == 0) sumaDivisores += i; 
		}
		
		// Comprobar si el numero es perfecto.
		boolean esPerfecto = false;
		if (sumaDivisores == num) esPerfecto = true;
		
		// Imprimir con formato bonito
		System.out.printf("El número %d %s perfecto", num, esPerfecto ? "es" : "NO es");
	}
}
