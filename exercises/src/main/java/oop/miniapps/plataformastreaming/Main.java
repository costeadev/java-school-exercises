package oop.miniapps.plataformastreaming;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        List<Contenido> contenido = new ArrayList<>();
        Set<String> generos = new HashSet<>();

        contenido.add(new Pelicula("Cadena Perpetua", 142, "Drama"));
        contenido.add(new Pelicula("Forrest Gump", 142, "Hopecore"));
        contenido.add(new Serie("Mr. Robot", 2250, "Drama", 45, 4));

        for (Contenido c : contenido) {
            generos.add(c.getGenero());
        }

        for (Contenido c : contenido) {
            if (c.getGenero().equals("Drama")) {
                System.out.println(c);
            }
        }
    }
}
