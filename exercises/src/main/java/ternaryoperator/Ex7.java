package ternaryoperator;

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

		System.out.println("--- CALCULAR DESCUENTO EN UN ARTICULO ---");
		
		System.out.print("Introduce el precio del artículo: ");
		double precio = scan.nextDouble();
		
		System.out.print("Introduce el porcentaje de descuento del artículo (0-100): ");
		double porcentajeDescuento = scan.nextDouble();
		
		double precioFinal = precioConDescuento(precio, porcentajeDescuento);
		System.out.printf("El precio final es: %.2f€", precioFinal);

		scan.close();
	}

	public static double precioConDescuento(double precio, double porcentajeDescuento) {
		return precio * (1 - porcentajeDescuento / 100);
	}
}
