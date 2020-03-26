package c0312;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Clase NBusquedasBinarias
 * 
 * Este programa puede ejecutarse de 3 maneras posibles:
 * Ejemplos
 *   a. Opcion 1: con 1 solo parametro de entrada y archivo CSV de salida
 *      java NBusquedasBinarias 5000 > datosResultantes.csv
 *      
 *      El programa asume que ejecutara su prueba en modo continuo, con el valor de entrada 5000
 *      en ese caso, ejecutara la muestra con N=1, luego N=2, N=3, N=4, N=5, ...N=100, ... N=5000
 *      y por cada valor de N, medira el tiempo de ejecucion y genera un archivo CSV como salida
 *      que podra abrirse con cualquier planilla de calculo tipo Excel, Open Office, etc.
 * 
 *   b. Opcion 2: con varios parametros de entrada
 *      java NBusquedasBinarias 50 100 150 200 250 500
 *      
 *      El programa asume que ejecutara su prueba en modo no continuo, con cada valor de entrada recibido
 *      en ese caso, ejecutara la muestra con N=50, luego N=100, N=150, N=200, N=250 y N=500
 *      y por cada valor de N, medira el tiempo de ejecucion y genera una tabla en pantalla
 *
 *   c. Opcion 3: sin parametros de entrada
 *      java NBusquedasBinarias
 *      
 *      El programa asume que pedira al usuario la cantidad de corridas y valores de N a usar
 *      en ese caso, ejecutara la muestra con los datos ingresados por el usuario
 *      y por cada valor de N, medira el tiempo de ejecucion y genera una tabla en pantalla
 *
 * @author Derlis Zarate
 */
public class NBusquedasBinarias {

	public static void main(String[] args) {
		
		boolean modoContinuo = false;		
		
		int tamanosArrays[];
		if (args.length == 1) {
			tamanosArrays = new int[1];
			tamanosArrays[0] = Integer.parseInt(args[0]);
			modoContinuo = true;
		} else if (args.length > 1) {
			tamanosArrays = new int[args.length];
			for (int i=0; i < args.length; i++) {
				tamanosArrays[i] = Integer.parseInt(args[i]);
			}
		} else {
			Scanner s = new Scanner(System.in);
			System.out.print("\nIngrese cantidad de valores de N que usara como prueba: ");
			tamanosArrays = new int[s.nextInt()];
			for (int i=0; i < tamanosArrays.length; i++) {
				System.out.print("\n\tIngrese tamano del array nro. " + (i + 1) + ": ");
				tamanosArrays[i] = s.nextInt();
			}
			s.close();
		}
				
		int cantidadCorridas = (modoContinuo) ? tamanosArrays[0] : tamanosArrays.length;
		CorridaBusquedaBinaria datosCorridas[] = new CorridaBusquedaBinaria[cantidadCorridas];
		for (int i = 0; i < cantidadCorridas; i++) {

			int N = (modoContinuo) ? (i+1) : tamanosArrays[i];
			int[] numeros = generarArrayAleatorio(N);
			Arrays.sort(numeros); //esta funcion Arrays.sort ordena un array por QuickSort

			// busqueda de N elementos aleatorios
			long t1 = System.nanoTime(); // instantanea de tiempo
			for (int j = 0; j < N; j++) {
				int nroABuscar = (int) (Math.random() * Integer.MAX_VALUE);
				int pos = busquedaBinaria(numeros, nroABuscar);
			}
			long t2 = System.nanoTime(); // instantanea de tiempo

			datosCorridas[i] = new CorridaBusquedaBinaria(N, (t2-t1));
			if (modoContinuo) {
				if (i == 0) System.out.print("N;TEstimado;TMedido;Relacion\n");
				System.out.print(datosCorridas[i]);
			}
		}
		
		if (!modoContinuo) imprimirTabla(datosCorridas, ';');
	}

	public static int[] generarArrayAleatorio(int N) {
		int[] array = new int[N];
		for (int i = 0; i < N; i++) {
			array[i] = (int) (Math.random() * Integer.MAX_VALUE);
		}
		return array;
	}

	public static int busquedaBinaria(int[] array, int nroABuscar) {
		int ini, fin, pos;
		ini = 0;
		fin = array.length - 1;
		while (ini <= fin) {
			pos = (ini + fin) / 2;
			if (array[pos] == nroABuscar) {
				return pos;
			} else if (array[pos] < nroABuscar) {
				ini = pos + 1;
			} else {
				fin = pos - 1;
			}
		}

		return -1;
	}
	
	public static void imprimirArray(int[] array) {
		System.out.print("\nArray: (");
		for (int i = 0; i < array.length; i++) {
			System.out.print(" " + array[i]);
		}
		System.out.print(")\n");
	}

	public static void imprimirTabla(CorridaBusquedaBinaria[] datosCorridas, char separador) {
		
		StringBuilder sb = new StringBuilder();
		sb.append("\nResultado:\n\n")
		  .append("N").append(separador)
		  .append("TEstimado").append(separador)
		  .append("TMedido").append(separador)
		  .append("Relacion").append(separador).append("\n");
		
		for (int i=0; i<datosCorridas.length; i++) {
			sb.append(datosCorridas[i].getN())
			  .append(separador)
			  .append(datosCorridas[i].getTiempoEstimado())
			  .append(separador)
			  .append(datosCorridas[i].getTiempoMedidoEnMilisegundos())
			  .append(separador)
			  .append(datosCorridas[i].getRelacionMedidoVsEstimado())
			  .append("\n");
		}
		System.out.println(sb.toString());
	}
}
