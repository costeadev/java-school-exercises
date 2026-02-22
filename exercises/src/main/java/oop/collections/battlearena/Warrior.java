package oop.collections.battlearena;

public class Warrior implements Fighter {
    private int id;
    private String name;
    private int power;

    public Warrior(int id, String name, int power) {
        this.id = id;
        this.name = name;
        this.power = power;
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getPower() {
        return power;
    }

    @Override
    public String toString() {
        return name + " (" + power + ")";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Warrior warrior)) return false;
        return id == warrior.id;
    }

    @Override
    public int hashCode() {
        return Integer.hashCode(id);
    }
}
