package oop.miniapps.gestortareas;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<Tarea> allTareas = new ArrayList<>();
        Set<Tarea> tareasCompletadas = new HashSet<>();

        allTareas.add(new Tarea("Comprar pan"));
        allTareas.add(new Tarea("Hacer la cama"));
        allTareas.add(new Tarea("Estudiar Java"));

        printTareas(allTareas);

        completeTaskById(allTareas, tareasCompletadas, 3);

        printTareas(allTareas);

        System.out.println("=== TAREAS COMPLETADAS ===");
        for (Tarea t : tareasCompletadas) {
            System.out.println(t.getDescripcion());
        }
    }

    private static void printTareas(List<Tarea> tareas) {
        System.out.println("=== TAREAS ===");
        for (Tarea t : tareas) {
            System.out.printf("%d - %s\n", t.getId(), t.getDescripcion());
        }
    }

    private static boolean completeTaskById(List<Tarea> tareas, Set<Tarea> tareasCompletadas, int searchId) {
        for (Tarea t : tareas) {
            if (t.getId() == searchId) {
                t.marcarCompletada();
                tareasCompletadas.add(t);
                tareas.remove(t);
                return true;
            }
        }
        return false;
    }

    private static boolean removeById(List<Tarea> tareas, int searchId) {
        Iterator<Tarea> it = tareas.iterator();
        while (it.hasNext()) {
            if (it.next().getId() == searchId) {
                it.remove();
                return true;
            }
        }
        return false;
    }
}
