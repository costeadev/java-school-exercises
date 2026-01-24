package forloops;

import java.util.Scanner;

/*
 * Programa que dado un número entero
 * lo exprese en el sistema de numeración romano. 
 */
public class Ex27 {
	public static void main(String[] args) {
		
		// Entrada de usuario
		Scanner scan = new Scanner(System.in);
		int num;
		
		do {
			System.out.print("Introduce un número (1-3999): ");
			num = scan.nextInt();
			if (num < 1 || num > 3999) {
				System.err.println("El número está fuera del rango válido\n");
			}
		} while (num < 1 || num > 3999);
		scan.close();
		
		// Separar el número según sus dígitos
		int millares = num / 1000;
		int centenas = num % 1000 / 100;
		int decenas = num % 100 / 10;
		int unidades = num % 10;
		
		
		// Quedaría más bonito con arrays pero me voy a limitar usar switches lol
		
		switch (millares) {
		case 1:
			System.out.print("M");
			break;
		case 2:
			System.out.print("MM");
			break;
		case 3:
			System.out.print("MMM");
			break;
		}
		
		switch (centenas) {
		case 1:
			System.out.print("C");
			break;
		case 2:
			System.out.print("CC");
			break;
		case 3:
			System.out.print("CCC");
			break;
		case 4:
			System.out.print("CD");
			break;
		case 5:
			System.out.print("D");
			break;
		case 6:
			System.out.print("DC");
			break;
		case 7:
			System.out.print("DCC");
			break;
		case 8:
			System.out.print("DCCC");
			break;
		case 9:
			System.out.print("CM");
			break;
		}
		
		switch (decenas) {
		case 1:
			System.out.print("X");
			break;
		case 2:
			System.out.print("XX");
			break;
		case 3:
			System.out.print("XXX");
			break;
		case 4:
			System.out.print("XL");
			break;
		case 5:
			System.out.print("L");
			break;
		case 6:
			System.out.print("LX");
			break;
		case 7:
			System.out.print("LXX");
			break;
		case 8:
			System.out.print("LXXX");
			break;
		case 9:
			System.out.print("XC");
			break;
		}
		
		switch (unidades) {
		case 1:
			System.out.print("II");
			break;
		case 2:
			System.out.print("II");
			break;
		case 3:
			System.out.print("III");
			break;
		case 4:
			System.out.print("IV");
			break;
		case 5:
			System.out.print("V");
			break;
		case 6:
			System.out.print("VI");
			break;
		case 7:
			System.out.print("VII");
			break;
		case 8:
			System.out.print("VIII");
			break;
		case 9:
			System.out.print("IX");
			break;
		}
	}
}
