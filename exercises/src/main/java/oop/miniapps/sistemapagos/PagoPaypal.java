package oop.miniapps.sistemapagos;

public class PagoPaypal implements MetodoPago {
    public void pagar(double cantidad) {
        System.out.printf("Se te quitan $%.2f de la cuenta de PayPal\n", cantidad);
    }
}
