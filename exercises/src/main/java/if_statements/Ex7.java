package if_statements;

import java.util.Scanner;

/*
 * Crear un programa que lea 3 numeros
 * y muestre cual es el mayor
 */

public class Ex7 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("--- ENCONTRAR EL MAYOR DE 3 NUMEROS ---");
		
		System.out.print("Introduce un número: ");
		int num1 = scan.nextInt();
		
		System.out.print("Introduce otro número: ");
		int num2 = scan.nextInt();
		
		System.out.print("Introduce OTRO número: ");
		int num3 = scan.nextInt();
		
		int biggest = num1;
		if (num2 > biggest) biggest = num2;
		if (num3 > biggest) biggest = num3;
		
		System.out.printf("El mayor es %d", biggest);

		scan.close();
	}
}
