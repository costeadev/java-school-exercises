package classes.Ej20;

public class Continente {
    private final String nombre;
    private Pais[] paises;

    public Continente(String nombre, Pais[] paises) {
        this.nombre = nombre;
        this.paises = paises;
    }

    public String getNombre() {
        return nombre;
    }

    public double obtenerSuperficie() {
        double sum = 0;
        for (Pais p : paises) {
            sum += p.getSuperficie();
        }
        return sum;
    }

    public int obtenerHabitantes() {
        int sum = 0;
        for (Pais p : paises) {
            sum += p.getHabitantes();
        }
        return sum;
    }

    public void ordenarPaises() {
        Sort.quickSort(paises, 0, paises.length - 1);
    }
}
