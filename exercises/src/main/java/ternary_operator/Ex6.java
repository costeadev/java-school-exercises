package ternary_operator;

import java.util.Scanner;

/*
 * Diseña un programa que lea por teclado 
 * una variable entera para representar 
 * la cantidad de productos en stock.
 * Luego, pide al usuario que ingrese una cantidad 
 * y muestra un mensaje que diga “hay suficiente stock:” 
 * seguido de true si es verdad o false si no lo es
 */

public class Ex6 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Introduce el stock que hay: ");
		int stock = scan.nextInt();
		
		System.out.print("Introduce las unidades de productos deseados: ");
		int unidadesDeseadas = scan.nextInt();
		
		scan.close();
		
		boolean hayStock = stock >= unidadesDeseadas;
		System.out.printf("Hay suficiente stock: %b", hayStock);
	}
}
