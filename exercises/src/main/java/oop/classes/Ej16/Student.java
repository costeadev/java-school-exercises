package oop.classes.Ej16;

import java.util.ArrayList;
import java.util.List;

public class Student {

    private final String name;
    private final List<Asignatura> asignaturas;

    public Student(String name) {
        this.name = name;
        this.asignaturas = new ArrayList<>();
    }

    public void asignaAsignatura(Asignatura asignatura) {
        if (asignatura != null) asignaturas.add(asignatura);
    }

    public void asignaAsignatura(String name, Curso curso, int nota) {
        asignaturas.add(new Asignatura(name, curso, nota));
    }

    public void cambiarNota(int numberAsignatura, int nota) {
        if (numberAsignatura < 1 || numberAsignatura > asignaturas.size()) {
            throw new IndexOutOfBoundsException("number de asignatura invalido");
        }
        asignaturas.get(numberAsignatura - 1).califica(nota);
    }

    public void boletinNotas() {
        System.out.printf("=== Boletin de %s ===%n%n", name);
        for (int i = 0; i < asignaturas.size(); i++) {
            System.out.printf("--- Asignatura %d --- %n%s%n%n", i + 1, asignaturas.get(i));
        }
    }
}
