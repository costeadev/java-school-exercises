package oop.inheritance.pacientehospital;

public class Doctor {
    private String dni;
    private String nombre;
    private String especialidad;

    public Doctor(String dni, String nombre, String especialidad) {
        this.dni = dni;
        this.nombre = nombre;
        this.especialidad = especialidad;
    }

    public String getDni() {
        return dni;
    }

    public String getNombre() {
        return nombre;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Doctor doctor = (Doctor) o;
        return dni.equals(doctor.dni);
    }

    @Override
    public String toString() {
        return String.format("""
                %s (DNI %s)
                Especialidad: %s""", nombre, dni, especialidad);
    }
}
