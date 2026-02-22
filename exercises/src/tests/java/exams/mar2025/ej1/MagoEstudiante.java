package exams.mar2025.ej1;

public class MagoEstudiante extends MagoElemental implements Aprendiz {

    public MagoEstudiante(String nombre) {
        super(nombre);
    }

    @Override
    public void estudiar() {
        System.out.println("Shhh, estoy estudiando.");
    }

    @Override
    public void lanzarHechizo() {
        System.out.println("Aun estoy en practicas y no me han dado elemento...");
    }
}
