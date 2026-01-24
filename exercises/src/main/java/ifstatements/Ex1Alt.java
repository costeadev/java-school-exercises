package ifstatements;

import java.util.Scanner;

/*
 * Realizar un programa que dados dos números enteros leídos por teclados,
 * diga si alguno de los dos es múltiplo del otro.
 */

public class Ex1Alt {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("--- COMPROBAR SI UN NUMERO ES MULTIPLO DE OTRO ---");

		System.out.print("Número 1: ");
		int num1 = scan.nextInt();
		
		System.out.print("Número 2: ");
		int num2 = scan.nextInt();
		
		// Asumir que num1 es mayor y num2 menor
		int biggest = num1;
		int smallest = num2;

		// En caso de que num2 sea mayor, los intercambiamos
		if (num2 > num1){
			biggest = num2;
			smallest = num1;
		}
		
		// Comprobamos si el número mayor es múltiplo del menor
		if (biggest % smallest == 0) {
			System.out.printf("\n%d es múltiplo de %d", biggest, smallest);
		} else {
			System.out.printf("\n%d no es múltiplo de %d", biggest, smallest);
		}

		scan.close();
	}
}
