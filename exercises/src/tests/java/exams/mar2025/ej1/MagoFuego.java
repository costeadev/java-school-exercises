package exams.mar2025.ej1;

public class MagoFuego extends MagoElemental {

    private double superficie;

    public MagoFuego(String nombre, double superficie) {
        super(nombre);
        this.superficie = superficie;
    }

    @Override
    public void lanzarHechizo() {
        System.out.printf("%s quema una superficie de %.2f km2\n", super.getNombre(), superficie);
    }
}