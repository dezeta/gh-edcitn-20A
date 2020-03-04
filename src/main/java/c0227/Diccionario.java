package c0227;

/**
 * La restriccion del ejercicio nos impide usar otra ED que no sea un array nativo de Java
 * @author dezeta
 *
 */
public class Diccionario {

	private int DICT_SIZE;
	private ElementoDiccionario[] listaPalabras;
	private int cantidadElementos;
	
	public Diccionario() {
		DICT_SIZE = 1000; //por defecto admitimos hasta 1000 palabras, se debe ajustar el codigo si queremos redimensionar automaticamente 
		cantidadElementos = 0;
		listaPalabras = new ElementoDiccionario[DICT_SIZE];
	}
	
	public int getCantidadElementos() {
		return cantidadElementos;
	}
	
	public void aumentarRepeticiones(String palabra) throws Exception {
		if (palabra != null && palabra.trim().length() > 0) {
			
			String key = palabra.trim();
			int posItem = privBuscarElemento(key);
			if (posItem == -1) {
				if (cantidadElementos < DICT_SIZE) {
					listaPalabras[cantidadElementos] = new ElementoDiccionario(key, 1);
					cantidadElementos = cantidadElementos + 1;
				} else {
					throw new Exception("Diccionario lleno, no se pueden insertar mas palabras");
				}
				
			} else {
				listaPalabras[posItem].incrementarCantRepeticiones();
			}
			
		} else {
			throw new Exception("La palabra a actualizar no puede ser vacia");
		}
	}

	private int privBuscarElemento(String key) {
		int pos = -1;
		
		for (int i=0; i<cantidadElementos; i++) {
			if (listaPalabras[i].getPalabra().compareTo(key) == 0) {
				pos = i;
				break;
			}
		}
		
		return pos;
	}
	
	//InsertionSort
	public void ordenarDiccionario() {  
        int n = cantidadElementos;  
        for (int j = 1; j < n; j++) {  
            ElementoDiccionario key = listaPalabras[j];  
            int i = j-1;  
            while ( (i > -1) && ( listaPalabras[i].getCantRepeticiones() > key.getCantRepeticiones() ) ) {  
            	listaPalabras[i+1] = listaPalabras[i];  
                i--;  
            }  
            listaPalabras[i+1] = key;  
        }  
    }  
	
	public void imprimirDiccionario(int cantidadFilas) {
		int cf = 0;
		for (int i=cantidadElementos-1; i >= 0 && cf <= cantidadFilas; i--) {
			System.out.println("\t" + listaPalabras[i]);
			cf++;
		}
	}
}