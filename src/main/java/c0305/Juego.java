package c0305;

import java.util.Scanner;

public class Juego {

	Jugador jug;
	Dado d1, d2;

	public Juego() {
		jug = null;
		d1 = new Dado();
		d2 = new Dado();
	}

	public void jugarJuego() {
		
		Scanner s = new Scanner(System.in);
		
		System.out.print("Ingrese nombre del jugador: ");
		String nom = s.nextLine();

		jug = new Jugador(nom);
		d1.lanzar();
		d2.lanzar();

		if (d1.getValor() + d2.getValor() == 7) {
			System.out.printf("Felicitaciones %s HAS GANADO porque los dados dieron %d y %d\n", jug.getNombre(), d1.getValor(), d2.getValor());
		} else {
			System.out.printf("Uff %s HAS PERDIDO porque los dados dieron %d y %d\n", jug.getNombre(), d1.getValor(), d2.getValor());			
		}
		
		s.close();
	}
}
