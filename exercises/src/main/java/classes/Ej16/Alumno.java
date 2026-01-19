package classes.Ej16;

import java.util.ArrayList;
import java.util.List;

public class Alumno {

    private final String nombre;
    private final List<Asignatura> asignaturas;

    public Alumno(String nombre) {
        this.nombre = nombre;
        this.asignaturas = new ArrayList<>();
    }

    public void asignaAsignatura(Asignatura asignatura) {
        if (asignatura != null) asignaturas.add(asignatura);
    }

    public void asignaAsignatura(String nombre, Curso curso, int nota) {
        asignaturas.add(new Asignatura(nombre, curso, nota));
    }

    public void cambiarNota(int numeroAsignatura, int nota) {
        if (numeroAsignatura < 1 || numeroAsignatura > asignaturas.size()) {
            throw new IndexOutOfBoundsException("Numero de asignatura invalido");
        }
        asignaturas.get(numeroAsignatura - 1).califica(nota);
    }

    public void boletinNotas() {
        System.out.printf("=== Boletin de %s ===%n%n", nombre);
        for (int i = 0; i < asignaturas.size(); i++) {
            System.out.printf("--- Asignatura %d --- %n%s%n%n", i + 1, asignaturas.get(i));
        }
    }
}
