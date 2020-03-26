package c0312;

public class CorridaBusquedaBinaria implements Comparable<CorridaBusquedaBinaria> {

	private int N;
	private long tiempoEstimado;
	private long tiempoMedido;
	private double relacionMedidoVsEstimado;
	
	public CorridaBusquedaBinaria(int n, long tMedido) {
		N = n;
		tiempoEstimado = (int) (N * (Math.log10(N) / Math.log10(2)));
		tiempoMedido = tMedido;
		if (tiempoEstimado > 0) {
			relacionMedidoVsEstimado = tiempoMedido / tiempoEstimado;
		}
	}
	
	public int getN() {
		return N;
	}

	public long getTiempoEstimado() {
		return tiempoEstimado;
	}

	public long getTiempoMedidoEnNanosegundos() {
		return tiempoMedido;
	}
	
	public long getTiempoMedidoEnMilisegundos() {
		return (tiempoMedido / 1000000);
	}

	/**
	 * Si la relacion converge a una cte positiva, lo Estimado es ajustado a lo Medido
	 * <br/>Si la relacion converge a cero, lo Estimado es una sobreestimacion vs lo Medido
	 * <br/>Si los valores divergen, lo Estimado es una subestimacion
	 * @return
	 */
	public double getRelacionMedidoVsEstimado() {
		return relacionMedidoVsEstimado;
	}
	
	@Override
	public int compareTo(CorridaBusquedaBinaria o) {
		if (this.getN() < o.getN()) return -1;
		if (this.getN() > o.getN()) return 1;
		return 0;
	}
	
	@Override
	public String toString() {
		char separador = ';';
		StringBuilder sb = new StringBuilder();		
		sb.append(getN())
		  .append(separador)
		  .append(getTiempoEstimado())
		  .append(separador)
		  .append(getTiempoMedidoEnMilisegundos())
		  .append(separador)
		  .append(getRelacionMedidoVsEstimado())
		  .append("\n");		
		return sb.toString();
	}
}