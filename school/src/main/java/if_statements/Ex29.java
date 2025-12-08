package if_statements;

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
		System.out.print("Introduce el día de la 1ª fecha: ");
		int dia1 = scan.nextInt();

		System.out.print("Introduce el mes de la 1ª fecha: ");
		int mes1 = scan.nextInt();

		System.out.print("Introduce el año de la 1ª fecha: ");
		int anyo1 = scan.nextInt();

		System.out.println("\nFECHA 2");
		System.out.println("-------------------------------");
		System.out.print("Introduce el día de la 2ª fecha: ");
		int dia2 = scan.nextInt();

		System.out.print("Introduce el mes de la 2ª fecha: ");
		int mes2 = scan.nextInt();

		System.out.print("Introduce el año de la 2ª fecha: ");
		int anyo2 = scan.nextInt();

		scan.close();

		// Input validation
		boolean fecha1esCorrecta = true;
		if (dia1 < 1 || dia1 > 30 || mes1 < 1 || mes1 > 12 || anyo1 < 0)
			fecha1esCorrecta = false;
		if (!fecha1esCorrecta) {
			System.err.println("Error: Fecha 1 no válida");
			return;
		}

		boolean fecha2esCorrecta = true;
		if (dia2 < 1 || mes2 < 1 || mes2 > 12 || anyo2 < 0)
			fecha2esCorrecta = false;
		if (!fecha2esCorrecta) {
			System.err.println("Error: Fecha 2 no válida");
			return;
		}
		
		// Calculate the difference between each date
		int total1 = (anyo1 * 12 * 30) + (mes1 * 30) + dia1;
		int total2 = (anyo2 * 12 * 30) + (mes2 * 30) + dia2;
		int diferencia = Math.abs(total1 - total2);
		
		System.out.printf("%nEntre el %d-%d-%d y el %d-%d-%d hay %d días de diferencia", dia1, mes1, anyo1, dia2, mes2, anyo2, diferencia);

	}
}
