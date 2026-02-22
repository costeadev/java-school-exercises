package oop.miniapps.sistemapagos;

public class PagoTarjeta implements MetodoPago {
    public void pagar(double cantidad) {
        System.out.printf("Se te quitan $%.2f de la tarjeta\n", cantidad);
    }
}
