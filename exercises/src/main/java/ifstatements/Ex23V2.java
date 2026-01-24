package ifstatements;

import java.util.Scanner;

// Pedir un número entre 0 y 99999 y mostrarlo con las cifras al revés.

public class Ex23V2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("--- MOSTRAR NUMERO CON CIFRAS AL REVES ---");

		System.out.print("Introduce un número entre 0 y 99999: ");
		int num = scan.nextInt();

		if (num < 0 || num > 99999) {
			System.err.print("Error: Número fuera de rango.");
			return;
		}

		int decenasMillar = num / 10000;
		int millares = (num % 10000) / 1000;
		int centenas = (num % 1000) / 100;
		int decenas = (num % 100) / 10;
		int unidades = num % 10;


		int digitos = (decenasMillar > 0 ? 5 :
			          millares > 0 ? 4 :
			          centenas > 0 ? 3 :
			          decenas > 0 ? 2 : 1);

		boolean esCapicua = false;
		switch(digitos) {
			case 5: esCapicua = (unidades == decenasMillar) && (decenas == millares); break;
			case 4: esCapicua = (unidades == millares) && (decenas == centenas); break;
			case 3: esCapicua = (unidades == centenas); break;
			case 2: esCapicua = (unidades == decenas); break;
			case 1: esCapicua = true; break;
		}

		System.out.printf("%n%nNÚMERO: %d%n", num);
		System.out.println("----------------");
		System.out.printf("- Dígitos: %d%n", digitos);
		System.out.println("----------------");
		System.out.printf("- Decenas de millar: %d%n", decenasMillar);
		System.out.printf("- Millares: %d%n", millares);
		System.out.printf("- Centenas: %d%n", centenas);
		System.out.printf("- Decenas: %d%n", decenas);
		System.out.printf("- Unidades: %d%n", unidades);
		System.out.println("----------------");
		System.out.print("- Reversed: ");
		switch(digitos) {
		    case 5 -> {System.out.printf("%d%d%d%d%d%n", unidades, decenas, centenas, millares, decenasMillar);}
		    case 4 -> {System.out.printf("%d%d%d%d%n", unidades, decenas, centenas, millares);}
		    case 3 -> {System.out.printf("%d%d%d%n", unidades, decenas, centenas);}
		    case 2 -> {System.out.printf("%d%d%n", unidades, decenas);}
		    case 1 -> {System.out.printf("%d%n", unidades);}
		}
		System.out.printf("- Capicúa: %s%n", esCapicua ? "si" : "no");
		System.out.println("----------------");

		scan.close();
	}
}
