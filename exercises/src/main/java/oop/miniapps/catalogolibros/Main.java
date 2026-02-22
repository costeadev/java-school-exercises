package oop.miniapps.catalogolibros;

import utils.Keyboard;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        Set<Libro> libros = new HashSet<>();

        int opcion;
        do {
            printMenu();
            opcion = Keyboard.readInt("Elige una opcion: ");
            switch (opcion) {
                case 1 -> addLibro(libros);
                case 2 -> mostrarCatalogo(libros);
                case 3 -> System.out.println("Bye bye\n");
                default -> System.out.println("Opcion invalida\n");
            }
        } while (opcion != 3);
    }

    private static void addLibro(Set<Libro> libros) {
        System.out.println("=== CREAR LIBRO ===");

        String isbn = Keyboard.readString("ISBN: ");
        String titulo = Keyboard.readString("Titulo: ");
        String autor = Keyboard.readString("Autor: ");

        Libro libro = new Libro(isbn, titulo, autor);

        if (!libros.add(libro)) {
            System.out.println("Este ISBN ya está reservado para otro libro, no se añadirá\n");
        } else {
            System.out.println("Libro añadido correctamente!\n");
        }
    }

    private static void mostrarCatalogo(Set<Libro> libros) {
        for (Libro l : libros) {
            System.out.println(l);
        }
    }

    private static void printMenu() {
        System.out.println("""
                1. Añadir libro
                2. Mostrar catalogo
                3. Salir
                """);
    }
}
