package exams.mar2024.ej2;

public class Dragon extends CriaturaMistica {

    private int longitudLlama;

    public Dragon(String nombre, int edad, int longitudLlama) {
        super(nombre, edad);
        this.longitudLlama = longitudLlama;
    }

    @Override
    public void activarPoder() {
        System.out.println("*lanza llamas por la boca*");
    }

    public void describirCriatura() {
        System.out.printf("Un %s de %d años con una longitud de llama de %d metros",
                super.getNombre(), super.getEdad(), longitudLlama);
    }
}
