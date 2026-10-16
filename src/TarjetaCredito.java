public class TarjetaCredito {
    protected String numero;
    protected String titular;
    protected double limiteCredito;
    protected double saldoActual;

    public TarjetaCredito(String numero, String titular, double limiteCredito) {
        this.numero = numero;
        this.titular = titular;
        this.limiteCredito = limiteCredito;
        this.saldoActual = 0.0;
    }

    public boolean realizarCompra(double monto) {
        if ((saldoActual + monto) <= limiteCredito) {
            saldoActual += monto;
            System.out.println("Compra aprobada por monto de: $" + String.format("%.2f", monto));
            return true;
        } else {
            System.out.println("Compra rechazada. Supera el límite de crédito disponible.");
            return false;
        }
    }

    public String obtenerEstadoCuenta() {
        return "Titular: " + titular + " | Tarjeta: " + numero + " | Límite: $" + String.format("%.2f", limiteCredito) + " | Saldo Actual: $" + String.format("%.2f", saldoActual);
    }

}
