package if_statements;

import java.util.Scanner;

/*
 * Pedir una nota de 0 a 10 y mostrarla de la forma: Insuficiente, Suficiente, Bien...
 */

public class Ex24 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("--- TRANSFORMAR NOTA DE NUMERO A PALABRA ---");
		
		System.out.print("Introduce una nota del 0 al 10: ");
		double nota = scan.nextDouble();

		if (nota < 0 || nota > 10) {System.err.print("Error: Valor inválido"); return;}
		
		// Truncate decimals
		nota = Math.floor(nota * 100) / 100;

		String notaTexto;
		if (nota < 5) notaTexto = "Insuficiente";
		else if (nota < 6) notaTexto = "Suficiente";
		else if (nota < 7) notaTexto = "Bien";
		else if (nota < 9) notaTexto = "Notable";
		else notaTexto = "Sobresaliente";

		System.out.printf("%.2f - %s", nota, notaTexto);

		scan.close();
	}
}
