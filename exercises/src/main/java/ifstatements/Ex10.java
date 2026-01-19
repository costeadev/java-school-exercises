package ifs;

import java.util.Scanner;

/*
 * Realizar un programa que lea tres longitudes y determine si forman o no un triángulo. 
 * Si es un triángulo, determinar de qué tipo de triángulo se trata entre: 
 * equilátero (si tiene tres lados iguales), 
 * isósceles (si tiene dos lados iguales) 
 * o escaleno (si tiene tres lados desiguales). 
 * Considerar que para formar un triángulo se requiere que: "el lado mayor sea menor que la suma de los otros dos lados".
 */

public class Ex10 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("--- MOSTRAR TIPO DE TRIBANGULO");
		
		System.out.print("Longitud lado 1: ");
		double side1 = scan.nextDouble();

		System.out.print("Longitud lado 2: ");
		double side2 = scan.nextDouble();

		System.out.print("Longitud lado 3: ");
		double side3 = scan.nextDouble();
	
		// Find out biggest side
		double biggest = side1;
		if (side2 > biggest) biggest = side2;
		if (side3 > biggest) biggest = side3;
		
		// Check if it's a valid triangle
		if (biggest >= (side1 + side2 + side3 - biggest)) {
			System.err.println("ERROR: Los lados no forman un triangulo >:C");
			return;
		}
		
		// Check the triangle type
		String triangleType;
		if (side1 == side2 && side2 == side3) {
			triangleType = "equilatero";
		} else if (side1 == side2 || side1 == side3 || side2 == side3) {
			triangleType = "isóscles";
		} else {
			triangleType = "escaleno";
		}
		
		System.out.printf("El triángulo es un triangulo %s", triangleType);

		scan.close();
	}
}
