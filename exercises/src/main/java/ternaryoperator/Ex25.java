package ternary_operator;

import java.util.Scanner;

/*
 * Escribe un programa que lea por teclado 
 * dos variables de tipo double para representar 
 * las notas de un estudiante en dos evaluaciones. 
 * Muestra en pantalla el mensaje 
 * “Muy bien” si el alumno ha aprobado las dos asignaturas 
 * y la suma de las dos notas es al menos 14.
 */

public class Ex25 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("Nota 1ª evaluación: ");
		double nota1 = scan.nextDouble();
		
		System.out.print("Nota 2ª evaluación: ");
		double nota2 = scan.nextDouble();
		
		double sumaNotas = nota1 + nota2;
		
		boolean notasValidas = (nota1 >= 0 && nota1 <= 10) &&
							   (nota2 >= 0 && nota2 <= 10);
		
		String mensaje = !notasValidas
				? "Notas no válidas"
				: (nota1 >= 5 && nota2 >= 5 && sumaNotas >= 14)
					? "Muy bien"
					: "Muy mal";

		System.out.println(mensaje);

		scan.close();
	}
}
