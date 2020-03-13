package c0304;

public class SolicitudSaldo extends Transaccion {
    //Implementacion de la consulta de saldo
    @Override
    public void ejecutar() {

    	/* TODO:
        Pendiente de definicion
                Flujo:
                    a. obtener el saldo disponible de la cuenta almacenada en 
                       la variable heredada numeroCuenta
                    b. imprimir en la pantalla (cuya referencia también es heredada)
                       el saldo de la cuenta
    	 */
        
        pantalla.limpiarPantalla();
        pantalla.mostrarMensaje("El saldo es...");
        teclado.hacerPausa();
    }
    
}
