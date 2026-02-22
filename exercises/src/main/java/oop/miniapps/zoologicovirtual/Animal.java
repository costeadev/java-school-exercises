package oop.miniapps.zoologicovirtual;

public abstract class Animal {

    private String nombre;
    private int edad;

    public Animal(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public abstract void hacerSonido();

    @Override
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }

        if (!(o instanceof Animal animal)) {
            return false;
        }

        return this.nombre.equals(animal.getNombre());
    }

    @Override
    public int hashCode() {
        return nombre.hashCode();
    }
}
