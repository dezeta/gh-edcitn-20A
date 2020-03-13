package c0304;

import java.util.Scanner;

public class Teclado {
    //Atributos
    private Scanner teclado;
    
    //Constructor
    public Teclado() {
        teclado = new Scanner(System.in);
    }
    
    //Metodo que lee un numero entero del teclado
    public int obtenerEntradaInt() {
        int valorLeido = teclado.nextInt();
        return valorLeido;
    }
    
    //Metodo que lee un numero double del teclado
    public double obtenerEntradaDouble() {
        double valorLeido = teclado.nextDouble();
        return valorLeido;
    }
    
    //metodo que simula una pausa
    public void hacerPausa() {
        System.out.print("\nPresione algun numero para continuar...");
        teclado.nextInt();
    }
}
