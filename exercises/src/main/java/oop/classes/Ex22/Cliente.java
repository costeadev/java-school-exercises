package oop.classes.Ex22;

public class Cliente {

    private final String name;
    private final String nif;
    private final String[] codigosPedidos;

    public Cliente(String name, String nif) {
        this.name = name;
        this.nif = nif;
        codigosPedidos = new String[10];
    }

    public String getNif() {
        return nif;
    }

    public String[] getCodigosPedidos() {
        return codigosPedidos;
    }

    public void resetearPedidos() {
        for (int i = 0; i < codigosPedidos.length; i++) {
            codigosPedidos[i] = null;
        }
    }

    public int getPedidosCount() {
        int count = 0;
        for (String pedido : codigosPedidos) {
            if (pedido != null) {
                count++;
            }
        }
        return count;
    }

    @Override
    public String toString() {
        return String.format("""
                name: %s
                NIF: %s
                Pedidos: %d
                """, name, nif, getPedidosCount());
    }
}
