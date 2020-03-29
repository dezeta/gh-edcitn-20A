package c0329;

import java.util.Arrays;

public class ComparacionAlgoritmosOrdenamiento {

    public static void main(String[] args) {
        Ordenamiento o = new Ordenamiento();

        int tamanosArrays[];
		if (args.length > 1) {
			tamanosArrays = new int[args.length];
			for (int i=0; i < args.length; i++) {
				tamanosArrays[i] = Integer.parseInt(args[i]);
			}
		} else {
			tamanosArrays = null;			
			System.err.println("Debe indicar al menos 2 tamanhos de arrays para ejecutar el main. Ejemplo: java ComparacionAlgoritmosOrdenamiento 5000 10000 15000 20000");
			System.exit(-1);
		}
		
		ResultadoCorridaOrdenamiento datosCorridas[] = new ResultadoCorridaOrdenamiento[tamanosArrays.length];
		for (int i = 0; i < tamanosArrays.length; i++) {
			int N = tamanosArrays[i];
			
			//Generacion de datos de prueba
			int[] vectorAOrdenar = generarArrayAleatorio(N);			
			int[] c1 = copiarArray(vectorAOrdenar);
	        int[] c2 = copiarArray(vectorAOrdenar);
	        int[] c3 = copiarArray(vectorAOrdenar);
	        int[] c4 = copiarArray(vectorAOrdenar);
	        int[] c5 = copiarArray(vectorAOrdenar);
	        
	        //Ordenamiento y comparacion de tiempos
	        long t1 = System.nanoTime(); // instantanea de tiempo
	        o.bubbleSort(c1);	//esta funcion ordena un array por BubbleSort implementado en la clase Ordenamiento.java
	        long t2 = System.nanoTime(); // instantanea de tiempo
	        o.insertionSort(c2);//esta funcion ordena un array por InsertionSort implementado en la clase Ordenamiento.java
	        long t3 = System.nanoTime(); // instantanea de tiempo
	        o.mergeSort(c3);	//esta funcion ordena un array por MergeSort implementado en la clase Ordenamiento.java
	        long t4 = System.nanoTime(); // instantanea de tiempo
	        o.quickSort(c4);    //esta funcion ordena un array por QuickSort implementado en la clase Ordenamiento.java
	        long t5 = System.nanoTime(); // instantanea de tiempo
	        Arrays.sort(c5);    //esta funcion ordena un array por QuickSort de Java
	        long t6 = System.nanoTime(); // instantanea de tiempo
	        
			//Registro de resultados en la tabla e impresion en pantalla
	        datosCorridas[i] = new ResultadoCorridaOrdenamiento(N, (t2-t1), (t3-t2), (t4-t3), (t5-t4), (t6-t5));
			if (i == 0) System.out.print("N;TBubbleSort;TInsertionSort;TMergeSort;TQuickSort;TQuickSortJava\n");
			System.out.print(datosCorridas[i]);
		}
    }   
    
    public static int[] generarArrayAleatorio(int N) {
		int[] array = new int[N];
		for (int i = 0; i < N; i++) {
			array[i] = (int) (Math.random() * Integer.MAX_VALUE);
		}
		return array;
	}

    public static int[] copiarArray(int[] a) {
        int b[] = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            b[i] = a[i];
        }
        return b;
    }
}
