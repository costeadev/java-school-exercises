package classes.Ej11;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Introduce nombre de titular: ");
        String titular = scan.nextLine();

        System.out.print("Introduce saldo de la cuenta: ");
        double saldo = scan.nextDouble();

        Cuenta cuenta = new Cuenta(titular, saldo);

        int opcion;
        do {
            System.out.println("\n===========================");
            System.out.println("""
                ### BIENVENIDO A CAJACOSTEA ###
                1. Ingresar fondos
                2. Retirar fondos
                3. Consultar saldo
                4. Salir
                """);

            System.out.print("Por favor, elige una opcion: ");
            opcion = scan.nextInt();

            switch (opcion) {
                case 1 -> {
                    System.out.print("Introduce cantidad a introducir: ");
                    double cantidad = scan.nextDouble();
                    cuenta.ingresar(cantidad);
                }
                case 2 -> {
                    System.out.print("Introduce cantidad a retirar: ");
                    double cantidad = scan.nextDouble();
                    cuenta.retirar(cantidad);
                }
                case 3 -> {
                    System.out.printf("Saldo: %.2f€\n\n", cuenta.getSaldo());
                }
                case 4 -> {
                    // empty because it exits loop
                }
                default -> {
                    System.out.print("Opcion no valida\n");
                }
            }

        } while (opcion != 4);

        scan.close();
    }
}
