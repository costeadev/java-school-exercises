package if_statements;

import java.util.Scanner;

/*
 * Recibe tres letras minúsculas y un int n 
 * Sustituye cada char con el char equivalente del alfabeto 
 * que se encuentra n posiciones después(si acaba el alfabeto, empieza desde el principio)
 * Por ejemplo si recibe ‘a’ ‘b’ ‘c’ 2 
 * a --> 2 --> c
 * b --> 2 --> d
 * c --> 2 --> e
 */

public class Ex19ChatGPT {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Introduce una letra minúscula: ");
		String input1 = scan.next();
		char char1 = input1.charAt(0);
		
		System.out.print("Introduce otra letra minúscula: ");
		String input2 = scan.next();
		char char2 = input2.charAt(0);
		
		System.out.print("Introduce OTRA letra minúscula: ");
		String input3 = scan.next();
		char char3 = input3.charAt(0);
		
		
		int jumps = 0;
		System.out.print("Introduce un número entero POSITIVO: ");
		
		// Comprobamos que 'jumps' sea un Int válido
		if (scan.hasNextInt()) {
			
			jumps = scan.nextInt();
			
			// En caso de que sea mayor que (Integer.MAX_VALUE - 122), mostramos un error
		     if (jumps > Integer.MAX_VALUE - 122) {
		        System.err.println("ERROR: El número es demasiado grande (máx permitido: " + (Integer.MAX_VALUE - 122) + ")");
		        return;
		    }
		// En caso de que no lo sea
		} else {
			System.err.println("ERROR: El número es demasiado grande");
			return;
		}
		
		scan.close();

		
		
		// Input validation (Comprobamos que el número sea un char ASCII mínuscula y que no sea negativo
		if (jumps < 0) {
			System.err.println("ERROR: El número debe ser positivo.");
		}
		boolean validLowercase = (char1 >= 97 && char1 <= 122) && (char2 >= 97 && char2 <= 122) && (char3 >= 97 && char3 <= 122);
		if (!validLowercase) {
			System.err.println("ERROR: Valor no válido, deben ser letras minúsculas de (a-z)");
			return;
		}
		//               100   +  50  = 150 2 * 26 = 52   150- 52 = 98
		// 97-122 26 letras (0 veces)
		// 123-148 26 letras (1 vez)
		// 149-174 26 letras (2 veces)
		int newChar1 = ((char1 + jumps - 'a') % 26) + 'a';
		int newChar2 = ((char2 + jumps - 'a') % 26) + 'a';
		int newChar3 = ((char3 + jumps - 'a') % 26) + 'a';
		
		// PRINT
		System.out.printf("%c --> %d --> %c", char1, jumps, newChar1);
		System.out.printf("%c --> %d --> %c", char2, jumps, newChar2);
		System.out.printf("%c --> %d --> %c", char3, jumps, newChar3);
		
	}
}
