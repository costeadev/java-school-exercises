package ternary_operator;

import java.util.Scanner;

/*
 * Escribe un programa en Java 
 * que lea por teclado dos variables enteras 
 * y muestre su suma en pantalla
 */

public class Ex1 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Introduce un número: ");
		int num1 = scan.nextInt();
		
		System.out.print("Introduce otro número: ");
		int num2 = scan.nextInt();
		
		scan.close();
		
		
		int suma = num1 + num2;
		System.out.printf("%d + %d = %d", num1, num2, suma);
	}
}
