package ifstatements;

import java.util.Scanner;

public class MostrarNumeros {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Hasta donde quieres contar?: ");
		int limit = scan.nextInt();
		
		scan.close();
		
		contarHasta(limit);
	}
	
	public static void contarHasta(int limit) {
		
		int contador = 1;
		while (contador <= limit) {
			System.out.println(contador);
			contador++;
		}
	}
}
