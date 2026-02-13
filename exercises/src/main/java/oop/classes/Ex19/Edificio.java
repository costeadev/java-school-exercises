package oop.classes.Ex19;

public class Edificio {

    private final int antiguage;
    private final int numPlantas;
    private final double superficie;
    private final String localizacion;

    public Edificio(int antiguage, int numPlantas, double superficie, String localizacion) {
        this.antiguage = antiguage;
        this.numPlantas = numPlantas;
        this.superficie = superficie;
        this.localizacion = localizacion;
    }

    public double getSuperficieTotal() {
        return numPlantas * superficie;
    }

    public boolean debePasarITE() {
        return antiguage > 40;
    }
}
