package ternary_operator;

import java.util.Scanner;

/*
 * Crea un programa que lea por teclado
 * dos variables enteras para representar 
 * las edades de dos personas. 
 * Muestra en pantalla un mensaje que indique 
 * “Pueden acceder” o no. 
 * El acceso es permitido a personas de mayor de 18 
 * o a personas mayores de 21 que acompañen a un menor de edad.
 */

public class Ex24 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Introduce edad 1: ");
		int edad1 = scan.nextInt();
		
		System.out.print("Introduce edad 2: ");
		int edad2 = scan.nextInt();
		
		scan.close();
		
		boolean edadesValidas = edad1 > 0 && edad2 > 0;
		
		String mensaje = !edadesValidas ? "La edad no es valida":
						 ((edad1 >= 18) && (edad2 >= 18) ||
						  (edad1 >= 21) && (edad2 < 18) || 
						  (edad1 < 18) && (edad2 >= 21)) 
						   ? "pueden acceder"
						   : "no pueden acceder"; 
						     
							
		System.out.printf("Teniendo %d y %d años, %s",edad1, edad2, mensaje);
	}
}
