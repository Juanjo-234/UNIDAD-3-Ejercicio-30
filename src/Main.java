//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    TarjetaCredito tarjeta1 = new TarjetaGold("4532-****-****-1234", "María Gómez", 500000.00, 1.5, 1500.00);
    TarjetaCredito tarjeta2 = new TarjetaBlack("5412-****-****-9876", "Carlos Pérez", 2000000.00, true, 0.0);

    System.out.println("=== SIMULACIÓN DE OPERACIONES CON TARJETAS ===");

    System.out.println("\n--- Operación 1 (Gold) ---");
    tarjeta1.realizarCompra(480000.00);

    System.out.println("\n--- Operación 2 (Black) ---");
    tarjeta2.realizarCompra(1500000.00);

    System.out.println("\n=== ESTADOS DE CUENTA FINALES ===");
    System.out.println(tarjeta1.obtenerEstadoCuenta());
    System.out.println(tarjeta2.obtenerEstadoCuenta());
}
