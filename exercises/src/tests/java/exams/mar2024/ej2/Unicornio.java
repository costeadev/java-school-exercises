package exams.mar2024.ej2;

public class Unicornio extends CriaturaMistica {

    private int longitudCuerno;

    public Unicornio(String nombre, int edad, int longitudCuerno) {
        super(nombre, edad);
        this.longitudCuerno = longitudCuerno;
    }

    @Override
    public void activarPoder() {
        System.out.println("*reproduce un video de Planeta Vegetta*");
    }

    public void describirCriatura() {
        System.out.printf("Un %s de %d años con una longitud de cuerno de %d centimetros",
                super.getNombre(), super.getEdad(), longitudCuerno);
    }
}
