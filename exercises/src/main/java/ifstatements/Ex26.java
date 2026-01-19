package ifs;

import java.util.Scanner;

/*
 * Pedir el día, mes y año de una fecha e indicar si la fecha es correcta. 
 * Con meses de 28, 30 y 31 días y sin años bisiestos. 
 */

public class Ex26 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("--- COMPROBAR SI LA FECHA ES CORRECTA ---");
		
		System.out.print("Introduce el día: ");
		int day = scan.nextInt();
		
		System.out.print("Introduce el mes: ");
		int month = scan.nextInt();
		
		System.out.print("Introduce el año: ");
		int year = scan.nextInt();

		boolean validDate = true;

		if (day < 1) validDate = false;
		if (month < 1 || month > 12) validDate = false;
		if (year < 0) validDate = false;

		switch(month) {
		case 4: case 6: case 9: case 11:
			if (day > 30) validDate = false; break;
		case 1: case 3: case 5: case 7: case 8: case 10: case 12:
			if (day > 31) validDate = false; break;
		case 2:
			if (day > 28) validDate = false; break;
		}

		System.out.printf("%nLa fecha %d-%d-%d%s es correcta", day, month, year, validDate ? "" : " NO");

		scan.close();
	}
}
