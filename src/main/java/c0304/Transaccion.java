package c0304;

public abstract class Transaccion {
    //Atributo comun a las transacciones de consulta y manipulacion de saldos
    protected int numeroCuenta;
           
    //referencia a objetos asociados
    protected static Pantalla pantalla;
    protected static Teclado teclado;
    protected static DispensadorEfectivo dispensador;
    protected static RanuraDeposito ranura;
    protected static BaseDatosBanco baseDatos;
    
    static {
        pantalla = new Pantalla();
        teclado = new Teclado();
        dispensador = new DispensadorEfectivo();
        ranura = new RanuraDeposito();
        baseDatos = new BaseDatosBanco();
    }
        
    //Metodo comun de todas las clases
    public int getNumeroCuenta() {
        return numeroCuenta;
    }
    
    //Metodo comun de todas las clases
    public void setNumeroCuenta(int nroCta) {
        numeroCuenta = nroCta;
    }
       
    //Metodo pendiente de definicion. cada clase hija definira como ejecuta su transaccion
    public abstract void ejecutar();
}
