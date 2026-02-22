package exams.mar2025.ej1;

public class MagoAire extends MagoElemental {

    private double velocidad;

    public MagoAire(String nombre, double velocidad) {
        super(nombre);
        this.velocidad = velocidad;
    }

    @Override
    public void lanzarHechizo() {
        System.out.printf("%s lanza una rafaga de viento a %.2f km/h\n", super.getNombre(), velocidad);
    }
}
