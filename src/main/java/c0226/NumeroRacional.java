package c0226;

public class NumeroRacional {
	
	private int numerador;
	private int denominador;
	
	public int getNumerador() {
		return numerador;
	}

	public void setNumerador(int numerador) {
		this.numerador = numerador;
	}

	public int getDenominador() {
		return denominador;
	}

	public void setDenominador(int d) throws Exception {
		if (d == 0) {
			throw new Exception("El denominador no puede ser 0");
		} else {
			this.denominador = d;
		}
	}

	public NumeroRacional(int a, int b) throws Exception {
			setNumerador(a);
			setDenominador(b);
	}
	
	public NumeroRacional suma(NumeroRacional otroNro) throws Exception {
		int A = this.getNumerador();
		int B = this.getDenominador();
		
		int C = otroNro.getNumerador();
		int D = otroNro.getDenominador();
		
		int X = A * D + C * B;
		int Y = B * D;
		
		NumeroRacional resultado = new NumeroRacional(X, Y);
		return resultado;
	}
	
	//TODO: pendiente de implementar
	public NumeroRacional resta(NumeroRacional otroNro) throws Exception {
		return null;
	}
	
	//TODO: pendiente de implementar
	public NumeroRacional producto(NumeroRacional otroNro) throws Exception {
		return null;
	}
	
	//TODO: pendiente de implementar
	public NumeroRacional division(NumeroRacional otroNro) throws Exception {
		return null;
	}
	
	@Override
	public String toString() {
	
		return getNumerador() + "/" + getDenominador();
	}

}
