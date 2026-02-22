package oop.miniapps.gestortareas;

public class Tarea implements Gestionable {

    private static int NEXT_ID = 1;

    private int id;
    private String descripcion;
    private Estado estado;

    public Tarea(String descripcion) {
        id = NEXT_ID++;
        this.descripcion = descripcion;
        estado = Estado.PENDIENTE;
    }

    public void marcarCompletada() {
        estado = Estado.COMPLETADA;
    }

    public int getId() {
        return id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public Estado getEstado() {
        return estado;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }

        if (!(o instanceof Tarea tarea)) {
            return false;
        }

        return this.id == tarea.getId();
    }

    @Override
    public int hashCode() {
        return Integer.hashCode(id);
    }
}
