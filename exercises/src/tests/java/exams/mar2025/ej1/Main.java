package exams.mar2025.ej1;

public class Main {
    public static void main(String[] args) {
        MagoElemental[] magos = {
                new MagoEstudiante("Elminster"),
                new MagoAire("Morgana", 1000),
                new MagoFuego("Albus", 100.7)
        };

        for (MagoElemental m : magos) {
            if (m instanceof MagoEstudiante magoEstudiante) {
                magoEstudiante.estudiar();
            }
            m.lanzarHechizo();
        }
    }
}
