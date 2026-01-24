package basics.ternaryoperator;

import java.util.Scanner;

/*
 * Crea un programa que lea por teclado
 * una variable entera para representar
 * la cantidad de horas trabajadas en una semana.
 * Luego, declara una variable double para representar
 *  la tarifa por hora.
 *  Calcula y muestra el salario semanal.
 */

public class Ex8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("--- CALCULAR SALARIO SEMANAL ---");

        System.out.print("Horas trabajadas esta semana: ");
        int horasTrabajadas = scanner.nextInt();

        System.out.print("Tarifa por hora: ");
        double tarifaPorHora = scanner.nextDouble();

        double salarioSemanal = calcularSalarioSemanal(horasTrabajadas, tarifaPorHora);
        System.out.printf("Te corresponden %.2f€ esta semana.", salarioSemanal);

        scanner.close();
    }

    public static double calcularSalarioSemanal(int horasTrabajadas, double tarifaPorHora) {
        return horasTrabajadas * tarifaPorHora;
    }
}
