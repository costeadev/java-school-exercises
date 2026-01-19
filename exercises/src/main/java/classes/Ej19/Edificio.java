package classes.Ej19;

public class Edificio {

    private final int antiguedad;
    private final int numPlantas;
    private final double superficie;
    private final String localizacion;

    public Edificio(int antiguedad, int numPlantas, double superficie, String localizacion) {
        this.antiguedad = antiguedad;
        this.numPlantas = numPlantas;
        this.superficie = superficie;
        this.localizacion = localizacion;
    }

    public double getSuperficieTotal() {
        return numPlantas * superficie;
    }

    public boolean debePasarITE() {
        return antiguedad > 40;
    }
}
