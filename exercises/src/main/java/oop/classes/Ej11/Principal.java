package oop.classes.Ej11;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce name de titular: ");
        String titular = scanner.nextLine();

        System.out.print("Introduce saldo de la cuenta: ");
        double saldo = scanner.nextDouble();

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
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1 -> {
                    System.out.print("Introduce cantidad a introducir: ");
                    double cantidad = scanner.nextDouble();
                    cuenta.ingresar(cantidad);
                }
                case 2 -> {
                    System.out.print("Introduce cantidad a retirar: ");
                    double cantidad = scanner.nextDouble();
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

        scanner.close();
    }
}
