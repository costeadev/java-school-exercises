package oop.miniapps.gestorempleados;

import utils.Keyboard;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Empleado> empleados = new ArrayList<>();

        int opcion;
        do {
            printMenu();
            opcion = Keyboard.readInt("Elige una opcion: ");
            switch (opcion) {
                case 1 -> addEmpleado(empleados);
                case 2 -> mostrarEmpleados(empleados);
                case 3 -> calcularSalarios(empleados);
                case 4 -> System.out.println("Hasta luego Lucas\n");
                default -> System.out.println("Opcion invalida");
            }
        } while (opcion != 5);
    }

    private static void addEmpleado(List<Empleado> empleados) {
        int opcion;
        do {
            System.out.println("""
                1. Programador
                2. Designer
                0. Salir
                """);
            opcion = Keyboard.readInt("Elige un tipo de empleado: ");
            switch (opcion) {
                case 1 -> crearProgramador(empleados);
                case 2 -> crearDesigner(empleados);
            }
        } while (opcion != 0);
    }

    private static void crearProgramador(List<Empleado> empleados) {
        String nombre = Keyboard.readString("Nombre: ");
        double salarioBase = Keyboard.readDouble("Salario base: ");
        String lenguajePrincipal = Keyboard.readString("Lenguaje principal: ");
        String lenguajePlus = Keyboard.readString("Lenguaje plus: ");
        Programador programador = new Programador(nombre, salarioBase, lenguajePrincipal, lenguajePlus);

        empleados.add(programador);
        System.out.println("Programador añadido correctamente!\n");
    }

    private static void crearDesigner(List<Empleado> empleados) {
        String nombre = Keyboard.readString("Nombre: ");
        double salarioBase = Keyboard.readDouble("Salario base: ");
        String herramientaDesigner = Keyboard.readString("Herramienta designer: ");
        String plusCreativo = Keyboard.readString("Plus creativo: ");
        Designer designer = new Designer(nombre, salarioBase, herramientaDesigner, plusCreativo);

        empleados.add(designer);
        System.out.println("Designer añadido correctamente!\n");
    }

    private static void mostrarEmpleados(List<Empleado> empleados) {
        for (Empleado e : empleados) {
            System.out.println(e);
        }
    }

    private static void calcularSalarios(List<Empleado> empleados) {
        for (Empleado e : empleados) {
            System.out.printf("%s Salario total = €%.2f\n", e, e.calcularSalario());
        }
    }

    private static void printMenu() {
        System.out.println("""
                1. Añadir empleado
                2. Mostrar empleados
                3. Calcular salarios
                4. Salir
                """);
    }
}
