package c0220.laboratorio;

import java.util.Scanner;

public class CuentaPalabrasString {

	public static void main(String args[]) {
		System.out.println("Por favor, ingrese una cadena: ");
		Scanner s = new Scanner(System.in);
		// String cadena = s.nextLine();
		//Para pruebas
		String cadena = "el string de ejemplo se muestra como el string de el primer ejercicio de hoy y no de mañana";

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
		for (int i = 0; i < cantidadPalabrasCargadas; i++) {
			System.out.printf("Palabra %s, se repite %d\n", listaPalabras[i].palabra, listaPalabras[i].nroRepeticiones);

		}

		// TODO: Ordenar el array listaPalabras 
		

		// TODO: Imprimir las 3 primeras posiciones
		
		s.close();

	}

}
