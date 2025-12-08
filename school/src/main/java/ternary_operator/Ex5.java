package ternary_operator;

import java.util.Scanner;

/*
 * Escribe un programa que lea por teclado 
 * dos variables enteras para representar
 *  el ancho y la altura de un rectángulo.
 *  Calcula y muestra el área del rectángulo en pantalla.
 */

public class Ex5 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Introduce el ancho del rectángulo: ");
		int anchoRectangulo = scan.nextInt();
		
		System.out.print("Introduce el ancho del rectángulo: ");
		int alturaRectangulo = scan.nextInt();
		
		scan.close();
		
		int areaRectangulo = anchoRectangulo * alturaRectangulo;
		System.out.printf("El área del rectángulo es: %d", areaRectangulo);
	}
}
