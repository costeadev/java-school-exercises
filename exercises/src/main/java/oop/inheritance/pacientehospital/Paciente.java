package oop.inheritance.pacientehospital;

import java.util.ArrayList;
import java.util.List;

public class Paciente {
    private String dni;
    private String nombre;
    private List<Cita> historialMedico;

    public Paciente(String dni, String nombre) {
        this.dni = dni;
        this.nombre = nombre;
        historialMedico = new ArrayList<>();
    }

    public String getDni() {
        return dni;
    }

    public String getNombre() {
        return nombre;
    }

    public List<Cita> getHistorialMedico() {
        return historialMedico;
    }

    public void asignarCita(Cita cita) {
        if (cita == null) {
            throw new IllegalArgumentException("Cita no puede ser null");
        }
        historialMedico.add(cita);
    }

    public void asignarTratamiento(Tratamiento tratamiento) {
        if (tratamiento == null) {
            throw new IllegalArgumentException("Tratamiento no puede ser null");
        }
        historialMedico.add(tratamiento);
    }

    public String citasToString() {
        StringBuilder sb = new StringBuilder();
        for (Cita c : historialMedico) {
            sb.append(c);
            sb.append("\n");
        }
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Paciente paciente = (Paciente) o;
        return dni.equals(paciente.dni);
    }

    @Override
    public String toString() {
        return String.format("""
                (DNI %s) %s
                Numero citas: %d""", dni, nombre, historialMedico.size());
    }
}
