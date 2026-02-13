package oop.inheritance.pacientehospital;

import java.time.LocalDate;
import java.time.LocalTime;

public class Cita {
    private LocalDate fecha;
    private LocalTime hora;
    private Doctor doctorAsignado;

    public Cita(LocalDate fecha, LocalTime hora, Doctor doctorAsignado) {
        if (fecha.isBefore(LocalDate.now())) {
            throw new IllegalArgumentException("La fecha debe ser en el futuro");
        }

        if (fecha.isEqual(LocalDate.now()) && hora.isBefore(LocalTime.now())) {
            throw new IllegalArgumentException("La hora debe ser en el futuro");
        }

        this.fecha = fecha;
        this.hora = hora;
        this.doctorAsignado = doctorAsignado;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public LocalTime getHora() {
        return hora;
    }

    public Doctor getDoctorAsignado() {
        return doctorAsignado;
    }

    protected String extraInfo() {
        return "";
    }

    @Override
    public String toString() {
        return String.format("""
                Fecha: %s
                Hora: %s:%s
                Doctor asignado: %s
                %s""", fecha, hora.getHour(), hora.getMinute(), doctorAsignado.getNombre(), extraInfo());
    }
}
