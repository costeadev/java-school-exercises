package classes.Ej18;

public class Main {
    public static void main(String[] args) {

        Biblioteca biblioteca = new Biblioteca();

        biblioteca.agregarPelicula(new Pelicula("Cadena Perpetua", "Frank Darabont", 10));
        biblioteca.agregarPelicula(new Pelicula("Memento", "Christopher Nolan", 8));
        biblioteca.agregarPelicula(new Pelicula("Mala Persona", "Fer Garcia-Ruiz", 7));

        System.out.println(biblioteca);
        System.out.printf("Hay %d peliculas\n", biblioteca.obtenerConteoDePeliculas());
        System.out.printf("Calificacion promedio: %.2f", biblioteca.obtenerCalificacionPromedio());
    }
}
