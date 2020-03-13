package c0227;

public class ElementoDiccionario {

	private String palabra;
	private long cantRepeticiones;
	
	public ElementoDiccionario(String p, long r) throws Exception {
		setPalabra(p);
		setCantRepeticiones(r);
	}

	public String getPalabra() {
		return palabra;
	}

	public void setPalabra(String palabra) throws Exception {
		if (palabra != null && palabra.trim().length() > 0) {
			this.palabra = palabra.trim();
		} else {
			throw new Exception("La palabra no puede ser una vacia");
		}
	}

	public long getCantRepeticiones() {
		return cantRepeticiones;
	}

	public void setCantRepeticiones(long cantRepeticiones) throws Exception {
		if (cantRepeticiones >= 0) {
			this.cantRepeticiones = cantRepeticiones;
		} else {
			throw new Exception("La cantidad de repeticiones debe ser mayor o igual a cero");
		}
	}
	
	public void incrementarCantRepeticiones() {
		try {
			setCantRepeticiones(getCantRepeticiones()+1);
		} catch (Exception e) {
			this.cantRepeticiones = 0;
		}
	}
	
	public String toString() {
		return getCantRepeticiones() + " repeticiones:\t" + getPalabra();
	}
}
