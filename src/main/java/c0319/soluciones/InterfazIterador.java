package c0319.soluciones;

/**
 * Interfaz que define las operaciones de un Iterador Generico
 * @author Prof. Derlis Zarate (profderliszarate@gmail.com)
 * @param <TipoDeDato> Tipo de Dato almacenado en la coleccion sobre la que se va a iterar.
 */
public interface InterfazIterador<TipoDeDato> {

    /**
     * Metodo que se posiciona al inicio de la coleccion de datos
     */
    public void first();

    /**
     * Metodo que indica con TRUE o FALSE si es que aun existen datos en la coleccion
     * que no fueron visitados por el iterador. Cuando llega al final de la coleccion, retorna FALSE
     * @return TRUE o FALSE
     */
    public boolean hasNext();

    /**
     * Metodo que retorna el siguiente dato almacenado en la coleccion, siempre y cuando
     * aun existan datos pendientes de ser visitados.
     * @return Dato almacenado en la coleccion
     */
    public TipoDeDato next();
}
