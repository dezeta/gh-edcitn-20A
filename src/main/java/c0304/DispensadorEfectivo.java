package c0304;

public class DispensadorEfectivo {
    private int cantidadBilletes = 500;
    final double denominacionBilletes = 50000;
    
    private int calcularNroBilletes(double monto) {
        int nroB = 0;
        if (monto % denominacionBilletes == 0) {
            nroB = (int) (monto / denominacionBilletes);
        }
        return nroB;
    }
    
    public boolean validarMontoNroBilletes(double monto) {
        boolean resp = false;
        if (monto % denominacionBilletes == 0) {
            resp = true;
        }
        return resp;
    }
    
    public boolean haySuficienteEfectivoDisponible(double monto) {
        if (calcularNroBilletes(monto) <= cantidadBilletes) {
            return true;
        } else {
            return false;
        }
    }
    
    public void dispensarEfectivo(double monto) {
        int montoEnBilletes = calcularNroBilletes(monto);
        if (montoEnBilletes <= cantidadBilletes) {
            cantidadBilletes = cantidadBilletes - montoEnBilletes;
        }
    }
    
    public void alimentarEfectivo(double monto) {
        int montoEnBilletes = calcularNroBilletes(monto);
        cantidadBilletes = cantidadBilletes + montoEnBilletes;
    }
}
