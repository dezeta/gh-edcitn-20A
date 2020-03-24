package c0305;

public class Cerrojo {
	private int combinacionSecreta;
	private boolean abierto;
	
	public Cerrojo (int combinacion) throws Exception {
		setCombinacion(combinacion);
		abierto = false;
	}
	
	/**
	 * Funcion que permite abrir el cerrojo si la combinacion de seguridad es correcta, en caso contrario, da una exception
	 * @param clave
	 */
	public void abrir(int clave) throws Exception {
		if (clave == combinacionSecreta) {
			abierto = true;
		} else {
			throw new Exception("La clave no es válida.");
		}
	}
	
	public void cerrar() {
		abierto = false;
	}
	
	public boolean estaAbierto() {
		return abierto;
	}
	
	public void cambiarCombinacion(int claveVieja, int claveNueva) throws Exception {
		if (claveVieja == combinacionSecreta) {
			setCombinacion(claveNueva);
		} else {
			throw new Exception("Error: clave actual invalida");
		}
	}
	
	private void setCombinacion(int c) throws Exception {
		//if c no supera 3 digitos
		if (c >=  0 && c <= 999) {
			combinacionSecreta = c;
		} else {
			throw new Exception("La clave de seguridad debe ser de 1 a 3 digitos positivos");
		}
	}
	
	
	
}
