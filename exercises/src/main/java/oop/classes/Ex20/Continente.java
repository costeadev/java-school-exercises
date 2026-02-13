package oop.classes.Ex20;

public class Continente {
    private final String name;
    private final Pais[] paises;

    public Continente(String name, Pais[] paises) {
        this.name = name;
        this.paises = paises;
    }

    public String getname() {
        return name;
    }

    public double obtenerSuperficie() {
        double sum = 0;
        for (Pais p : paises) {
            sum += p.superficie();
        }
        return sum;
    }

    public int obtenerHabitantes() {
        int sum = 0;
        for (Pais p : paises) {
            sum += p.habitantes();
        }
        return sum;
    }

    public void ordenarPaises() {
        Sort.quickSort(paises, 0, paises.length - 1);
    }
}
