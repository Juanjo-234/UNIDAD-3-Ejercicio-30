Este programa está diseñado para modelar un sistema de gestión de tarjetas de crédito aplicando los pilares fundamentales de la programación orientada a objetos en Java: herencia, encapsulamiento, reutilización mediante la palabra clave super y polimorfismo a través de la sobrescritura de métodos (@Override) para incorporar reglas de validación y beneficios exclusivos según la categoría de la tarjeta.

A continuación se detalla exactamente lo que hace cada parte del programa:

Define la clase base TarjetaCredito: Concentra los atributos comunes a cualquier medio de pago (numero, titular, limiteCredito y saldoUtilizado), junto con un constructor centralizado y la validación estándar de compras.

Desarrolla las clases hijas TarjetaGold y TarjetaBlack: Extienden de TarjetaCredito incorporando atributos y beneficios particulares (como acumulación de puntos de fidelidad por consumo para la Gold; seguro de viaje internacional y margen de sobregiro VIP preferencial para la Black).

Sobrescribe el método de validación de compras: Cada subclase implementa su propia lógica de control (acumulando puntos o permitiendo límites extendidos de cortesía).

Ejecuta la prueba en el main: Instancia tarjetas de distintas categorías, simula operaciones de compra exitosas y rechazadas por límites, y despliega los estados de cuenta consolidados por consola.
