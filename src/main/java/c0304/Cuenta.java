package c0304;

public class Cuenta {
    //Atributos
    private int numeroCuenta;
    private int pin;
    private double saldo;
    
    //Constructores
    public Cuenta() {
        numeroCuenta = 0;
        pin = 0;
        saldo = 0;
    }
    
    public Cuenta(int NroCuentaInit, int PinInit, double SaldoInit) {
        numeroCuenta = NroCuentaInit;
        pin = PinInit;
        saldo = SaldoInit;
    }
    
    //Operaciones
    public int getNumeroCuenta() {
        return numeroCuenta;
    }
    
    public boolean validarPIN(int pinAValidar) {
        boolean resp = false;
        if (this.pin == pinAValidar) {
            resp = true;
        }
        return resp;
    }
    
    public double obtenerSaldoDisponible() {
        return saldo;
    }
    
    public void debitar(double monto) {
        saldo = saldo - monto;
    }
    
    public void acreditar(double monto) {
        saldo = saldo + monto;
    }
}