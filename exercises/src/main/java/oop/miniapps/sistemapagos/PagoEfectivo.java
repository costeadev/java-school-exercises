package oop.miniapps.sistemapagos;

public class PagoEfectivo implements MetodoPago {
    public void pagar(double cantidad) {
        System.out.printf("Se te quitan $%.2f de la cartera\n", cantidad);
    }
}
