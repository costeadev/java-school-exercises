package exams.mar2024.ej1;

import java.util.*;

public class Jugador {

    private String nombre;
    private int puntuacion;
    List<Carta> mano;

    public Jugador(String nombre) {
        this.nombre = nombre;
        puntuacion = 0;
        mano = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public int getPuntuacion() {
        return puntuacion;
    }

    public List<Carta> getMano() {
        return mano;
    }

    public void setPuntuacion(int puntuacion) {
        this.puntuacion = puntuacion;
    }

    public void quitarCarta(Carta cartaEliminar) {
        Iterator<Carta> it = mano.iterator();
        while (it.hasNext()) {
            Carta current = it.next();
            if (current.equals(cartaEliminar)) {
                it.remove();
            }
        }
    }

    public void recibirCarta(Carta carta) {
        mano.add(carta);
    }

    public Carta jugarCarta(String palo) {

        // TreeSet con orden ascendente
        TreeSet<Carta> cartasPalo = new TreeSet<>();

        for (Carta c : mano) {
            if (c.getPalo().equalsIgnoreCase(palo)) {
                cartasPalo.add(c);
            }
        }

        if (cartasPalo.isEmpty()) {
            System.out.println("Paso");
            return null;
        }

        // La ultima carta en cartasPalo sera la mayor
        Carta cartaMayor = cartasPalo.last();
        System.out.printf("Jugando %d de %s\n", cartaMayor.getNumero(), cartaMayor.getPalo());

        quitarCarta(cartaMayor);
        return cartaMayor;
    }

    public void mostrarMano() {
        System.out.printf("=== MANO DE %s ===\n", nombre.toUpperCase());
        for (Carta c : mano) {
            System.out.printf("- %s\n", c);
        }
    }
}
