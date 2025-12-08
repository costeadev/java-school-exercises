package ternary_operator;

import java.util.Scanner;

/*
 * Crea un programa que lea por teclado 
 * tres variables enteras para representar 
 * las edades de tres personas. 
 * Muestra en pantalla un mensaje que indique 
 * si al menos dos de ellas son mayores de 21 años

 */

public class Ex21 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Introduce la edad de la persona 1: ");
		int edad1 = scan.nextInt();
		
		System.out.print("Introduce la edad de la persona 2: ");
		int edad2 = scan.nextInt();
		
		System.out.print("Introduce la edad de la persona 3: ");
		int edad3 = scan.nextInt();
		
		scan.close();
		
		boolean edadesValidas = (edad1 > 0 && edad1 < 130) &&
								(edad2 > 0 && edad2 < 130) && 
								(edad3 > 0 && edad3 < 130);
		
		String mensaje = !edadesValidas ?
				"Edad no válida"
				: ((edad1 >= 21 && edad2 >= 21) ||
				   (edad1 >= 21 && edad3 >= 21) || 
				   (edad2 >= 21 && edad3 >= 21))
				    ? "Al menos 2 personas son mayores de 21"
				    : "No hay por lo menos 2 personas mayores de 21";
				
		System.out.println(mensaje);
	}
}
