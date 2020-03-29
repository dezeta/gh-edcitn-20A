package c0319.soluciones;

public class InterseccionListas {

	public static void main(String[] args) throws Exception {

        //Se crea un par de listas de cadenas
        ListaEnlazadaSimple<String> listaA = new ListaEnlazadaSimple<>();
        listaA.insertar("Juan");
        listaA.insertar("Pablo");
        listaA.insertar("Pedro");
        listaA.insertar("Ana");
        listaA.insertar("Cecilia");
        listaA.insertar("Jose");
        listaA.insertar("Mateo");
        
        ListaEnlazadaSimple<String> listaB = new ListaEnlazadaSimple<>();
        listaB.insertar("Antonella");
        listaB.insertar("Maria");
        listaB.insertar("Pedro");
        listaB.insertar("Josue");
        listaB.insertar("Ana");
        listaB.insertar("Marcos");
        listaB.insertar("Mateo");
        
        //Lista resultante
        ListaEnlazadaSimple<String> listaInterseccion = new ListaEnlazadaSimple<>();
        
        
        //Calculo de la interseccion
        IteradorLista<String> itA = listaA.getIterador();
        IteradorLista<String> itB = listaB.getIterador();
        while (itA.hasNext()) {
        	String itemA = itA.next();
        	itB.first();
        	while (itB.hasNext()) {
        		String itemB = itB.next();
        		if (itemA.equalsIgnoreCase(itemB)) {
        			//debe ir al resultante
        			listaInterseccion.insertar(itemA);
        		}
        	}
        }
        
        //Sin calcular el T(n) exacto, sabemos que el O(N) es del orden de N al cuadrado
        
        
        //Impresion de lista resultante
        IteradorLista<String> itR = listaInterseccion.getIterador();
        StringBuilder sb = new StringBuilder();
        sb.append("\nLista resultante: { ");
        while(itR.hasNext()) {
        	String elemento = itR.next();
        	sb.append(elemento);
        	sb.append(" ");
        }
        sb.append(" }\n");
        System.out.println(sb.toString());

    }
	
}
