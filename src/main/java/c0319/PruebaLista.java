package c0319;

/**
 * Clase de prueba de Lista Enlazada
 * @author Prof. Derlis Zarate (profderliszarate@gmail.com)
 */
public class PruebaLista {

    public static void main(String[] args) {

        //Se crea una lista de Integers
        ListaEnlazadaSimple<Integer> lista = new ListaEnlazadaSimple<>();

        try {
            //Se insertan 3 elementos y luego se itera con un for para imprimirlos
            lista.insertar(4);
            lista.insertar(5);
            lista.insertar(6);
            for (int i = 1; i <= lista.getTamanoLista(); i++) {
                System.out.println("Valor " + i + ": " + lista.obtenerDato(i));
            }

            //Se eliminan 2 elementos de la cabecera y luego se imprime de nuevo para ver como queda
            lista.eliminar();
            lista.eliminar();
            for (int i = 1; i <= lista.getTamanoLista(); i++) {
                System.out.println("Valor " + i + ": " + lista.obtenerDato(i));
            }

            //Se elimina el ultimo elemento de la cabecera
            lista.eliminar();
            
            //Se insertan 3 nuevos elementos en la cabecera
            lista.insertar(1);
            lista.insertar(2);
            lista.insertar(3);
            
            //Se recorre e imprime la lista usando un iterador (alternativa al for)
            IteradorLista<Integer> it = lista.getIterador();
            while (it.hasNext()) {
                System.out.println("Valor: " + it.next());
            }

        } catch (Exception e) {
            System.out.println("Error al ejecutar el programa. " + e.getMessage());
        }

    }
}
