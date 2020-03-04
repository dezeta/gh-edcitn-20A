package c0304;

public class Retiro extends Transaccion {
    //Implementacion del Retiro
    @Override
    public void ejecutar() {        
        pantalla.limpiarPantalla();
        
        pantalla.mostrarMensaje("\n\nIngrese monto a extraer (como múltiplos de 50.000Gs): ");
        double montoADebitar = teclado.obtenerEntradaDouble();        
        double saldoActual = baseDatos.obtenerSaldoDisponible(numeroCuenta);
        
        if (montoADebitar <= saldoActual) {
        	/* TODO
            ###Pendiente###
            si los billetes del monto solicitado son validos (multiplos de 50)
                y si hay suficientes billetes disponibles
                        debitar de la cuenta el monto
                        dispensar el efectivo al usuario
                        mostrar mensaje de exito y saldo actual de la cuenta luego de la extraccion
                sino
                        mostrar mensaje de billetes no disponibles
            sino
                mostrar mensaje de monto invalido, no es multiplo de 50000  
            */          
        } else {
            pantalla.mostrarMensaje("\n\n\tSaldo Insuficiente!!!");
            teclado.hacerPausa();
        }        
    }
        
}
