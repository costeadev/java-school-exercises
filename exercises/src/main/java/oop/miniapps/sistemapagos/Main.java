package oop.miniapps.sistemapagos;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<MetodoPago> pagos = new ArrayList<>();
        pagos.add(new PagoTarjeta());
        pagos.add(new PagoEfectivo());
        pagos.add(new PagoPaypal());
        pagos.add(new PagoEfectivo());

        for (MetodoPago m : pagos) {
            m.pagar(20);
        }
    }
}
