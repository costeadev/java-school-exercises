package classes.Ej17;

public class Main {
    public static void main(String[] args) {

        LibretaDirecciones libreta = new LibretaDirecciones();

        libreta.agregarPersona(new Persona("Luis", 35, "Calle Matesito 9"));
        libreta.agregarPersona(new Persona("Neymar", 10, "Calle Capoeira 11"));
        libreta.agregarPersona(new Persona("Messi", 35, "Calle Alfajor 10"));

        System.out.println(libreta.obtenerInformacion());
    }
}
