package oop.inheritance.pacientehospital;

import java.time.LocalDate;
import java.time.LocalTime;

public class Tratamiento extends Cita {
    private String descripcion;
    private double costo;


    public Tratamiento(
            LocalDate fecha,
            LocalTime hora,
            Doctor doctorAsignado,
            String descripcion,
            double costo
    ) {
        super(fecha, hora, doctorAsignado);
        if (descripcion == null || descripcion.isBlank()) {
            throw new IllegalArgumentException("Descripcion invalida");
        }

        if (costo < 0) {
            throw new IllegalArgumentException("El costo no puede ser negativo");
        }

        this.descripcion = descripcion;
        this.costo = costo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public double getCosto() {
        return costo;
    }

    @Override
    public String extraInfo() {
        return String.format("""
                Descripcion: %s
                Costo: %.2f€""", descripcion, costo);
    }
}
