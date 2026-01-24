package basics.ifstatements;

import java.util.Scanner;

/*
 * 28.	Ídem que el ej. anterior, 
 *      suponiendo que cada mes tiene un número distinto de días (suponer que febrero tiene siempre 28 días). 
 */

public class Ex28 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("--- COMPROBAR SI UNA FECHA ES CORRECTA ---");
		
		System.out.print("Introduce el día: ");
		int day = scan.nextInt();
		
		System.out.print("Introduce el mes: ");
		int month = scan.nextInt();
		
		System.out.print("Introduce el año: ");
		int year = scan.nextInt();

		boolean validDate = true;
		if (day < 1 || month < 1 || month > 12 || year < 0) validDate = false;
		
		// Days per month
		int monthDays;
		switch (month) {
			case 4: case 6: case 9: case 11:
				monthDays = 30;
				break;
			case 2:
				monthDays = 28;
				break;
			default:
				monthDays = 31;
				break;
		}
		
		 if (day > monthDays) validDate = false;
		 if (!validDate) {
			 System.err.print("Error: Fecha no válida");
			 return;
		 }
		 
		 // Calculate next day
		 day++;
		 if (day > monthDays) {
			 day = 1;
			 month++;
			 if (month > 12) {
				 month = 1;
				 year++;
			 }
		 }

		System.out.printf("%nEl día SIGUIENTE sería el %02d-%02d-%d", day, month, year);

		scan.close();
	}
}
