package exams.mar2024.ej1;

import java.util.Random;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Baraja baraja = new Baraja();
        Jugador jugador1 = new Jugador("Bob Esponja");
        Jugador jugador2 = new Jugador("Patricio");

        for (int i = 1; i <= 10; i++) {
            jugador1.recibirCarta(baraja.sacarCarta());
            jugador2.recibirCarta(baraja.sacarCarta());
        }

        String[] palos = {"bastos", "copas", "espadas", "oros"};

        Random rand = new Random();
        String paloJugado = palos[rand.nextInt(0, 4)];

        int numRonda = 1;
        while (!baraja.cartas.isEmpty()) {

            Thread.sleep(500);

            System.out.printf("=== RONDA %d ===\n", numRonda++);

            Carta cartaJugador1 = jugador1.jugarCarta(paloJugado);
            if (cartaJugador1 != null) jugador1.quitarCarta(cartaJugador1);
            Carta cartaJugador2 = jugador2.jugarCarta(paloJugado);
            if (cartaJugador2 != null) jugador2.quitarCarta(cartaJugador2);

            if (jugador1.getMano().size() == 10 && cartaJugador1 == null &&
                    jugador2.getMano().size() == 10 && cartaJugador2 == null ||
                    !baraja.tienePalo(paloJugado)) {
                break;
            }

            if (cartaJugador1 == null && cartaJugador2 == null ) {
                System.out.println("Nadie puede jugar carta. Robando cartas hasta tener 10");
                do {
                    if (jugador1.getMano().size() < 10) jugador1.recibirCarta(baraja.sacarCarta());
                    if (jugador2.getMano().size() < 10) jugador2.recibirCarta(baraja.sacarCarta());
                } while (jugador1.getMano().size() != 10 || jugador2.getMano().size() != 10);
                continue;
            }

            if (cartaJugador2 == null) {
                jugador1.setPuntuacion(jugador1.getPuntuacion() + 1);
                System.out.println("Jugador 1 gana la ronda");
                continue;
            }

            if (cartaJugador1 == null) {
                jugador2.setPuntuacion(jugador2.getPuntuacion() + 1);
                System.out.println("Jugador 2 gana la ronda");
                continue;
            }

            if (cartaJugador1.getNumero() == cartaJugador2.getNumero()) {
                System.out.println("Nadie consigue punto");
                continue;
            }

            if (cartaJugador1.getNumero() > cartaJugador2.getNumero()) {
                jugador1.setPuntuacion(jugador1.getPuntuacion() + 1);
                System.out.println("Jugador 1 gana la ronda");
                continue;
            }

            if (cartaJugador2.getNumero() > cartaJugador1.getNumero()) {
                jugador2.setPuntuacion(jugador2.getPuntuacion() + 1);
                System.out.println("Jugador 2 gana la ronda");
                continue;
            }
        }

        if (jugador1.getPuntuacion() > jugador2.getPuntuacion()) {
            System.out.println("Gana jugador 1");
        } else if (jugador2.getPuntuacion() > jugador1.getPuntuacion()) {
            System.out.println("Gana jugador 2");
        } else {
            System.out.println("Empate");
        }
    }
}
