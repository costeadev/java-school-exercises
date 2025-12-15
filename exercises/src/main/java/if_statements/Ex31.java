package if_statements;

import java.util.Scanner;

public class Ex31 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Introduce un número entre 0 y 99: ");
		int num = scan.nextInt();

		if (num < 0 || num > 99) {
			System.err.println("Error: Valor no válido");
			return;
		}
		
		int decenas = num / 10;
		int unidades = num % 10;
		
		String numTexto = "";
		
		if (num >= 11 && num <= 15) {
			switch (num) {
			case 11:
				numTexto = "once";
				break;
			case 12:
				numTexto = "doce";
				break;
			case 13:
				numTexto = "trece";
				break;
			case 14:
				numTexto = "catorce";
				break;
			case 15:
				numTexto = "quince";
				break;
			}
		} else if (decenas != 0 && unidades == 0) {
			switch (decenas) {
			case 1:
				numTexto = "diez";
				break;
			case 2:
				numTexto = "veinte";
				break;
			case 3:
				numTexto = "treinta";
				break;
			case 4:
				numTexto = "cuarenta";
				break;
			case 5:
				numTexto = "cincuenta";
				break;
			case 6:
				numTexto = "sesenta";
				break;
			case 7:
				numTexto = "setenta";
				break;
			case 8:
				numTexto = "ochenta";
				break;
			case 9:
				numTexto = "noventa";
				break;
			}
		} else {
			switch (decenas) {
			case 1:
				numTexto = "dieci";
				break;
			case 2:
				numTexto = "veinti";
				break;
			case 3:
				numTexto = "treinta y ";
				break;
			case 4:
				numTexto = "cuarenta y ";
				break;
			case 5:
				numTexto = "cincuenta y ";
				break;
			case 6:
				numTexto = "sesenta y ";
				break;
			case 7:
				numTexto = "setenta y ";
				break;
			case 8:
				numTexto = "ochenta y ";
				break;
			case 9:
				numTexto = "noventa y ";
				break;
			default:
				numTexto = "";
			}
			switch (unidades) {
			case 0:
				numTexto += "cero";
				break;
			case 1:
				numTexto += "uno";
				break;
			case 2:
				numTexto += "dos";
				break;
			case 3:
				numTexto += "tres";
				break;
			case 4:
				numTexto += "cuatro";
				break;
			case 5:
				numTexto += "cinco";
				break;
			case 6:
				numTexto += "seis";
				break;
			case 7:
				numTexto += "siete";
				break;
			case 8:
				numTexto += "ocho";
				break;
			case 9:
				numTexto += "nueve";
				break;
			}
		}
		System.out.printf("%d = %s", num, numTexto);

		scan.close();
	}
}
