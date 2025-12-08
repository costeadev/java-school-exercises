package if_statements;

import java.util.Scanner;

/*
 * Realizar un programa que dados dos números enteros leídos por teclados,
 * diga si alguno de los dos es múltiplo de otro.
 * */
public class Ex1Alt {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Introduce un número: ");
		int num1 = scan.nextInt();
		
		System.out.print("Introduce otro número: ");
		int num2 = scan.nextInt();
		
		scan.close();
		
		// Asumimos que num1 es mayor y num2 menor
		int biggerNumber = num1;
		int smallerNumber = num2;

		
		// En caso de que num2 sea mayor, los intercambiamos
		if (num2 > num1){
			biggerNumber = num2;
			smallerNumber = num1;
		}
		
		// (En caso de que sean iguales, nos da igual cual sea mayor o menor)
		
		// Comprobamos si el número mayor es múltiplo del menor
		if (biggerNumber % smallerNumber == 0) {
			System.out.printf("\n%d es múltiplo de %d",biggerNumber,smallerNumber);
		} else {
			System.out.printf("\n%d no es múltiplo de %d",biggerNumber,smallerNumber);
		}
	}
}
