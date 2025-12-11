package ternary_operator;

import java.util.Scanner;

/*
 * Escribe un programa que lea de teclado
 * tres variables de tipo double para representar 
 * las longitudes de los lados de un triángulo. 
 * Muestra en pantalla si el triángulo 
 * es equilátero, isósceles o escaleno
 */

public class Ex26 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Longitud lado 1: ");
		double lado1 = scan.nextDouble();
		
		System.out.print("Longitud lado 2: ");
		double lado2 = scan.nextDouble();
		
		System.out.print("Longitud lado 3: ");
		double lado3 = scan.nextDouble();
		
		boolean medidasValidas =
				(lado1 > 0 && lado2 > 0 && lado3 > 0) &&
				(lado1 + lado2 > lado3) &&				
				(lado1 + lado3 > lado2) &&
				(lado2 + lado3 > lado1);
		
		String mensaje = !medidasValidas
				? "Las medidas no son válidas"
				: (lado1 == lado2 && lado2 == lado3)
					? "Equilátero"
					: (lado1 == lado2 || lado1 == lado3 || lado2 == lado3)
						? "Isósceles"
						: "Escaleno";

		System.out.println(mensaje);

		scan.close();
	}
}
