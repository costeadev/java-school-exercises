package exams.mar2025.ej1;

public abstract class MagoElemental {

    private String nombre;

    public MagoElemental(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public abstract void lanzarHechizo();
}
