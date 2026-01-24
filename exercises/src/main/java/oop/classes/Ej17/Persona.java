package oop.classes.Ej17;

public record Persona(String name, int age, String direccion) {

    @Override
    public String toString() {
        return String.format("%s (age %d, %s)", name, age, direccion);
    }
}
