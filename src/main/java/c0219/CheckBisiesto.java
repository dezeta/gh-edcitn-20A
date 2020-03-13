package c0219;

import java.util.Scanner;

public class CheckBisiesto {
    public static boolean esBisiesto(int anio) {
        boolean resp = false;

        if ((anio > 0) && (anio % 4 == 0) && ((anio % 100 != 0 || (anio % 400 == 0)))) {
            resp = true;
        }

        return resp;
    }

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Ingrese un nro. que represente un año: ");
        int anio = s.nextInt();

        if (esBisiesto(anio)) {
            System.out.printf("\n\tEl año %d %s es bisiesto.\n", anio, "SI");
        } else {
            System.out.printf("\n\tEl año %d %s es bisiesto.\n", anio, "NO");
        }
        
        s.close();
    }
}
