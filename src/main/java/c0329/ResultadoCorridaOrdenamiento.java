package c0329;

public class ResultadoCorridaOrdenamiento {

	private int N;
	private long tiempoBubbleSort;
	private long tiempoInsertionSort;
	private long tiempoMergeSort;
	private long tiempoQuickSort;
	private long tiempoQuickSortJava;
	
	public ResultadoCorridaOrdenamiento(int n, long tBubble, long tInsertion, long tMerge, long tQS, long tQSJ) {
		N = n;
		tiempoBubbleSort = tBubble;
		tiempoInsertionSort = tInsertion;
		tiempoMergeSort = tMerge;
		tiempoQuickSort = tQS;
		tiempoQuickSortJava = tQSJ;
	}
	
	public int getN() {
		return N;
	}
	
	public long getTiempoMedidoEnNanosegundos(String algoritmo) {
		if (algoritmo != null && algoritmo.equalsIgnoreCase("BubbleSort")) {
			return tiempoBubbleSort;
		} else if (algoritmo != null && algoritmo.equalsIgnoreCase("InsertionSort")) {
			return tiempoInsertionSort;
		} else if (algoritmo != null && algoritmo.equalsIgnoreCase("MergeSort")) {
			return tiempoMergeSort;
		} else if (algoritmo != null && algoritmo.equalsIgnoreCase("QuickSort")) {
			return tiempoQuickSort;
		} else if (algoritmo != null && algoritmo.equalsIgnoreCase("QuickSortJava")) {
			return tiempoQuickSortJava;
		}
		return 0;
	}
	
	public long getTiempoMedidoEnMilisegundos(String algoritmo) {
		return (getTiempoMedidoEnNanosegundos(algoritmo) / 1000000);
	}
	
	@Override
	public String toString() {
		char separador = ';';
		StringBuilder sb = new StringBuilder();		
		sb.append(getN())
		  .append(separador)
		  .append(getTiempoMedidoEnMilisegundos("BubbleSort"))
		  .append(separador)
		  .append(getTiempoMedidoEnMilisegundos("InsertionSort"))
		  .append(separador)
		  .append(getTiempoMedidoEnMilisegundos("MergeSort"))
		  .append(separador)
		  .append(getTiempoMedidoEnMilisegundos("QuickSort"))
		  .append(separador)
		  .append(getTiempoMedidoEnMilisegundos("QuickSortJava"))
		  .append("\n");		
		return sb.toString();
	}
}
