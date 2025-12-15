package classes.Ej11;

public class Cuenta {
    private String titular;
    private double saldo;

    // Constructor
    public Cuenta(String titular, double saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }

    // Getters
    public String getTitular() {return titular; }

    public double getSaldo() {
        return saldo;
    }

    // Methods
    public void ingresar(double cantidad) {
        if (cantidad > 0) saldo += cantidad;
    }

    public void retirar(double cantidad) {
        if (cantidad > 0) saldo -= cantidad;
        if (saldo < 0) saldo = 0;
    }
}

