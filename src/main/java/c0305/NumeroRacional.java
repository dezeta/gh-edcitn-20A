package c0305;

/**
 * Clase que representa a un Numero NumeroRacional en Java.
 * <br>Soporta todas las operaciones basicas sobre el racional.
 * @author Derlis Zarate
 */
public class NumeroRacional {

    /**
     * Numerador del racional
     */
    private int numerador;

    /**
     * Denominador del racional
     */
    private int denominador;

    /**
     * Constructor de la clase que crea un NumeroRacional
     * @param a Es el numerador
     * @param b Es el denominador. Debe ser distinto de 0
     * @throws DenominadorInvalidoException Lanza una excepcion si el denominador es igual a cero
     */
    public NumeroRacional(int a, int b) throws DenominadorInvalidoException {
        numerador = a;

        if (b != 0) {
            denominador = b;
        } else {
            throw new DenominadorInvalidoException();
        }
    }

    /**
     * Suma el numeroRacional actual con el otroNro racional recibido como parametro;
     * @param otroNro NumeroRacional que sera sumado al objeto actual
     * @return El numero racional resultante de sumar el objeto actual con el otroNro
     */
    public NumeroRacional suma(NumeroRacional otroNro) {
        int nuevoNumerador;
        int nuevoDenominador;

        int a = this.getNumerador();
        int b = this.getDenominador();
        int c = otroNro.getNumerador();
        int d = otroNro.getDenominador();

        nuevoNumerador = (a*d + b*c);
        nuevoDenominador = b*d;

        NumeroRacional respuesta = null;
        try {
            respuesta = new NumeroRacional(nuevoNumerador, nuevoDenominador);
        } catch (DenominadorInvalidoException e) {
            System.out.println(e.getMessage());
        }
        return respuesta;
    }

    /**
     * Resta el numeroRacional actual con el otroNro racional recibido como parametro;
     * @param otroNro NumeroRacional que sera restado al objeto actual
     * @return El numero racional resultante de restar el objeto actual con el otroNro
     */
    public NumeroRacional resta(NumeroRacional otroNro) {
        int nuevoNumerador;
        int nuevoDenominador;

        int a = this.getNumerador();
        int b = this.getDenominador();
        int c = otroNro.getNumerador();
        int d = otroNro.getDenominador();

        nuevoNumerador = (a*d - b*c);
        nuevoDenominador = b*d;

        NumeroRacional respuesta = null;
        try {
            respuesta = new NumeroRacional(nuevoNumerador, nuevoDenominador);
        } catch (DenominadorInvalidoException e) {
            System.out.println(e.getMessage());
        }
        return respuesta;
    }

    /**
     * Multiplica el numeroRacional actual con el otroNro racional recibido como parametro;
     * @param otroNro NumeroRacional que sera multiplicado al objeto actual
     * @return El numero racional resultante de multiplicar el objeto actual con el otroNro
     */
    public NumeroRacional producto(NumeroRacional otroNro) {
        int nuevoNumerador;
        int nuevoDenominador;

        int a = this.getNumerador();
        int b = this.getDenominador();
        int c = otroNro.getNumerador();
        int d = otroNro.getDenominador();

        nuevoNumerador = a*c;
        nuevoDenominador = b*d;

        NumeroRacional respuesta = null;
        try {
            respuesta = new NumeroRacional(nuevoNumerador, nuevoDenominador);
        } catch (DenominadorInvalidoException e) {
            System.out.println(e.getMessage());
        }
        return respuesta;
    }

    /**
     * Divide el numeroRacional actual con el otroNro racional recibido como parametro;
     * @param otroNro NumeroRacional que sera dividido al objeto actual
     * @return El numero racional resultante de dividir el objeto actual con el otroNro
     */
    public NumeroRacional division(NumeroRacional otroNro) {
        int nuevoNumerador;
        int nuevoDenominador;

        int a = this.getNumerador();
        int b = this.getDenominador();
        int c = otroNro.getNumerador();
        int d = otroNro.getDenominador();

        nuevoNumerador = a*d;
        nuevoDenominador = b*c;

        NumeroRacional respuesta = null;
        try {
            respuesta = new NumeroRacional(nuevoNumerador, nuevoDenominador);
        } catch (DenominadorInvalidoException e) {
            System.out.println(e.getMessage());
        }
        return respuesta;
    }

    /**
     * Metodo que retorna el valor del numerador del NumeroRacional
     * @return El numerador
     */
    public int getNumerador() {
        return numerador;
    }

    /**
     * Metodo que retorna el valor del denominador del NumeroRacional
     * @return El denominador
     */
    public int getDenominador() {
        return denominador;
    }

    /**
     * Funcion que retorna el valor real del nro racional almacenado en el objeto
     * @return Valor Real del racional
     */
    public double getValorReal() {
        int a = this.getNumerador();
        int b = this.getDenominador();
        return (double) a / b;
    }

    /**
     * Representacion del objeto NumeroRacional como String en el formato: (numerador/denominador)
     * @return Valor del racional como String
     */
    @Override
    public String toString() {
        return "(" + numerador + "/" + denominador + ")";
    }

} //Fin de clase NumeroRacional