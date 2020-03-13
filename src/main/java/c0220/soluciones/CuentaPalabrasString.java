package c0220.soluciones;

import java.util.Scanner;

public class CuentaPalabrasString {

	public static void main(String args[]) {
		System.out.println("Por favor, ingrese una cadena: ");
		Scanner s = new Scanner(System.in);
		// String cadena = s.nextLine();
		//Para pruebas
		String cadena = "el string de ejemplo se muestra como el string de el primer ejercicio de hoy y no de ma�ana";

		ElementoDiccionario[] listaPalabras;
		listaPalabras = new ElementoDiccionario[10000];

		String[] palabras = cadena.split(" ");
		int cantidadPalabrasCargadas = 0;
		for (int i = 0; i < palabras.length; i++) {
			String palLeida = palabras[i];

			// Buscar palLeida en el array listaPalabras
			// si ya existia, incrementar su repeticion
			// si no existia, insertar la palabra
			int posActual = 0;
			ElementoDiccionario actual = listaPalabras[posActual];
			while (actual != null) {
				if (actual.palabra.equalsIgnoreCase(palLeida)) {
					actual.nroRepeticiones = actual.nroRepeticiones + 1;
					break;
				} else {
					posActual = posActual + 1;
					actual = listaPalabras[posActual];
				}
			}

			if (actual == null) {
				ElementoDiccionario nuevoElemento = new ElementoDiccionario();
				nuevoElemento.palabra = palLeida;
				nuevoElemento.nroRepeticiones = 1;
				listaPalabras[posActual] = nuevoElemento;
				cantidadPalabrasCargadas++;
			}

		}

		System.out.println("Resultado:\n");
		/*for (int i = 0; i < cantidadPalabrasCargadas; i++) {
			System.out.printf("Palabra %s, se repite %d\n", listaPalabras[i].palabra, listaPalabras[i].nroRepeticiones);
		}*/

		//DONE: Imprimir las 3 primeras posiciones
		//DONE: Ordenar el array listaPalabras de manera descendente
        insertionSort(listaPalabras, cantidadPalabrasCargadas);
        
        //Imprimir las 3 primeras posiciones
        System.out.println("\nLas 3 palabras más repetidas son: ");
        for (int i = 0; i < 3; i++) {
			System.out.printf("\tPalabra: %s, Repeticiones: %d\n", listaPalabras[i].palabra, listaPalabras[i].nroRepeticiones);
		}

    	s.close();

    }

	private static void insertionSort(ElementoDiccionario[] array, int n) {
        for (int j = 1; j < n; j++) {  
            ElementoDiccionario item = array[j];  
            int i = j-1;  
            while ( (i > -1) && ( array[i].nroRepeticiones < item.nroRepeticiones ) ) {  
                array [i+1] = array [i];  
                i--;  
            }  
            array[i+1] = item;  
        }  		
	}

}
