package ternary_operator;

import java.util.Scanner;

/*
 * Diseña un programa que lea por teclado 
 * dos variables enteras 
 * y muestre en pantalla 
 * el valor de la variable con el mayor número.
 * (SOLO USANDO OPERADOR TERNARIO)
 */

public class Ex13 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("--- COMPROBAR MAYOR DE DOS NUMEROS ---");
		
		System.out.print("Número 1: ");
		int num1 = scan.nextInt();
		
		System.out.print("Número 2: ");
		int num2 = scan.nextInt();

		System.out.printf("El número mayor es: %d", num1 > num2 ? num1 : num2);

		scan.close();
	}
}
