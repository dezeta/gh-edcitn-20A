package c0319.soluciones;

/**
 * Clase que representa un Nodo de una Lista Enlazada
 * @author Prof. Derlis Zarate (profderliszarate@gmail.com)
 * @param <TipoDeDato> Tipo de Dato a almacenar dentro del nodo.
 */
public class NodoLista<TipoDeDato> {

    /**
     * Dato almacenado en el Nodo
     */
    TipoDeDato dato;
    
    /**
     * Referencia al siguiente nodo
     */
    NodoLista siguiente;

    /**
     * @return Dato almacenado en el nodo
     */
    public TipoDeDato getDato() {
        return dato;
    }

    /**
     * @param dato Dato a setear en el nodo
     */
    public void setDato(TipoDeDato dato) {
        this.dato = dato;
    }

    /**
     * @return Referencia al siguiente nodo o NULL
     */
    public NodoLista getSiguiente() {
        return siguiente;
    }

    /**
     * @param siguiente Referencia a setear como siguiente de este Nodo
     */
    public void setSiguiente(NodoLista siguiente) {
        this.siguiente = siguiente;
    }
}
