package classes.Ej13;

public class Cafetera {
    private int maxCapacity;
    private int currentLevel;

    // Constructors
    public Cafetera(int maxCapacity) {
        this.maxCapacity = Math.max(0, maxCapacity);
        this.currentLevel = this.maxCapacity; // start full
    }

    public Cafetera(int maxCapacity, int initialLevel) {
        this.maxCapacity = Math.max(0, maxCapacity);
        this.currentLevel = clamp(initialLevel, 0, this.maxCapacity);
    }

    // Getters
    public int getMaxCapacity() {
        return maxCapacity;
    }

    public int getCurrentLevel() {
        return currentLevel;
    }

    // Setters
    public void setMaxCapacity(int capacity) {
        if (capacity < 0) return;
        maxCapacity = capacity;
        currentLevel = Math.min(currentLevel, maxCapacity);
    }

    public void setCurrentLevel(int level) {
        currentLevel = clamp(level, 0, maxCapacity);
    }

    // Methods
    public void serveCup(int cupSize) {
        if (cupSize < 0) return;
        currentLevel = Math.max(0, currentLevel - cupSize);
    }

    public void addCoffee(int amount) {
        if (amount < 0) return;
        currentLevel = Math.min(maxCapacity, currentLevel + amount);
    }

    public void fill() {
        currentLevel = maxCapacity;
    }

    public void empty() {
        currentLevel = 0;
    }

    // Utils
    private int clamp(int value, int min, int max) {
        return Math.max(min, Math.min(max, value));
    }
}
