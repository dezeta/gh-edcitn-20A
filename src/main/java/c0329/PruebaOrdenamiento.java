package c0329;

public class PruebaOrdenamiento {

    public static void imprimirArray(int[] a) {
        System.out.print("\n[ ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(" " + a[i]);
        }
        System.out.print(" ]\n");
    }

    public static int[] copiarArray(int[] a) {
        int b[] = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            b[i] = a[i];
        }
        return b;
    }

    public static void main(String[] args) {
        Ordenamiento o = new Ordenamiento();

        int[] vector = {5, 1, 7, 8, 2, 3, 6, 4, 9, 0};

        //vector original
        imprimirArray(vector);

        //ordena...
        int[] c1 = copiarArray(vector);
        int[] c2 = copiarArray(vector);
        int[] c3 = copiarArray(vector);
        int[] c4 = copiarArray(vector);

        o.bubbleSort(c1);
        o.insertionSort(c2);
        o.mergeSort(c3);
        o.quickSort(c4);

        imprimirArray(c1);
        imprimirArray(c2);
        imprimirArray(c3);
        imprimirArray(c4);
    }
}
