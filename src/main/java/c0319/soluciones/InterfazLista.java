package c0319.soluciones;

/**
 * Interfaz que define las operaciones de una Lista Enlazada
 * @author Prof. Derlis Zarate (profderliszarate@gmail.com)
 * @param <TipoDeDato> Tipo de Dato a almacenar dentro de la lista
 */
public interface InterfazLista<TipoDeDato> {

    /**
     * Inserta el dato luego de la cabecera de la lista
     *
     * @param dato Dato a insertar
     */
    public void insertar(TipoDeDato dato);

    /**
     * Inserta el dato en la posicion determinada
     *
     * @param dato Dato a insertar
     * @param posicion Posicion de la lista donde se insertara el nodo
     * @throws Exception Lanza un error si se intenta insertar un elemento en
     * una posicion inexistente
     */
    public void insertar(TipoDeDato dato, int posicion) throws Exception;

    /**
     * Busca el dato en la lista
     *
     * @param dato Dato a buscar
     * @return Posicion en la lista, 0 cero si el dato no esta en la lista
     */
    public int buscar(TipoDeDato dato);

    /**
     * Retorna el dato almacenado en la posicion solicitada dentro de la lista
     *
     * @param posicion donde esta el dato requerido
     * @return dato de la lista
     * @throws Exception Lanza un error si se intenta obtener un elemento en una
     * posicion inexistente
     */
    public TipoDeDato obtenerDato(int posicion) throws Exception;

    /**
     * Elimina el elemento cabecera de la lista
     */
    public void eliminar();

    /**
     * Elimina el elemento de la posicion determinada
     *
     * @param posicion es la posicion de la lista donde esta el elemento a
     * eliminar
     * @throws Exception Lanza un error si se intenta eliminar un elemento en
     * una posicion inexistente
     */
    public void eliminar(int posicion) throws Exception;

    /**
     * Retorna el tamano actual de la lista
     *
     * @return Tamano actual de la lista
     */
    public int getTamanoLista();

    /**
     * Retorna true o false dependiendo si la lista es o no una lista vacia
     *
     * @return True o False
     */
    public boolean esVacia();
}
