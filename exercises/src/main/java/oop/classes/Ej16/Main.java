package oop.classes.Ej16;

public class Main {

    public static void main(String[] args) {
        Student student = new Student("Paquito");

        student.asignaAsignatura("Matematicas", Curso.PRIMERO, 4);
        student.asignaAsignatura("Programacion", Curso.PRIMERO, 10);
        student.asignaAsignatura("Base de datos", Curso.PRIMERO, 1);

        student.boletinNotas();

        student.cambiarNota(1, 5);
        student.cambiarNota(3, 5);

        student.boletinNotas();
    }
}
