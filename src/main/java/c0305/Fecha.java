package c0305;

public class Fecha implements Comparable {
	
	private int dia;
	private int mes;
	private int a�o;
	
	public Fecha(int d, int m, int a) {
		dia = d;
		mes = m;
		a�o = a;
	}

	public int getDia() {
		return dia;
	}

	public void setDia(int dia) {
		this.dia = dia;
	}

	public int getMes() {
		return mes;
	}

	public void setMes(int mes) {
		this.mes = mes;
	}

	public int getA�o() {
		return a�o;
	}

	public void setA�o(int a�o) {
		this.a�o = a�o;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(dia).append("/").append(mes).append("/").append(a�o);
		return sb.toString();
	}

	@Override
	public int compareTo(Object arg0) {
		//< 0 si este objeto es menor que arg0
		//= 0 si este objeto es igual que arg0
		//> 0 si este objeto es mayor que arg0
		Fecha otraFecha = (Fecha) arg0;
		if (this.getA�o() > otraFecha.getA�o()) {
			return 1;
		} else if (this.getA�o() < otraFecha.getA�o()) {
			return -1;
		} else {
			//los a�os son iguales
			if (this.getMes() > otraFecha.getMes()) {
				return 1;
			} else if (this.getMes() < otraFecha.getMes()) {
				return -1;
			} else {
				//los meses son iguales
				if (this.getDia() > otraFecha.getDia()) {
					return 1;
				} else if (this.getDia() < otraFecha.getDia()) {
					return -1;
				} else {
					//las fechas son iguales
					return 0;
				}
			}
		}
	}

}
