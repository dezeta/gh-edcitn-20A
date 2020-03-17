package c0304;

public class Deposito extends Transaccion {
	// Implementacion del deposito
	@Override
	public void ejecutar() {
		pantalla.limpiarPantalla();

		pantalla.mostrarMensaje("\n\nIngrese monto a depositar (como multiplos de 50.000Gs): ");
		double montoAAcreditar = teclado.obtenerEntradaDouble();

		if ((montoAAcreditar % 50000) == 0) {
			pantalla.mostrarMensaje("\n\nDeposite su sobre: ");
			if (super.ranura.seRecibioSobreDeposito()) {
				super.baseDatos.acreditar(super.numeroCuenta, montoAAcreditar);
				super.dispensador.alimentarEfectivo(montoAAcreditar);
				pantalla.mostrarMensaje("\n\n\tDeposito exitoso!!!");
				pantalla.mostrarMensaje("\n\n\tEl nuevo saldo de la cuenta es: "
						+ super.baseDatos.obtenerSaldoDisponible(numeroCuenta));
				teclado.hacerPausa();
			}
		} else {
			pantalla.mostrarMensaje("\n\n\tMonto invalido, debe ser multiplo de 50 mil!!!");
			teclado.hacerPausa();
		}

	}
}
