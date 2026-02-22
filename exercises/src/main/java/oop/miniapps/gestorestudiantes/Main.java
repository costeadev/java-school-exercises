package oop.miniapps.gestorestudiantes;

import utils.Keyboard;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Estudiante> estudiantes = new ArrayList<>();

        int opcion;
        do {
            mainMenu();
            opcion = Keyboard.readInt("Elige un opcion: ");
            switch (opcion) {
                case 1 -> crearFlow(estudiantes);
                case 2 -> listarFlow(estudiantes);
                case 3 -> buscarFlow(estudiantes);
                case 4 -> mostrarAprobadosFlow(estudiantes);
                case 5 -> System.out.println("Adious! :)\n");
                default -> System.out.println("Opcion invalida\n");
            }
        } while (opcion != 5);
    }

    private static void crearFlow(List<Estudiante> estudiantes) {
        String nombre = Keyboard.readString("Nombre: ");
        int edad = Keyboard.readInt("Edad: ");
        double notaMedia = Keyboard.readDouble("Nota media: ");

        estudiantes.add(new Estudiante(nombre, edad, notaMedia));
        System.out.println("Estudiante correctamente añadido\n");
    }

    private static void listarFlow(List<Estudiante> estudiantes) {
        if (estudiantes.isEmpty()) {
            System.out.println("No hay estudiantes\n");
        } else {
            for (Estudiante e : estudiantes) {
                System.out.println(e);
            }
        }
    }

    private static void buscarFlow(List<Estudiante> estudiantes) {

        String nombreBuscado = Keyboard.readString("Nombre a buscar: ");
        boolean estudianteEncontrado = false;

        for (Estudiante e : estudiantes) {
            if (e.getNombre().equals(nombreBuscado)) {
                System.out.println("[Estudiante encontrado!]\n");
                estudianteEncontrado = true;
                break;
            }
        }
        if (!estudianteEncontrado) {
            System.out.println("[Estudiante NO ENCONTRADO...]\n");
        }
    }

    private static void mostrarAprobadosFlow(List<Estudiante> estudiantes) {

        boolean alguienAprueba = false;

        for (Estudiante e : estudiantes) {
            if (e.getNotaMedia() >= 5) {
                System.out.println(e);
                alguienAprueba = true;
            }
        }
        if (!alguienAprueba) {
            System.out.println("Nadie aprobó\n");
        }
    }

    private static void mainMenu() {
        System.out.println("""
                1. Crear estudiante
                2. Listar estudiantes
                3. Buscar estudiante por nombre
                4. Mostrar estudiantes aprobados (nota >= 5)
                5. Salir
                """);
    }
}
