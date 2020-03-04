package c0227;

import java.util.Scanner;

public class SubconjuntoCadenas {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.printf("\nIngrese una cadena: ");
        String str1 = s.nextLine();

        System.out.printf("\nIngrese otra cadena: ");
        String str2 = s.nextLine();

        boolean resultado = checkSubcadena(str1, str2);
        System.out.printf("\n\tResultado: \"%s\" es una subcadena de \"%s\": %s\n", str1, str2, resultado);
        
        s.close();
    }

    private static boolean checkSubcadena(String str1, String str2) {
        boolean esSubcadena = false;

        int ci = 0;
        int cj = 0;
        int li = str1.length();
        int lj = str2.length();

        if (li <= lj) {
            while ((cj < lj) && !esSubcadena) {
                if (str1.charAt(ci) == str2.charAt(cj)) {
                    ci++;
                    cj++;
                    if (ci == li) {
                        esSubcadena = true;
                    }

                } else if (ci > 0) {
                    ci = 0;

                } else {
                    cj++;

                }
            }
        }

        //System.out.printf("\n(DEBUG) La pos. es %d\n", (cj-li));

        return esSubcadena;
    }
}
