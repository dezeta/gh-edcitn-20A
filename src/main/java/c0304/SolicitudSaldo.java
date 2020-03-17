package c0304;

public class SolicitudSaldo extends Transaccion {
    //Implementacion de la consulta de saldo
    @Override
    public void ejecutar() {
        double obtenerSaldoDisponible = this.baseDatos.obtenerSaldoDisponible(this.numeroCuenta);
        pantalla.limpiarPantalla();
        pantalla.mostrarMensaje("El saldo es..." + obtenerSaldoDisponible);
        teclado.hacerPausa();
    }
    
}
