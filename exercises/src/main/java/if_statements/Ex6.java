package if_statements;

/*
 * Realizar un programa que lea dos números y los muestre ordenados de menor a mayor.
 */

import java.util.Scanner;

public class Ex6 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("--- ORDENAR 2 NUMEROS DE MENOR A MAYOR ---");
		
		System.out.print("Número 1: ");
		int num1 = scan.nextInt();
		
		System.out.print("Número 2: ");
		int num2 = scan.nextInt();
		
		int smallest = (num1 < num2) ? num1 : num2;
		int biggest = (num1 > num2) ? num1 : num2;
		
		System.out.printf("%d %d", smallest, biggest);

		scan.close();
	}
}
