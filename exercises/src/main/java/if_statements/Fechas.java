package if_statements;

import java.util.Scanner;

public class Fechas {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Introduce una fecha con formato (dd-mm-yyyy): ");
		String fecha = scan.nextLine();
		
		scan.close();
		
		// Input checking
		if (fecha.length() != 10 || fecha.charAt(2) != '/' || fecha.charAt(5) != '/') {
			System.err.println("Fecha no válida.");
			System.exit(1);
		}
		
		// Assign every char to variables for day, month and year
		char d1 = fecha.charAt(0), d2 = fecha.charAt(1);
		char m1 = fecha.charAt(3), m2 = fecha.charAt(4);
		char a1 = fecha.charAt(6), a2 = fecha.charAt(7), a3 = fecha.charAt(8), a4 = fecha.charAt(9);
		
		// Check that all the chars are numeric digits
		boolean allDigits = 
				(d1 >= '0' && d1 <= '9') && (d2 >= '0' && d2 <= '9') &&
				(m1 >= '0' && m1 <= '9') && (m2 >= '0' && m2 <= '9') &&
				(a1 >= '0' && a1 <= '9') && (a2 >= '0' && a2 <= '9') &&
				(a3 >= '0' && a3 <= '9') && (a4 >= '0' && a4 <= '9');
		
		if (!allDigits) {
			System.err.println("Fecha no válida: contiene carácteres no númericos");
			System.exit(1);
		}
		
		// Convert char into int by multiplying tens * 10 and so on.
		int dia = (d1 - '0') * 10 + (d2 - '0');
		int mes = (m1 - '0') * 10 + (m2 - '0');
		int anyo = (a1 - '0') * 1000 + (a2 - '0') * 100 + (a3 - '0') * 10 + (a4 - '0');
		
		// Check that day, month and year are valid.
		if (dia < 1 || dia > 31 || mes < 1 || mes > 12 || anyo < 0) {
			System.err.println("Fecha no válida: día o mes fuera de rango");
			System.exit(1);
		}
		
		
		// Print results
		System.out.println("Fecha válida!");
		System.out.println("Día : " + dia);
		System.out.println("Mes : " + mes);
		System.out.println("Año : " + anyo);
	}
}

