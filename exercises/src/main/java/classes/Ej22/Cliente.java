package classes.Ej22;

public class Cliente {

    private String nombre;
    private String nif;
    private String[] codigosPedidos;

    public Cliente(String nombre, String nif) {
        this.nombre = nombre;
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
                Nombre: %s
                NIF: %s
                Pedidos: %d
                """, nombre, nif, getPedidosCount());
    }
}
