package c0227;

import java.io.*;

public class CuentaPalabrasRepetidas {

	public static void main(String[] args) {

		if (args.length == 0) {
			System.out.println("Por favor, ingrese al menos 1 nombre de archivo como argumento de linea de comandos.");

		} else {

			for (int i = 0; i < args.length; i++) {

				String archivo = args[i];
				cuentaRepetidas(archivo);
			}
		}
	}

	private static void cuentaRepetidas(String archivo) {

		try {

			Diccionario d = new Diccionario();
			BufferedReader reader = new BufferedReader(new FileReader(archivo));
			String line;
			while ((line = reader.readLine()) != null) {
				String[] palabras = line.split(" ");
				for (int i=0; i<palabras.length; i++) {
					String w = palabras[i];
					if (w != null && w.trim().length() > 0) {
						d.aumentarRepeticiones(w);
					}
				}
			}
			reader.close();
			
			d.ordenarDiccionario();
			System.out.println("Cantidad de repeticiones del archivo " + archivo);
			d.imprimirDiccionario(10);

		} catch (Exception e) {
			System.out.println("No se pudo leer el archivo, favor verifique");
		}

	}
}
