package ternary_operator;

import java.util.Scanner;

/*
 * Crea un programa que lea por teclado 
 * tres variables de tipo doble (números decimales) 
 * y calcule su promedio. 
 * Luego, muestra el resultado en la pantalla
 */

public class Ex2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("--- CALCULAR PROMEDIO DE 3 NÚMEROS ---");
		
		System.out.print("Número 1: ");
		double num1 = scan.nextDouble();
		
		System.out.print("Número 2: ");
		double num2 = scan.nextDouble();
		
		System.out.print("Número 3: ");
		double num3 = scan.nextDouble();

		double avg = average(num1, num2, num3);

		System.out.printf("\nNúmeros: {%.2f, %.2f, %.2f}\n", num1, num2, num3);
		System.out.printf("Promedio: %.2f", avg);

		scan.close();
	}

	public static double average(double a, double b, double c) {
		return (a + b + c) / 3;
	}
}
