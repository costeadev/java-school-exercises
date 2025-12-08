package classes;

// 1.
public class Persona {
    String nombre;
    int edad;

    void saludar() {
        System.out.println("Hola!\n");
    }

    // 6. He usado un overload para que exista 'saludar()' para gente anonima
    void saludar(String nombre, int edad) {
        System.out.printf("Hola, me llamo %s y tengo %d años!\n", nombre, edad);
    }

    void despedirse() {
        System.out.println("Adios!\n");
    }
}
