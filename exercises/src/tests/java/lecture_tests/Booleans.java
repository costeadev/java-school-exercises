package lecture_tests;

import java.util.Scanner;

public class Booleans {
	public static void main(String[] args) {
		
		// Lectura por teclado
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Dime tu nota: ");
		int notaExamen = scan.nextInt();

		System.out.print("Dime tu nota de la recuperación: ");
		int notaRecuperacion = scan.nextInt();
		
		scan.close();
		
		// Está aprobado si la nota es mayor o igual que 5 o la media es mayor o igual que 5
		boolean estaAprobado = notaExamen >= 5 | (notaExamen + notaRecuperacion)/2 >= 5;
		
		// Si está suspenso y no se ha presentado a la recu (-1), se manda aviso
		boolean avisoNecesario = notaExamen <= 5 && notaRecuperacion == -1; 

		System.out.println((notaExamen + notaRecuperacion)/2);
		System.out.println("Está aprobado?: " + estaAprobado);
		System.out.println("Hay que avisar a los papis?: " + avisoNecesario);
		
	}
}
