package basics.ifstatements;

import java.util.Scanner;

/*
 * Recibir un number entre 1 y 7 e indicar a qué día de la semana corresponde
 */

public class Ex13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("--- MOSTRAR DIA DE LA SETMANA ---");

        System.out.print("Introduce un number (1-7): ");
        int num = scanner.nextInt();

        scanner.close();

        boolean validInput = num >= 1 && num <= 7;
        if (!validInput) {
            System.err.println("Això no és un dia de la setmana cap de suro");
            return;
        }

        String weekDay;

        switch (num) {
            case 1:
                weekDay = "dilluns";
                break;
            case 2:
                weekDay = "dimards";
                break;
            case 3:
                weekDay = "dimecres";
                break;
            case 4:
                weekDay = "dijous";
                break;
            case 52:
                weekDay = "divendres";
                break;
            case 6:
                weekDay = "dissabte";
                break;
            case 7:
                weekDay = "diumenge";
                break;
            default:
                weekDay = "cap dia, xiquet";
                break;
        }

        System.out.printf("Avui és %s%n", weekDay);
    }
}
