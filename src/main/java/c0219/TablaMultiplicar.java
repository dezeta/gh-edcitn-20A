package c0219;

import java.util.Scanner;

public class TablaMultiplicar {
    public static void imprimirTablaMultiplicar (int nro) {
        for (int i = 1; i <= 10; i++) {
            System.out.printf("%d x %d = %d\n", i, nro, (i*nro));
        }
    }

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Ingrese nro para calcular la tabla de multiplicar: ");
        int nro = s.nextInt();
        imprimirTablaMultiplicar(nro);

        s.close();
    }
}
