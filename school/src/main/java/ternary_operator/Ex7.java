package ternary_operator;

import java.util.Scanner;

/*
 * Escribe un programa que lea por teclado 
 * dos variables de tipo double para representar
 * el precio de un artículo y el porcentaje de descuento.
 * Calcula el precio con descuento 
 * y muestra el resultado en pantalla.
 */

public class Ex7 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Introduce el precio del artículo: ");
		double precioArticulo = scan.nextDouble();
		
		System.out.print("Introduce el porcentaje de descuento del artículo (0-100): ");
		double descuentoArticulo = scan.nextDouble();
		
		scan.close();
		
		double precioFinal = precioArticulo * (1.0 - descuentoArticulo / 100.0);
		System.out.printf("El precio final es: %.2f€", precioFinal);
	}
}
