package classes.Ej13;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Cafetera cafetera = new Cafetera(1000);

        String choice;

        do {
            printMenu();
            choice = scanner.next();

            switch (choice) {
                case "1" -> { // Servir cafe
                    int capacidadTaza = readInt(scanner, "Capacidad taza: ");
                    if (capacidadTaza < 0) {
                        System.out.println("Valor invalido.");
                        break;
                    }
                    cafetera.serveCup(capacidadTaza);
                }

                case "2" -> { // Agregar cafe
                    int cantidadPorAgregar = readInt(scanner, "Cafe por agregar: ");
                    if (cantidadPorAgregar < 0) {
                        System.out.println("Valor invalido.");
                        break;
                    }
                    cafetera.addCoffee(cantidadPorAgregar);
                }

                case "3" -> cafetera.fill();
                case "4" -> cafetera.empty();
                
                case "5" -> cafetera.setMaxCapacity(
                    readInt(scanner, "Nueva capacidad: ")
                );

                 case "6" -> {
                     System.out.printf(
                         "Cafe: %d/%d\n\n",
                         cafetera.getCurrentLevel(),
                         cafetera.getMaxCapacity());
                 }

                 case "7" -> {} // Exit - do nothing

                default -> System.out.println("Opcion invalida.");
            }
        } while (!choice.equals("7"));

        scanner.close();
    }

    private static void printMenu() {
        System.out.println("""
                /// CAFETERA CAPUCCINO ASSASINO ///
                1. Servir café
                2. Agregar café
                3. Llenar cafetera
                4. Vaciar cafetera
                5. Cambiar capacidad
                6. Ver estado
                7. Salir
                """);
        System.out.print("Elige una opcion: ");
    }

    private static int readInt(Scanner scanner, String msg) {
        System.out.print(msg);
        return scanner.nextInt();
    }
}
