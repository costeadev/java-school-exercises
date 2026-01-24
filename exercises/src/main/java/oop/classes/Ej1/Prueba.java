package oop.classes.Ej1;

// 2.
public class Prueba {
    public static void main(String[] args) {

        // 3.
        Persona pepe = new Persona();
        pepe.saludar();
        pepe.despedirse();

        // 4.
        System.out.printf("name: %s%n", pepe.name);
        System.out.printf("age: %d%n", pepe.age);
        System.out.println();

        // 5.
        pepe.name = "Pepe";
        pepe.age = 20;
        System.out.printf("name: %s%n", pepe.name);
        System.out.printf("age: %d%n", pepe.age);

        // 6.
        pepe.saludar(pepe.name, pepe.age);
        pepe.despedirse();

        // 7.
        Persona ana = new Persona();
        ana.name = "Ana";
        ana.age = 18;
        pepe.saludar(pepe.name, pepe.age);
        ana.saludar(ana.name, ana.age);

        // 8. Habria 3 objetos, pero solamente 2 unicos
        Persona aux = pepe;
        aux.saludar(aux.name, aux.age);

        // 9. Ahora TODOS SON PEPE
        ana = aux;
        ana.saludar(ana.name, ana.age);

        // 10.s
        ana.name = "Ana";
        ana.age = 18;
        ana.saludar(ana.name, ana.age);
    }
}
