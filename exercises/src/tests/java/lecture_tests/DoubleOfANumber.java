package lecture_tests;

import java.util.Scanner;

/* Programa que calcule y muestre por consola,
 * el doble de un número entero,
 * introducido por el usuario usando el teclado*/
public class DoubleOfANumber {
    public static void main(String[] args) {
    	Scanner scanner = new Scanner(System.in);
    	
    	System.out.print("Escribe un número: ");
    	int num = scanner.nextInt();
    	   	
    	int dobleNum = num * 2;
    	
    	System.out.println("El doble de " + num + " es: " + dobleNum);
    	
    	scanner.close();
    }
}