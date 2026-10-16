public class TarjetaBlack extends TarjetaCredito{
    private boolean seguroViajeIncluido;
    private double comisionPreferencial;

    public TarjetaBlack(String numero, String titular, double limiteCredito, boolean seguroViajeIncluido, double comisionPreferencial) {
        super(numero, titular, limiteCredito);
        this.seguroViajeIncluido = seguroViajeIncluido;
        this.comisionPreferencial = comisionPreferencial;
    }

    @Override
    public boolean realizarCompra(double monto) {

        if ((saldoActual + monto) <= limiteCredito) {
            saldoActual += monto;
            System.out.println("[BLACK] Compra preferencial aprobada por $" + String.format("%.2f", monto) + ". Comisión aplicada: " + comisionPreferencial + "% (Sin cargos extra).");
            if (seguroViajeIncluido) {
                System.out.println("  -> Cobertura de seguro de viaje activada para esta transacción.");
            }
            return true;
        } else {
            System.out.println("[BLACK] Compra rechazada. Supera el límite estricto de la tarjeta Black.");
            return false;
        }
    }
}
