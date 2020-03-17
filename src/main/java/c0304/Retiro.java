package c0304;

public class Retiro extends Transaccion {
    //Implementacion del Retiro
    @Override
    public void ejecutar() {        
        pantalla.limpiarPantalla();
        
        pantalla.mostrarMensaje("\n\nIngrese monto a extraer (como multiplos de 50.000Gs): ");
        double montoADebitar = teclado.obtenerEntradaDouble();        
        double saldoActual = baseDatos.obtenerSaldoDisponible(numeroCuenta);
        
        if (montoADebitar <= saldoActual) {        	
        	if ((montoADebitar % 50000) == 0) {
        		if (super.dispensador.haySuficienteEfectivoDisponible(montoADebitar)) {
        			super.baseDatos.debitar(super.numeroCuenta, montoADebitar);
        			super.dispensador.dispensarEfectivo(montoADebitar);
        			pantalla.mostrarMensaje("\n\n\tRetire sus fondos!!!");
        			pantalla.mostrarMensaje("\n\n\tEl nuevo saldo de la cuenta es: " + super.baseDatos.obtenerSaldoDisponible(super.numeroCuenta));
                    teclado.hacerPausa();
        		} else {
        			pantalla.mostrarMensaje("\n\n\tNo hay billetes disponibles para este monto, intente con un monto menor!!!");
                    teclado.hacerPausa();
        		}
        	} else {
        		pantalla.mostrarMensaje("\n\n\tMonto invalido, debe ser multiplo de 50 mil!!!");
                teclado.hacerPausa();
        	}
        } else {
            pantalla.mostrarMensaje("\n\n\tSaldo Insuficiente!!!");
            teclado.hacerPausa();
        }        
    }
        
}
