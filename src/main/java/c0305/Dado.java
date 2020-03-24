package c0305;

public class Dado {

	private int valor;

	public void lanzar() {
		valor = (int) (Math.random() * 5) + 1;
	}

	public int getValor() {
		return valor;
	}
}
