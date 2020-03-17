package c0305;

public class Medicamento {
	
	private int codigo;
	private String nombre;
	private String laboratorio;
	private String[] drogasComponentes;
	
	public Medicamento() {
		codigo = 0;
		nombre = "";
		laboratorio = "";
		drogasComponentes = null;		
	}
	
	public Medicamento(int c, String n, String l, String[] d) {
		codigo = c;
		nombre = n;
		laboratorio = l;
		drogasComponentes = d;		
	}
	
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getLaboratorio() {
		return laboratorio;
	}
	public void setLaboratorio(String laboratorio) {
		this.laboratorio = laboratorio;
	}
	public String[] getDrogasComponentes() {
		return drogasComponentes;
	}
	public void setDrogasComponentes(String[] drogasComponentes) {
		this.drogasComponentes = drogasComponentes;
	}
	
	

}
