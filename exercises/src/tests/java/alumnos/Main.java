package alumnos;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//        Alumno alumno1 = new Alumno();
//        alumno1.dni = "2314922N ";
//        alumno1.nombre = "Antonio ";
//        alumno1.edad = 17;
//
//        Alumno alumno2 = new Alumno();
//        alumno2.dni = "092312J ";
//        alumno2.nombre = "Manuel ";
//        alumno2.edad = 18;
//
//        System.out.println(alumno1.dni + alumno1.nombre + alumno1.edad);
//        System.out.println(alumno2.dni + alumno2.nombre + alumno2.edad);

        // Array for 3 more students
        Alumno[] alumnos = new Alumno[3];

        Scanner scan = new Scanner(System.in);

        // Leer datos
        for (int i = 0; i < alumnos.length; i++) {
            alumnos[i] = new Alumno(); // Instancia objeto
            alumnos[i].leerDatos(scan);
        }

        // Mostrar datos
        for (Alumno a : alumnos) {
            a.mostrarDatos();
        }

        // Convertimos a mayusculas cada nombre
        for (int i = 0; i < alumnos.length; i++) {
            alumnos[i].nombre = alumnos[i].nombre.toUpperCase();
        }

        // Mostrar datos
        for (Alumno a : alumnos) {
            a.mostrarDatos();
        }

        scan.close();
    }
}
