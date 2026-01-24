package basics.forloops;

import java.util.Scanner;

/*
 * Un número perfecto es un entero positivo
 * igual a la suma de sus divisores (exceptuando como divisor al propio número). 
 * Escriba un programa que acepte un entero positivo y determine si es un número perfecto. 
 */

public class Ex22Optimized {
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
		int sumaDivisores = 1;
		for (int i = 2; i <= Math.sqrt(num); i++) {
			
			/* Añadir divisores desde 2 hasta √num  Ej: √28 = 5 Desde 2 hasta 5: 2 y 4 son los unicos múltiplos.*/ 
			if (num % i == 0) {
				sumaDivisores += i;
				
				/* Añadir divisores por encima de √num * Ej: √28 = 5 Desde 5 hasta 28: 7 y 14 son los únicos mútliplos
				 * Porque realmente, (7 = 28/4) y  (14 = 28/2) Para ahorrarnos iterar desde 2 hasta 14, hacemos este calculo */ 
				int pareja = num / i;
				if (i != pareja) { // Añade 'pareja' cuando se diferente a 'i' Ej: (i = 6) (num = 36) (pareja = 36/6 = 6) Evita añadir 6 una vez como divisor y otra vez como pareja.
					sumaDivisores += pareja; 	             
				}
			}
		}
		
		
		// Comprobar si el numero es perfecto.
		boolean esPerfecto = false;
		if (sumaDivisores == num) esPerfecto = true;
		
		// Imprimir con formato bonito
		System.out.printf("El número %d %s perfecto", num, esPerfecto ? "es" : "NO es");
	}
}
