package c0305;

public class Fecha implements Comparable {
	
	private int dia;
	private int mes;
	private int año;
	
	public Fecha(int d, int m, int a) {
		dia = d;
		mes = m;
		año = a;
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

	public int getAño() {
		return año;
	}

	public void setAño(int año) {
		this.año = año;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(dia).append("/").append(mes).append("/").append(año);
		return sb.toString();
	}

	@Override
	public int compareTo(Object arg0) {
		//< 0 si este objeto es menor que arg0
		//= 0 si este objeto es igual que arg0
		//> 0 si este objeto es mayor que arg0
		Fecha otraFecha = (Fecha) arg0;
		if (this.getAño() > otraFecha.getAño()) {
			return 1;
		} else if (this.getAño() < otraFecha.getAño()) {
			return -1;
		} else {
			//los años son iguales
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
