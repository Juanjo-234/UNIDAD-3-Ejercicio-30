public class TarjetaGold extends TarjetaCredito{
    private double tasaBonificacionConsumo;
    private double comisionInternacional;
    double saldo;

    public TarjetaGold(String numero, String titular, double limiteCredito, double tasaBonificacionConsumo, double comisionInternacional) {
       super(numero, titular, limiteCredito);
        this.tasaBonificacionConsumo = tasaBonificacionConsumo;
        this.comisionInternacional = comisionInternacional;
    }

    @Override
    public boolean realizarCompra(double monto) {
        double limiteConSobregiro = limiteCredito * 1.05;

        if ((saldo + monto) <= limiteConSobregiro) {
            saldo += monto;
            double bonificacion = monto * (tasaBonificacionConsumo / 100.0);
            System.out.println("[GOLD] Compra aprobada por $" + String.format("%.2f", monto) + ". ¡Ganaste $" + String.format("%.2f", bonificacion) + " en bonificación!");
            return true;
        } else {
            System.out.println("[GOLD] Compra rechazada. Excede el límite ampliado Gold.");
            return false;
        }
    }

    public double getComisionInternacional() {
        return comisionInternacional;
    }
}
