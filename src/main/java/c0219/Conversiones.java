package c0219;

public class Conversiones {

    public static double division (int x, int y) {
        //return  x / y;
        return (double) x / y;
    }

    public static void main(String[] args) {
        int a = 3;
        int b = 2;
        double c = division(a, b);
        System.out.printf("La division entre %d y %d es %f\n", a, b, c);
    }
}
