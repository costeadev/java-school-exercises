package ifstatements;

import java.util.Scanner;
/*
 * Recibir 4 números e indicar el más pequeño y el más grande
 */

public class Ex11 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("--- INDICAR MENOR Y MAYOR DE 4 NUMEROS ---");
		
		System.out.print("Introduce un número: ");
		int num1 = scan.nextInt();
		
		System.out.print("Introduce otro número: ");
		int num2 = scan.nextInt();
		
		System.out.print("Introduce OTRO número: ");
		int num3 = scan.nextInt();
		
		System.out.print("Introduce OTRO número más: ");
		int num4 = scan.nextInt();
		
		int biggest = num1;
		if (num2 > biggest) biggest = num2;
		if (num3 > biggest) biggest = num3;
		if (num4 > biggest) biggest = num4;
		
		int smallest = num1;
		if (num2 < smallest) smallest = num2;
		if (num3 < smallest) smallest = num3;
		if (num4 < smallest) smallest = num4;
		
		System.out.printf("Más grande: %d%nMás pequeño: %d%n", biggest, smallest);

		scan.close();
	}
}
