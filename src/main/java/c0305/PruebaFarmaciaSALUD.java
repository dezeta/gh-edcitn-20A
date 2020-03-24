package c0305;

import java.util.Scanner;

public class PruebaFarmaciaSALUD {

	public static void main(String[] args) {
		// Inicializar algun array de LotesDeMedicamentos y cargar algunos valores de
		// prueba
		LoteMedicamento[] lotes;
		lotes = new LoteMedicamento[] {
				new LoteMedicamento(1, new Fecha(2, 3, 2020), new Fecha(15, 3, 2021), 10000,
						new Medicamento(10, "Medicina A", "Lab Fabricante", new String[] { "Droga 1", "Droga 2" })),
				new LoteMedicamento(2, new Fecha(2, 3, 2020), new Fecha(16, 3, 2021), 15000,
						new Medicamento(30, "Medicina B", "Lab Fabricante", new String[] { "Droga 1", "Droga 3" })),
				new LoteMedicamento(3, new Fecha(2, 3, 2020), new Fecha(17, 4, 2021), 20000,
						new Medicamento(50, "Medicina C", "Lab Fabricante", new String[] { "Droga 1", "Droga 4" })),
				new LoteMedicamento(4, new Fecha(2, 3, 2020), new Fecha(18, 4, 2021), 25000,
						new Medicamento(70, "Medicina D", "Lab Fabricante", new String[] { "Droga 3", "Droga 2" })),
				new LoteMedicamento(5, new Fecha(2, 3, 2020), new Fecha(19, 5, 2021), 30000,
						new Medicamento(20, "Medicina E", "Lab Fabricante", new String[] { "Droga 5", "Droga 6" })),
				new LoteMedicamento(6, new Fecha(2, 3, 2020), new Fecha(20, 5, 2021), 35000,
						new Medicamento(40, "Medicina F", "Lab Fabricante", new String[] { "Droga 7", "Droga 8" })),
				new LoteMedicamento(7, new Fecha(2, 3, 2020), new Fecha(21, 6, 2021), 40000,
						new Medicamento(60, "Medicina G", "Lab Fabricante", new String[] { "Droga 9", "Droga 12" })),
				new LoteMedicamento(8, new Fecha(2, 3, 2020), new Fecha(22, 6, 2021), 45000,
						new Medicamento(80, "Medicina H", "Lab Fabricante", new String[] { "Droga 11", "Droga 1" })) };

		// Solicitar al usuario que ingrese una fecha de filtro del reporte
		// fechaFiltro = fechaLeida
		Scanner s = new Scanner(System.in);
		System.out.print("\nIngrese Dia: ");
		int d = s.nextInt();
		System.out.print("\nIngrese Mes: ");
		int m = s.nextInt();
		System.out.print("\nIngrese Año: ");
		int a = s.nextInt();

		// iterar la lista de Lotes de medicamentos, por cada item de la lista
		// chequear si su fecha de vencimiento es menor o igual que la variable
		// fechaFiltro
		// si es menor o igual, imprimir ese lote
		Fecha fechaReporte = new Fecha(d, m, a);
		System.out.println("Lista de medicamentos que vencen hasta el " + fechaReporte);
		for (int i=0; i<lotes.length; i++) {
			LoteMedicamento item = lotes[i];
			if (item.getFechaVencimiento().compareTo(fechaReporte) <= 0) {
				System.out.print("\n\t" + item);
			}
		}

	}

}
