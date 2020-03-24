package c0305;

/**
 * Clase que ilustra un ejemplo de uso de la clase NumeroRacional
 * 
 * @author Derlis Zarate
 */
public class PruebaRacional {

    public static void main(String[] args) throws Exception {
        NumeroRacional r1 = new NumeroRacional(1,2);
        NumeroRacional r2 = new NumeroRacional(1,3);

        NumeroRacional r3 = r1.suma(r2);
        System.out.printf("La suma de %s y %s es %s", r1, r2, r3);
    }
}
