package if_statements;

/*
 * Realizar un programa que lea dos números y los muestre ordenados de menor a mayor.
 */

import java.util.Scanner;

public class Ex6 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Introduce un número: ");
		int num1 = scan.nextInt();
		
		System.out.print("Introduce otro número: ");
		int num2 = scan.nextInt();
		
		scan.close();
		
		int smaller = (num1 < num2) ? num1 : num2;
		int bigger =  (num1 > num2) ? num1 : num2;
		
		System.out.printf("%d %d", smaller, bigger);
	}
}
