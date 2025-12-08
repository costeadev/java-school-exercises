package ternary_operator;

import java.util.Scanner;

/*
 * Escribe un programa que lea por teclado 
 * dos variables de tipo double 
 * y muestre en pantalla el resultado de la resta de ambas,
 * pero asegurándote de que el resultado nunca sea negativo.
 */

public class Ex15 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Introduce un numerín: ");
		double num1 = scan.nextDouble();
		
		System.out.print("Introduce otro numerín: ");
		double num2 = scan.nextDouble();
		
		scan.close();
		
		double resta = (num1 - num2) > 0 ? (num1 - num2) : (num2 - num1);
		System.out.printf("El resultado de la resta es: %.2f", resta);
	}
}
