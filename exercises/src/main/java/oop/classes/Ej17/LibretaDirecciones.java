package oop.classes.Ej17;

import java.util.ArrayList;
import java.util.List;

public class LibretaDirecciones {

    private final List<Persona> personas;

    public LibretaDirecciones() {
        this.personas = new ArrayList<>();
    }

    public void agregarPersona(Persona persona) {
        if (persona == null) {
            throw new IllegalArgumentException("Persona no puede ser null");
        }
        personas.add(persona);
    }

    public void eliminarPersona(Persona persona) {
        personas.remove(persona);
    }

    public int obtenerConteoDePersonas() {
        return personas.size();
    }

    public String obtenerInformacion() {
        if (personas.isEmpty()) {
            return "La libreta de direcciones no contiene personas.";
        }

        StringBuilder sb = new StringBuilder();
        sb.append("La libreta de direcciones contiene ")
                .append(personas.size())
                .append(" personas: ");

        for (int i = 0; i < personas.size(); i++) {
            sb.append(personas.get(i));

            if (i < personas.size() - 2) {
                sb.append(", ");
            } else if (i == personas.size() - 2) {
                sb.append(" y ");
            }
        }
        sb.append(".");
        return sb.toString();
    }
}
