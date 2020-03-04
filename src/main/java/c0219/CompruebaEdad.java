package c0219;

import java.util.Scanner;

public class CompruebaEdad {

    public static void main(String[] args) throws Exception {

        Scanner s = new Scanner(System.in);
        System.out.println("Ingrese su edad :");
        int edad = s.nextInt();

        //if (edad == 037) {
        if (edad == 37) {
            System.out.println("Su edad es 37 años");
        } else {
            System.out.println("Su edad es NO 37 años");
        }
        
        s.close();
    }

}
