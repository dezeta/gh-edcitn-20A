package c0226;
import java.util.Scanner;

public class CuentaPalabrasString {

    public static void main(String args[]) {
        System.out.println("Por favor, ingrese una cadena: ");
        Scanner s = new Scanner(System.in);
        //String cadena = s.nextLine();
        String cadena = "el string de ejemplo se muestra como el string de el primer ejercicio de hoy y no de mañana";

        ElementoDiccionario[] listaPalabras;
        listaPalabras = new ElementoDiccionario[10000];

        int cantPalabras = 0;
        String[] palabras = cadena.split(" ");
        for (int i=0; i<palabras.length; i++) {
            String palLeida = palabras[i];


            //Buscar palLeida en el array listaPalabras
            //   si ya existia, incrementar su repeticion
            //   si no existia, insertar la palabra
            int posActual = 0;
            ElementoDiccionario actual = listaPalabras[posActual];
            while (actual != null) {
                if (actual.getPalabra().equalsIgnoreCase(palLeida)){
                    //actual.setNroRepeticiones(actual.getNroRepeticiones() + 1);
                	actual.incrementarNroRepeticiones();
                    break;
                } else {
                    posActual = posActual + 1;
                    actual = listaPalabras[posActual];
                }
            }

            if (actual == null) {
                ElementoDiccionario nuevoElemento = new ElementoDiccionario();
                nuevoElemento.setPalabra(palLeida);
                nuevoElemento.setNroRepeticiones(1);
                listaPalabras[posActual] = nuevoElemento;
                cantPalabras++;
            }

        }

        System.out.println("\nPalabras Leidas:");
        for (int i=0; i<cantPalabras; i++) {
            System.out.printf("\tPalabra %s, se repite %d\n",
                    listaPalabras[i].getPalabra(),
                    listaPalabras[i].getNroRepeticiones());

        }

        //Ordenar el array listaPalabras de manera descendente
        insertionSort(listaPalabras, cantPalabras);
        
        //Imprimir las 3 primeras posiciones
        System.out.println("\nLas 3 palabras más repetidas son: ");
        for (int i = 0; i < 3; i++) {
			System.out.printf("\tPalabra: %s, Repeticiones: %d\n", listaPalabras[i].getPalabra(), listaPalabras[i].getNroRepeticiones());
		}
        
        s.close();

    }

	private static void insertionSort(ElementoDiccionario[] array, int n) {
        for (int j = 1; j < n; j++) {  
            ElementoDiccionario item = array[j];  
            int i = j-1;  
            while ( (i > -1) && ( array[i].getNroRepeticiones() < item.getNroRepeticiones() ) ) {  
                array [i+1] = array [i];  
                i--;  
            }  
            array[i+1] = item;  
        }  		
	}

}
