package if_statements;

import java.util.Scanner;

/*
 * Pedir el día, mes y año de una fecha e indicar si la fecha es correcta. 
 * Con meses de 28, 30 y 31 días y sin años bisiestos. 
 */

public class Ex26 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Introduce el día: ");
		int dia = scan.nextInt();
		
		System.out.print("Introduce el mes: ");
		int mes = scan.nextInt();
		
		System.out.print("Introduce el año: ");
		int anyo = scan.nextInt();
		
		scan.close();
		
		
		boolean esCorrecta = true;
		
		// Check if the date is valid
		if (dia < 1) esCorrecta = false;
		if (mes < 1 || mes > 12) esCorrecta = false;
		if (anyo < 0) esCorrecta = false;
		
		// Check if the days of each month are valid
		switch(mes) {
		case 4: case 6: case 9: case 11:
			if (dia > 30) esCorrecta = false; break;
		case 1: case 3: case 5: case 7: case 8: case 10: case 12:
			if (dia > 31) esCorrecta = false; break;
		case 2:
			if (dia > 28) esCorrecta = false; break;
		}
		
		// Print
		System.out.printf("%nLa fecha %d-%d-%d%s es correcta", dia, mes, anyo, esCorrecta ? "" : " NO");
	}
}
