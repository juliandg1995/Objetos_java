package ar.edu.unlp.info.oo1.Parciales;

public class Producto extends Exportable {
	
	private int cantUnidades;
	private double peso;
	private double costo;
	
	public Producto(String unaDescripcion, int unaCantidad, double unPeso, double unCosto) {
		super(unaDescripcion);
		this.cantUnidades = unaCantidad;
		this.peso = unPeso;
		this.costo = unCosto;
	}
	
	public double getCosto() {
		
		if (peso <= 1000) {
			return cantUnidades * costo;			
		}
		
		return (cantUnidades * costo) * 1.10;
		
	}
}
