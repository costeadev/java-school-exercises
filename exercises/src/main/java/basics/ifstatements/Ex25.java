package basics.ifstatements;

import java.util.Scanner;

/*
 * Pedir el día, mes y año de una fecha e indicar si la fecha es correcta. 
 * Suponiendo todos los meses de 30 días.
 */
public class Ex25 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("--- COMPROBAR SI UNA FECHA ES CORRECTA ---");
		
		System.out.print("Día: ");
		int day = scan.nextInt();
		
		System.out.print("Mes: ");
		int month = scan.nextInt();
		
		System.out.print("Año: ");
		int year = scan.nextInt();

		boolean validDate = true;
		if (day < 1 || day > 30) validDate = false;
		if (month < 1 || month > 12) validDate = false;
		if (year < 0) validDate = false;
		
		System.out.printf(
				"\nLa fecha %d-%d-%d es correcta?: %s",
				day, month, year, (validDate) ? "Si" : " No"
		);

		scan.close();
	}
}
