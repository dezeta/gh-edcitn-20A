package c0220.soluciones;

import java.util.Scanner;

public class CalculaCalificacion {

	private final static double PESO_LABS      = 0.20;
	private final static double PESO_TPF       = 0.30;
	private final static double PESO_PARCIALES = 0.50;
	
	private final static double PESO_PP = 0.40;
	private final static double PESO_PF = 0.60;
	
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.print("\nIngrese puntaje Parcial 1: ");
		int pParcial1 = s.nextInt();
		
		System.out.print("\nIngrese puntaje Parcial 2: ");
		int pParcial2 = s.nextInt();
		
		System.out.print("\nIngrese puntaje Laboratorios: ");
		int pLaboratorios = s.nextInt();
		
		System.out.print("\nIngrese puntaje TPF: ");
		int pTPF = s.nextInt();
		
		System.out.print("\nIngrese puntaje Final: ");
		int pFinal = s.nextInt();
		
		long promedioParciales = Math.round((pParcial1 + pParcial2) / 2.0);
		long promedioPonderado =  Math.round(PESO_LABS * pLaboratorios) + Math.round(PESO_TPF * pTPF) + Math.round(PESO_PARCIALES * promedioParciales);
		
		int calificacion = 1;
		String strCalificacion[] = {"","uno","dos","tres","cuatro","cinco"};
		long pFinalCalculado = Math.round(promedioPonderado * PESO_PP) + Math.round(pFinal * PESO_PF);		
		if (pFinalCalculado >= 91) {
			calificacion = 5;
		} else if (pFinalCalculado >= 81) {
			calificacion = 4;
		} else if (pFinalCalculado >= 71) {
				calificacion = 3;
		} else if (pFinalCalculado >= 60) {
			calificacion = 2;
		}
		
		//TODO: el formateo de la impresion de los datos finales... queda como ejercicio
		System.out.printf("\nPF Calculado es %d. La calificacion es %d (%s)", pFinalCalculado, calificacion, strCalificacion[calificacion]);
		
		s.close();
	}
	
}
