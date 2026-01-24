package basics.ternaryoperator;

import java.util.Scanner;

/*
 * Escribe un programa que lea por teclado 
 * tres variables enteras para representar las horas trabajadas en tres días diferentes. 
 * Muestra en pantalla un mensaje que indique 
 * si la persona trabajó entre 8 y 20 horas en los tres días o no.
 */

public class Ex23 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Horas trabajadas dia 1: ");
		int horasDia1 = scan.nextInt();
		
		System.out.print("Horas trabajadas dia 2: ");
		int horasDia2 = scan.nextInt();
		
		System.out.print("Horas trabajadas dia 3: ");
		int horasDia3 = scan.nextInt();
		
		int horasTotales = horasDia1 + horasDia2 + horasDia3;
		
		boolean jornadaLegal = (horasDia1 >= 8 && horasDia1 <= 20) &&
							   (horasDia2 >= 8 && horasDia2 <= 20) &&
							   (horasDia3 >= 8 && horasDia3 <= 20);
		
		String resultado = jornadaLegal
				? "Se han trabajado entre 8 y 20 horas"
				: "No se trabaja lo indicado";
		
		System.out.printf("%s (%d horas trabajadas en 3 días)", resultado, horasTotales);

		scan.close();
	}
}
