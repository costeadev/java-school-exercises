package oop.classes.Ex15;

public class Partitura {
    private final String autor;
    private String instrumento;
    private int tempo;

    public Partitura(String autor, String instrumento, int tempo) {
        this.autor = autor;
        this.instrumento = instrumento;
        this.tempo = tempo;
    }

    public void aumentaTempo() {
        tempo += 10;
    }

    public void reduceTempo() {
        tempo -= 10;
    }

    public void cambiaInstrumento(String instrumento) {
        this.instrumento = instrumento;
    }

    public void addInstrumento(String instrumento) {
        this.instrumento += String.format(", %s", instrumento);
    }

    public int cuentaInstrumentos() {
        String[] instrumentos = instrumento.split(",");
        int count = 0;
        for (String instrumento : instrumentos) {
            count++;
        }
        return count;
    }

    @Override
    public String toString() {
        return String.format("""
                Autor: %s
                Instrumento/s: %s
                Tempo: %s
                """, autor, instrumento, tempo);
    }
}
