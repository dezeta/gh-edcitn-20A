package c0219;

import java.util.Scanner;

public class DiaSemana {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int opcion;
        do {
            System.out.println("Ingrese un nro: ");
            opcion = s.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("Domingo");
                    break;
                case 2:
                    System.out.println("Lunes");
                    break;
                case 3:
                    System.out.println("Martes");
                    break;
                case 4:
                    System.out.println("Miercoles");
                    break;
                case 5:
                    System.out.println("Jueves");
                    break;
                case 6:
                    System.out.println("Viernes");
                    break;
                case 7:
                    System.out.println("Sabado");
                    break;
                default:
                    System.out.println("Error, ingrese un valor de 1 al 7");
                    break;
            }
        } while (opcion < 1 || opcion > 7);
        s.close();
    }
}
