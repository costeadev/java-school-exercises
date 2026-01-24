package oop.classes.Ej16;

public final class Asignatura {

    private static final int NOTA_NO_CALIFICADA = -1;

    private final String name;
    private final Curso curso;
    private int nota;


    public Asignatura(String name, Curso curso, int nota) {
        this.name = name;
        this.curso = curso;
        this.nota = validarNota(nota) ? nota : NOTA_NO_CALIFICADA;
    }

    public Asignatura(String name, Curso curso) {
        this(name, curso, NOTA_NO_CALIFICADA);
    }

    public void califica(int nota) {
        if (!validarNota(nota)) {
            throw new IllegalArgumentException("Nota fuera de rango");
        }
        this.nota = nota;
    }

    private boolean validarNota(int nota) {
        int MIN = 0, MAX = 10;
        return nota >= MIN && nota <= MAX;
    }

    @Override
    public String toString() {
        String notaStr = (nota == NOTA_NO_CALIFICADA) ? "No calificada" : String.valueOf(nota);
        return String.format("name: %s%nCurso: %s%nNota: %s", name, curso, notaStr);
    }
}
