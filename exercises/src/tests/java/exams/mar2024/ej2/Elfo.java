package exams.mar2024.ej2;

public class Elfo extends CriaturaMistica {

    private int longitudOrejas;

    public Elfo(String nombre, int edad, int longitudOrejas) {
        super(nombre, edad);
        this.longitudOrejas = longitudOrejas;
    }

    @Override
    public void activarPoder() {
        System.out.println("*reproduce un capitulo de Frieren: The Journey's end*");
    }

    public void describirCriatura() {
        System.out.printf("Un %s de %d años con una longitud de orejas de %d centimetros",
                super.getNombre(), super.getEdad(), longitudOrejas);
    }
}
