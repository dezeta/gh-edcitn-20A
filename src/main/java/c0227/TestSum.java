package c0227;

import java.io.*;

public class TestSum {

    public static void main(String[] args) {

        if (args.length == 0) {
            System.out.println("Por favor, ingrese al menos 1 nombre de archivo como argumento de linea de comandos.");

        } else {

            long sumas[] = new long[args.length];

            for (int i = 0; i < args.length; i++) {

                String archivo = args[i];
                sumas[i] = testsum(archivo);

            }

            for (int i = 0; i < sumas.length; i++) {

                System.out.printf("\nEl testsum del archivo %s es %d", args[i], sumas[i]);

            }

        }
    }

    private static long testsum(String archivo) {
        long acumulado = 0;

        try {

        	//Lectura de archivos en el classpath
            //BufferedReader reader = new BufferedReader(new InputStreamReader(TestSum.class.getResourceAsStream(archivo)));

        	//Lectura de archivos desde el filesystem
            BufferedReader reader = new BufferedReader(new FileReader(archivo));
            String line;
            while ((line = reader.readLine()) != null) {
                for (int i = 0; i < line.length(); i++) {
                    acumulado = acumulado + (int) line.charAt(i);
                }
            }
            reader.close();

        } catch (Exception e) {
            System.out.println("No se pudo leer el archivo, favor verifique");
        }

        return acumulado;
    }
}
