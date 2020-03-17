package c0304;

import java.util.ArrayList;

public class BaseDatosBanco {
    //Atributos: la BD es un array de cuentas
    private static ArrayList<Cuenta> listaCuentas;
        
    //Inicializacion de valores estaticos
    static {
        listaCuentas = new ArrayList();
        precargarDatosDePrueba();
    }
    
    //Operaciones
    private static void precargarDatosDePrueba() {
        listaCuentas.add(new Cuenta(112233, 1234,  500000));
        listaCuentas.add(new Cuenta(445566, 1234, 1500000));
        listaCuentas.add(new Cuenta(778899, 1234,  250000));
    }
        
    //Operaciones
    private Cuenta buscarCuenta(int nroCuentaABuscar) {
        for (Cuenta cuenta : listaCuentas) {
            if (cuenta.getNumeroCuenta() == nroCuentaABuscar) {
                return cuenta;
            }
        }
        return null;
    }
    
    public boolean autenticarUsuario(int nroCta, int pin) {
        Cuenta cta = buscarCuenta(nroCta); //existe la cuenta?
        if (cta != null) {
            //cuenta existente
            if (cta.validarPIN(pin) == true) {
                //pin valido
                return true;
            } else {
                //cuenta valida, pero pin invalido
                return false;
            }
        } else {
            //Cuenta inexistente en la base de datos
            return false;
        }
    }
    
    public double obtenerSaldoDisponible(int nroCuenta) {
    	Cuenta c = this.buscarCuenta(nroCuenta);
    	if (c != null) {
    		return c.obtenerSaldoDisponible();
    	} else {
    		return 0.0;
    	}
    }
    
    public void debitar(int nroCuenta, double monto) {
    	Cuenta c = this.buscarCuenta(nroCuenta);
    	if (c != null) {
    		c.debitar(monto);
    	} 
    }
    
    public void acreditar(int nroCuenta, double monto) {
    	Cuenta c = this.buscarCuenta(nroCuenta);
    	if (c != null) {
    		c.acreditar(monto);;
    	} 
    }
}
