package if_statements;

import java.util.Scanner;

/*
 * Pedir una nota numérica entera entre 0 y 10,
 * y mostrar dicha nota de la forma: cero, uno, dos, tres... 
 */

public class Ex30 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Introduce una nota: ");
		int nota = scan.nextInt();
		
		scan.close();
		
		
		// Input validation
		if (nota < 0 || nota > 10) {
			System.err.println("Error: Valor no válido");
			return;
		}
		
		// Tranform from number to text
		String notaTexto = "";
		switch(nota) {
		case 0:
			notaTexto = "cero";
			break;
		case 1:
			notaTexto = "uno";
			break;
		case 2:
			notaTexto = "dos";
			break;
		case 3:
			notaTexto = "tres";
			break;
		case 4:
			notaTexto = "cuatro";
			break;
		case 5:
			notaTexto = "cinco";
			break;
		case 6:
			notaTexto = "seis";
			break;
		case 7:
			notaTexto = "siete";
			break;
		case 8:
			notaTexto = "ocho";
			break;
		case 9:
			notaTexto = "nueve";
			break;
		case 10:
			notaTexto = "diez";
			break;
		}
		
		System.out.printf("%d = %s", nota, notaTexto);
	}
}
