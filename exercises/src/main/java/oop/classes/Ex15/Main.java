package oop.classes.Ex15;

public class Main {
    public static void main(String[] args) {
        Partitura miRumbita = new Partitura("Melendi", "Guitarreta", 92);
        System.out.printf("%s\n", miRumbita);

        System.out.println("/// 1. AUMENTAR TEMPO (+10) ///");
        miRumbita.aumentaTempo();
        System.out.printf("%s\n", miRumbita);

        System.out.println("/// 2. REDUCIR TEMPO (-10) ///");
        miRumbita.reduceTempo();
        System.out.printf("%s\n", miRumbita);

        System.out.println("/// 3. CAMBIAR INSTRUMENTO ///");
        miRumbita.cambiaInstrumento("Guitarra española");
        System.out.printf("%s\n", miRumbita);

        System.out.println("/// 4. AÑADIR INSTRUMENTO ///");
        miRumbita.addInstrumento("Cajon");
        System.out.printf("%s\n", miRumbita);

        System.out.println("/// 5. CONTAR INSTRUMENTOS ///");
        System.out.printf("Hay %d instrumentos", miRumbita.cuentaInstrumentos());
    }
}
