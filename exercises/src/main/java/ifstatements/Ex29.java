package ifstatements;

import java.util.Scanner;

/*
 * Pedir dos fechas y mostrar el número de días que hay de diferencia. 
 * Suponiendo todos los meses de 30 días.
 */

public class Ex29 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("FECHA 1");
		System.out.println("-------------------------------");

		System.out.print("Dia: ");
		int day1 = scan.nextInt();

		System.out.print("Mes: ");
		int month1 = scan.nextInt();

		System.out.print("Año: ");
		int year1 = scan.nextInt();

		System.out.println("\nFECHA 2");
		System.out.println("-------------------------------");

		System.out.print("Dia: ");
		int day2 = scan.nextInt();

		System.out.print("Mes: ");
		int month2 = scan.nextInt();

		System.out.print("Año: ");
		int year2 = scan.nextInt();

		boolean validDate1 = isValidDate(day1, month1, year1);
		boolean validDate2 = isValidDate(day2, month2, year2);
		
		// Calculate the difference between each date
		int total1 = (year1 * 12 * 30) + (month1 * 30) + day1;
		int total2 = (year2 * 12 * 30) + (month2 * 30) + day2;
		int diferencia = Math.abs(total1 - total2);
		
		System.out.printf("%nEntre el %d-%d-%d y el %d-%d-%d hay %d días de diferencia", day1, month1, year1, day2, month2, year2, diferencia);

		scan.close();
	}

	public static boolean isValidDate(int day, int month, int year) {
		if (day < 1 || day > 30 || month < 1 || month > 12 || year < 0) {
			return false;
		}
		else {
			return true;
		}
	}
}
