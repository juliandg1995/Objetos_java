package ar.edu.unlp.info.oo1.Parciales;

public abstract class Exportable {
	
	protected String descripcion;
	
	public Exportable(String unaDescripcion) {
		this.descripcion = unaDescripcion;
	}
	
	public abstract double getCosto();
	
	

}
