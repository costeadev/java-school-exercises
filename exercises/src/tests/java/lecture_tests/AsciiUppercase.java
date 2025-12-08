package lecture_tests;

import java.util.Scanner;

// Programa que lea 2 char
// Y te diga si el segundo 
// es el primero en mayúsculas
//Si no lo es, te dira cual es la mayuscula del primero
public class AsciiUppercase {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Introduce un carácter: ");
		char char1 = scan.next().charAt(0);
		
		System.out.print("Introduce otro carácter: ");
		char char2 = scan.next().charAt(0);
		
		
		scan.close();
		
		boolean charValido = char1 >= 97 && char1 <= 122 || char2 >= 97 && char2 <= 122;
		
		String comprobarChar = !charValido ? "Caracter no valido" : char1 - char2 == 32 ? (char2 + " es " + char1 + " pero en mayúsculas") : "La mayúscula de " + char1 + " es " + (char)((char1 - 32)) ; 
		
		System.out.printf(comprobarChar);
	}
}
