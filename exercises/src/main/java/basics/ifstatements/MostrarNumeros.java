package basics.ifstatements;

import java.util.Scanner;

public class MostrarNumeros {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Hasta donde quieres contar?: ");
        int limit = scanner.nextInt();

        scanner.close();

        contarHasta(limit);
    }

    public static void contarHasta(int limit) {

        int count = 1;
        while (count <= limit) {
            System.out.println(count);
            count++;
        }
    }
}
