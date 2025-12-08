package if_statements;

import java.util.Scanner;

/*Pedir una nota de 0 a 10 y mostrarla de la forma: Insuficiente, Suficiente, Bien...*/

public class Ex24 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Introduce una nota del 0 al 10: ");
		double nota = scan.nextDouble();
		
		scan.close();
		
		// Input validation
		if (nota < 0 || nota > 10) {System.err.print("Error: Valor inválido"); return;}
		
		// Truncate decimals
		nota = Math.floor(nota * 100) / 100;
		
		// Convert grade to their respective text
		String notaTexto;
		if (nota < 5) notaTexto = "Insuficiente";
		else if (nota < 6) notaTexto = "Suficiente";
		else if (nota < 7) notaTexto = "Bien";
		else if (nota < 9) notaTexto = "Notable";
		else notaTexto = "Sobresaliente";
		
		// Print
		System.out.printf("%.2f - %s", nota, notaTexto);
	}
}
