package classes.figuras;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        char[] options = {'a', 'b', 'c', 'd', 'e'};

        char choice;
        do {
            // Print menu
            System.out.println("""
                //////////////////////////////////////////
                /// CALCULADORA DE FIGURAS GEOMETRICAS ///
                //////////////////////////////////////////
                (a) Circulo
                (b) Esfera
                (c) Cuadrado
                (d) Cubo
                (e) Salir
                """);

            System.out.print("Elige una opción: ");
            choice = scan.next().charAt(0);

            // Check invalid options
                    boolean valid = false;
                    for (char op : options) {
                        if (choice == op) {
                            valid = true;break;
                }
            }

            if (!valid) {
                System.out.println("Opcion no valida.");
            } else {
                switch (choice) {
                    case 'a' -> { // Circulo
                        System.out.print("\nRadio del circulo: ");
                        double radio = readPositiveDouble(scan);
                        Circulo circulo = new Circulo(radio);
                        System.out.printf("Perimetro: %.2f\n", circulo.perimetro());
                        System.out.printf("Area: %.2f\n\n", circulo.area());
                    }
                    case 'b' -> { // Esfera
                        System.out.print("\nRadio de la esfera: ");
                        double radio = readPositiveDouble(scan);
                        Esfera esfera = new Esfera(radio);
                        System.out.printf("Superficie: %.2f\n", esfera.superficie());
                        System.out.printf("Volumen: %.2f\n\n", esfera.volumen());
                    }
                    case 'c' -> { // Cuadrado
                        System.out.print("\nLado del cuadrado: ");
                        double lado = readPositiveDouble(scan);
                        Cuadrado cuadrado = new Cuadrado(lado);
                        System.out.printf("Perimetro: %.2f\n", cuadrado.perimetro());
                        System.out.printf("Area: %.2f\n\n", cuadrado.area());
                    }
                    case 'd' -> { // Cubo
                        System.out.print("\nLado del cubo: ");
                        double lado = readPositiveDouble(scan);
                        Cubo cubo = new Cubo(lado);
                        System.out.printf("Superficie: %.2f\n", cubo.superficie());
                        System.out.printf("Volumen: %.2f\n\n", cubo.volumen());
                    }
                }
            }

        } while (choice != 'e');

        System.out.println("El programa ha terminado!");

        scan.close();
    }

    public static double readPositiveDouble(Scanner scanner) {
        double value;
        do {
            value = scanner.nextDouble();
            if (value < 0) {
                System.out.println("El valor no puede ser negativo!");
            }
        } while (value < 0);
        return value;
    }
}
