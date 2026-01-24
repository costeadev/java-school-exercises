package oop.classes.Ej22;

public class Pedido {

    private String descripcion;
    private double precio;
    private final String codigo;

    public Pedido(String descripcion, double precio, String codigo) {
        this.descripcion = descripcion;
        this.precio = precio;
        this.codigo = codigo;
    }

    public double getPrecio() {
        return precio;
    }

    public String getCodigo() {
        return codigo;
    }

    public void modificarDescripcion(String descripcion) {
        if (descripcion != null && !descripcion.isBlank()) {
            this.descripcion = descripcion;
        }
    }

    public void aplicarRebaja(double rebaja) {
        if (rebaja <= 0) {
            throw new IllegalArgumentException("La rebaja debe ser positiva que el precio");
        }
        precio = Math.max(0, precio - rebaja);
    }

    @Override
    public String toString() {
        return String.format(
                "Pedido[codigo=%s, descripcion=%s, precio=%.2f€]",
                codigo, descripcion, precio
        );
    }
}
