package ternary_operator;

import java.util.Scanner;

/*
 * Escribe un programa que lea por teclado 
 * dos variables enteras para representar 
 * la cantidad de productos en dos almacenes diferentes.
 * Muestra en pantalla un mensaje que indique 
 * cuál de los dos almacenes tiene más productos.
 */

public class Ex16 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Introduce el total de productos en el Almacén 1: ");
		int almacen1 = scan.nextInt();
		
		System.out.print("Introduce el total de productos en el Almacén 2: ");
		int almacen2 = scan.nextInt();
		
		scan.close();
		
		String almacenMas = almacen1 == almacen2 ? "Misma cantidad" : almacen1 > almacen2 ? "Almacén 1 tiene más productos" : "Almacén 2 tiene más productos";
		System.out.printf(almacenMas);
	}
}
