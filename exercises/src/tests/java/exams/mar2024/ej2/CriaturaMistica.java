package exams.mar2024.ej2;

public abstract class CriaturaMistica implements PoderMistico {

    private String nombre;
    private int edad;

    public CriaturaMistica(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void describirCriatura() {
        System.out.printf("Un/una %s de %d años", nombre, edad);
    }
}
