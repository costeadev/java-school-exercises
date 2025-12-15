package classes.Ej1;

// 2.
public class Prueba {
    public static void main(String[] args) {

        // 3.
        Persona pepe = new Persona();
        pepe.saludar();
        pepe.despedirse();

        // 4.
        System.out.printf("Nombre: %s%n",pepe.nombre);
        System.out.printf("Edad: %d%n",pepe.edad);
        System.out.println();

        // 5.
        pepe.nombre = "Pepe";
        pepe.edad = 20;
        System.out.printf("Nombre: %s%n",pepe.nombre);
        System.out.printf("Edad: %d%n",pepe.edad);

        // 6.
        pepe.saludar(pepe.nombre, pepe.edad);
        pepe.despedirse();

        // 7.
        Persona ana = new Persona();
        ana.nombre = "Ana";
        ana.edad = 18;
        pepe.saludar(pepe.nombre, pepe.edad);
        ana.saludar(ana.nombre, ana.edad);

        // 8. Habria 3 objetos, pero solamente 2 unicos
        Persona aux = pepe;
        aux.saludar(aux.nombre, aux.edad);

        // 9. Ahora TODOS SON PEPE
        ana = aux;
        ana.saludar(ana.nombre, ana.edad);

        // 10.s
        ana.nombre = "Ana";
        ana.edad = 18;
        ana.saludar(ana.nombre, ana.edad);
    }
}
