package oop.classes.Ex1;

// 1.
public class Persona {
    String name;
    int age;

    void saludar() {
        System.out.println("Hola!\n");
    }

    // 6. He usado un overload para que exista 'saludar()' para gente anonima
    void saludar(String name, int age) {
        System.out.printf("Hola, me llamo %s y tengo %d años!\n", name, age);
    }

    void despedirse() {
        System.out.println("Adios!\n");
    }
}
