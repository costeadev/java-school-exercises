package classes.Ej17;

public class Persona {

    private final String nombre;
    private final int edad;
    private final String direccion;

    public Persona(String nombre, int edad, String direccion) {
        this.nombre = nombre;
        this.edad = edad;
        this.direccion = direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getDireccion() {
        return direccion;
    }

    @Override
    public String toString() {
        return String.format("%s (edad %d, %s)", nombre, edad, direccion);
    }
}
