package if_statements;

import java.util.Scanner;

/*
 * Pedir el día, mes y año de una fecha e indicar si la fecha es correcta. 
 * Suponiendo todos los meses de 30 días.
 */
public class Ex25 {
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
	
		if (dia < 1 || dia > 30) esCorrecta = false;
		if (mes < 1 || mes > 12) esCorrecta = false;
		if (anyo < 0) esCorrecta = false;
		
		System.out.printf("%nLa fecha %d-%d-%d%s es correcta", dia, mes, anyo, esCorrecta ? "" : " NO");
	}
}
