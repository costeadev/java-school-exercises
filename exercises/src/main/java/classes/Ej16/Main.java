package classes.Ej16;

public class Main {

    public static void main(String[] args) {
        Alumno alumno = new Alumno("Paquito");

        alumno.asignaAsignatura("Matematicas", Curso.PRIMERO, 4);
        alumno.asignaAsignatura("Programacion", Curso.PRIMERO, 10);
        alumno.asignaAsignatura("Base de datos", Curso.PRIMERO, 1);

        alumno.boletinNotas();

        alumno.cambiarNota(1, 5);
        alumno.cambiarNota(3, 5);

        alumno.boletinNotas();
    }
}
