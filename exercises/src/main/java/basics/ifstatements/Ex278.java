package basics.ifstatements;

import java.util.Scanner;

/*
 * Pedir el día, mes y año de una fecha correcta y mostrar la fecha del día siguiente.
 * Suponer que todos los meses tienen 30 días.
 */

public class Ex278 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce el día: ");
        int day = scanner.nextInt();

        System.out.print("Introduce el mes: ");
        int month = scanner.nextInt();

        System.out.print("Introduce el año: ");
        int year = scanner.nextInt();

        // Check if the date is valid
        boolean validDate = day >= 1 && day <= 30;

        if (month < 1 || month > 12) validDate = false;
        if (year < 0) validDate = false;

        if (!validDate) {
            System.err.print("Error: Fecha no válida");
            return;
        }

        if (day == 30 && month == 12) { // New year's eve
            day = 1;
            month = 1;
            year++;
        } else if (day == 30) { // Next month
            day = 1;
            month++;
        } else { // Next day
            day++;
        }

        System.out.printf("%nEl día SIGUIENTE sería el %02d-%02d-%d", day, month, year);

        scanner.close();
    }
}
