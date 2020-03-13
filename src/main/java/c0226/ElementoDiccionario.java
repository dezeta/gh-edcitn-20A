package c0226;
public class ElementoDiccionario {

	private static int cantidadObjetos;
    private String palabra;
    private int nroRepeticiones;
    
    @Override
    public String toString() {
    	return "Palabra = "+ palabra + " se repite " + nroRepeticiones + " veces.";
    }
    
    public ElementoDiccionario() {
    	palabra = "";
    	nroRepeticiones = 0;
    	cantidadObjetos++;
    }
    
    public ElementoDiccionario(String p, int n) {
    	palabra = p;
    	nroRepeticiones = n;
    	cantidadObjetos++;
    }
    
    public void incrementarNroRepeticiones() {
    		nroRepeticiones++;
    }
    
	public String getPalabra() {
		return palabra;
	}
	public void setPalabra(String palabra) {
		this.palabra = palabra;
	}
	
	public int getNroRepeticiones() {
		return nroRepeticiones;
	}
	public void setNroRepeticiones(int nroRepeticiones) {
		this.nroRepeticiones = nroRepeticiones;
	}
	
	public static int conocerCantidadDeObjetosCreados() {
		return cantidadObjetos;
	}

}
