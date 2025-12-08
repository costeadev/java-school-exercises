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
		
		System.out.print("Introduce un número: ");
		double num1 = scan.nextDouble();
		
		System.out.print("Introduce otro número: ");
		double num2 = scan.nextDouble();
		
		System.out.print("Introduce OTRO número: ");
		double num3 = scan.nextDouble();
		
		scan.close();
		
		
		double promedio = (num1 + num2 + num3)/3;
		System.out.printf("El promedio de %.2f, %.2f y %.2f es %.2f", num1, num2, num3, promedio);
	}
}
