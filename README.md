Resolución del ejercicio N°30 de la unidad 3 de programación 2.
Este programa modela un sistema de gestión de tarjetas de crédito que administra diferentes categorías mediante el uso de herencia, atributos protegidos, polimorfismo y sobrescritura de métodos en Java.

Clases utilizadas
TarjetaCredito: Clase base que almacena los datos comunes (numero, titular, limiteCredito, saldoActual) y define el comportamiento general de compras.
TarjetaGold: Clase hija que extiende de TarjetaCredito, incorpora tasas de bonificación por consumo y sobrescribe la validación de compras para aplicar comisiones preferenciales.
TarjetaBlack: Clase hija que extiende de TarjetaCredito, añade un seguro de viaje y sobrescribe la validación para permitir un margen de sobregiro exclusivo.
