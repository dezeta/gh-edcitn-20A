package c0312;

public class MedicionTiempo {
	public static void main(String[] args) {
		final int MAX_ITER = 100000000;
		long t1, t2;
		
		t1 = System.currentTimeMillis(); //Foto del reloj actual de la maquina

		// Se simula un computo aqui para luego medir cuanto tiempo tardo dicho computo
		int a = 0;
		for (int k = 0; k < MAX_ITER; k++) {
			a = a + 1;
		}

		t2 = System.currentTimeMillis(); // Sacamos otra foto del reloj de la máquina

		System.out.println("Tiempo de procesamiento: " + (t2 - t1) + " milisegundos");
		
		//PARA MEDIR EN NANOSEGUNDOS
		t1 = System.nanoTime(); //Foto del reloj actual de la maquina

		// Se simula un computo aqui para luego medir cuanto tiempo tardo dicho computo
		for (int k = 0; k < MAX_ITER; k++) {
			a = a + 1;
		}

		t2 = System.nanoTime(); // Sacamos otra foto del reloj de la máquina

		System.out.println("Tiempo de procesamiento: " + (t2 - t1) + " nanosegundos");
	}
}