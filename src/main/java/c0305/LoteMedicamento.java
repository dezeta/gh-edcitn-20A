package c0305;

public class LoteMedicamento {
	
	private int idLote;
	private Fecha fechaCompra;
	private Fecha fechaVencimiento;
	private double precioCosto;
	private double porcentajeGanancia = 1.25;
	private Medicamento medicamento;
	
	public LoteMedicamento(int i, Fecha fc, Fecha fv, double pc, Medicamento m) {
		idLote = i;
		fechaCompra = fc;
		fechaVencimiento = fv;
		precioCosto = pc;
		medicamento = m;
	}

	public int getIdLote() {
		return idLote;
	}

	public void setIdLote(int idLote) {
		this.idLote = idLote;
	}

	public Fecha getFechaCompra() {
		return fechaCompra;
	}

	public void setFechaCompra(Fecha fechaCompra) {
		this.fechaCompra = fechaCompra;
	}

	public Fecha getFechaVencimiento() {
		return fechaVencimiento;
	}

	public void setFechaVencimiento(Fecha fechaVencimiento) {
		this.fechaVencimiento = fechaVencimiento;
	}

	public double getPrecioCosto() {
		return precioCosto;
	}
	
	public double getPrecioVenta() {
		return precioCosto * porcentajeGanancia;
	}

	public void setPrecioCosto(double precioCosto) {
		this.precioCosto = precioCosto;
	}

	public double getPorcentajeGanancia() {
		return porcentajeGanancia;
	}

	public void setPorcentajeGanancia(double porcentajeGanancia) {
		this.porcentajeGanancia = porcentajeGanancia;
	}

	public Medicamento getMedicamento() {
		return medicamento;
	}

	public void setMedicamento(Medicamento medicamento) {
		this.medicamento = medicamento;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("ID Lote: ").append(getIdLote()).append(" - ");
		sb.append("Fecha Vencimiento: ").append(getFechaVencimiento()).append(" - ");
		sb.append("Medicamento: ").append(getMedicamento().getNombre());
		return sb.toString();
	}
	

}
