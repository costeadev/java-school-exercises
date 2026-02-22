package exams.mar2024.ej1;

public class Carta implements Comparable<Carta> {

    private String palo;
    private int numero;

    public Carta(String palo, int numero) {
        this.palo = palo;
        this.numero = numero;
    }

    public String getPalo() {
        return palo;
    }

    public int getNumero() {
        return numero;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Carta carta)) {
            return false;
        }

        return this.palo.equals(carta.palo) &&
                this.numero == carta.getNumero();
    }

    @Override
    public int compareTo(Carta otraCarta) {
        return this.numero - otraCarta.getNumero();
    }

    @Override
    public String toString() {
        return String.format("%d de %s", numero, palo);
    }
}
