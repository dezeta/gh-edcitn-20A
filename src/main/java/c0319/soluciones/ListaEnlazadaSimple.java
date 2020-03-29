package c0319.soluciones;

/**
 * Clase que implementa una Lista Enlazada mediante Referencias ("punteros").
 * Para asegurarnos de que se defina minimamente lo especificado por la InterfazLista,
 * esta clase implementa dicha Interfaz.
 * 
 * Para evitar tener una version de esta clase por cada tipo de dato, se utiliza
 * Generics de Java para generalizar y parametrizar el tipo de dato a almacenar.
 * 
 * @author Prof. Derlis Zarate (profderliszarate@gmail.com)
 * @param <TipoDeDato> Tipo de Dato a almacenar dentro de la lista
 */
public class ListaEnlazadaSimple<TipoDeDato> implements InterfazLista<TipoDeDato> {

    /**
     * Cabecera de la Lista. No almacena datos, solo el puntero al primer 
     * elemento o NULL si la lista es vacia
     */
    private NodoLista<TipoDeDato> cabecera;
    /**
     * Tamanho actual de la lista
     */
    private int tamanoLista;

    /**
     * Constructor de la clase, se inicializa la lista
     */
    public ListaEnlazadaSimple() {
        tamanoLista = 0;
        cabecera = new NodoLista<>();
        cabecera.siguiente = null;
    }

    @Override
    public void insertar(TipoDeDato nuevoDato) {
        NodoLista<TipoDeDato> nuevoNodo = new NodoLista<>();
        nuevoNodo.dato = nuevoDato;
        nuevoNodo.siguiente = cabecera.siguiente;
        cabecera.siguiente = nuevoNodo;
        tamanoLista = tamanoLista + 1;
    }

    @Override
    public void insertar(TipoDeDato nuevoDato, int posicion) throws Exception {
    	int cont = 1;
    	NodoLista<TipoDeDato> actual;
    	
    	if (posicion > 0 && posicion <= tamanoLista) {
    		actual = cabecera.siguiente;
    		while (actual != null) {
    			if (posicion == cont) {
    				NodoLista<TipoDeDato> nuevoNodo = new NodoLista<>();
    				nuevoNodo.dato = nuevoDato;
    				nuevoNodo.siguiente = actual.siguiente;
    				actual.siguiente = nuevoNodo;
    				tamanoLista++;
    				break;
    			} else {
    				actual = actual.siguiente;
    				cont++;
    			}
    		}
    	} else {
    		throw new Exception("Intendo de acceso a posicion inexistente");
    	}
    }

    @Override
    public int buscar(TipoDeDato dato) {
    	int pos = 1;
    	int retorno = -1;
    	NodoLista<TipoDeDato> actual;
    	
    	actual = cabecera.siguiente;
		while (actual != null) {
			if (dato == actual.dato) {
				retorno = pos;
				break;
			} else {
				actual = actual.siguiente;
				pos++;
			}
		}
		
		return retorno;
    }

    @Override
    public TipoDeDato obtenerDato(int posicion) throws Exception {
        int posActual = 1;
        TipoDeDato retorno = null;
        NodoLista<TipoDeDato> actual;

        if (posicion > 0 && posicion <= tamanoLista) {
            actual = cabecera.siguiente;
            while (actual != null) {
                if (posicion == posActual) {
                    retorno = actual.dato;
                    break;
                } else {
                    actual = actual.siguiente;
                    posActual++;
                }
            }
        } else {
            throw new Exception("Intento de acceso a posicion inexistente");
        }

        return retorno;
    }

    @Override
    public void eliminar() {
        if (!esVacia()) {
            cabecera.siguiente = cabecera.siguiente.siguiente;
            tamanoLista = tamanoLista - 1;
        }
    }

    @Override
    public void eliminar(int posicion) throws Exception {
    	int posActual = 1;
    	NodoLista<TipoDeDato> anterior, actual;
    	
    	if (posicion > 0 && posicion <= tamanoLista) {
    		anterior = cabecera;
    		actual = cabecera.siguiente;
    		while (actual != null) {
    			if (posicion == posActual) {
    				anterior.siguiente = actual.siguiente;
    				tamanoLista--;
    				break;
    			} else {
    				anterior = actual;
    				actual = actual.siguiente;
    				posActual++;
    			}
    		}
    	} else {
    		throw new Exception("Intendo de acceso a posicion inexistente");
    	}
    }

    @Override
    public int getTamanoLista() {
        return tamanoLista;
    }

    @Override
    public boolean esVacia() {
        if (tamanoLista == 0) {
            return true;
        } else {
            return false;
        }
    }
    
    public IteradorLista<TipoDeDato> getIterador() {
        return new IteradorLista<>(cabecera);
    }
}
