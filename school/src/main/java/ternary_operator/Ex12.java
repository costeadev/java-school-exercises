package ternary_operator;

import java.util.Scanner;

/*
 * Crea un programa que lea por teclado 
 * una variable entera para representar 
 * la cantidad de unidades vendidas de un producto 
 * y otra variable double para representar el precio unitario.
 * Calcula y muestra el monto total de ventas.
 */

public class Ex12 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Introduce la cantidad de unidades vendidas: ");
		int unidadesVendidas = scan.nextInt();
		
		System.out.print("Introduce el precio por unidad: ");
		double precioPorUnidad = scan.nextDouble();
		
		scan.close();
		
		double beneficioTotal = unidadesVendidas * precioPorUnidad;
		System.out.printf("Hay un beneficio total de %.2f€", beneficioTotal);
	}
}
