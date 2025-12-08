package if_statements;

import java.util.Scanner;

/*
 * 28.	Ídem que el ej. anterior, 
 *      suponiendo que cada mes tiene un número distinto de días (suponer que febrero tiene siempre 28 días). 
 */

public class Ex28 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Introduce el día: ");
		int dia = scan.nextInt();
		
		System.out.print("Introduce el mes: ");
		int mes = scan.nextInt();
		
		System.out.print("Introduce el año: ");
		int anyo = scan.nextInt();
		
		scan.close();
		
		
		// Check if the date is valid
		boolean esCorrecta = true;
		if (dia < 1 || mes < 1 || mes > 12 || anyo < 0) esCorrecta = false;
		
		// Days per month
		int diasMes;
		switch (mes) {
			case 4: case 6: case 9: case 11:
				diasMes = 30;
				break;
			case 2:
				diasMes = 28;
				break;
			default:
				diasMes = 31;
				break;
		}
		
		 if (dia > diasMes) esCorrecta = false;
		 if (!esCorrecta) {
			 System.err.print("Error: Fecha no válida");
			 return;
		 }
		 
		 // Calculate next day
		 dia++;
		 if (dia > diasMes) {
			 dia = 1;
			 mes++;
			 if (mes > 12) {
				 mes = 1;
				 anyo++;
			 }
		 }
		
		
		System.out.printf("%nEl día SIGUIENTE sería el %02d-%02d-%d", dia, mes, anyo);
	}
}
