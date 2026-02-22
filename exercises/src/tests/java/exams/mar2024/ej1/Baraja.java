package exams.mar2024.ej1;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Baraja {

    Set<Carta> cartas = new HashSet<>();

    public Baraja() {
        for (int i = 1; i <= 10; i++) {
            cartas.add(new Carta("bastos", i));
            cartas.add(new Carta("copas", i));
            cartas.add(new Carta("espadas", i));
            cartas.add(new Carta("oros", i));
        }
    }

    public Carta sacarCarta() {
        Random rand = new Random();
        int randomIndex = rand.nextInt(0, cartas.size());
        int i = 0;
        for (Carta c : cartas) {
            if (i == randomIndex) {
                cartas.remove(c);
                return c;
            }
            i++;
        }
        return null;
    }

    public boolean tienePalo(String palo) {
        for (Carta c : cartas) {
            if (c.getPalo().equals(palo)) return true;
        }
        return false;
    }
}

