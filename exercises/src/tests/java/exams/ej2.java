package exams;

import java.util.Scanner;

public class ej2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Introduce una cadena de texto: ");
		String cadena = scanner.nextLine();
		
		
		String cadenaComprimida = "";
		for (int i = 0; i <= cadena.length(); i++) {
			int letterCount = 1;
			boolean letraDiferente = false; 

			for (int j = i + 1; j < cadena.length() && letraDiferente == false; j++) {
				if (cadena.charAt(i) == cadena.charAt(j)) letterCount++;
				else if (cadena.charAt(i) != cadena.charAt(j)) {
					cadenaComprimida += "" + cadena.charAt(i) + letterCount;
					i += letterCount - 1;
					letraDiferente = true;
				}
			}
			if (i == cadena.length() - 1) {
				cadenaComprimida += "" + cadena.charAt(i) + letterCount;
			}
		}
		if (cadenaComprimida.length() > cadena.length()) {
			System.out.println(cadena);
		} else {
			System.out.println(cadenaComprimida);
		}
	}
}
