package ar.edu.unlp.info.oo1.ejercicio2;

public class Producto {
	
	private double peso;
	private double precioPorKilo;
	private String descripcion;
	
	
	public void setPeso(double unPeso) {
		this.peso = unPeso;
	}
	
	public double getPeso() {
		return this.peso;
	}
	
	public void setPrecioPorKilo(double unPrecio) {
		this.precioPorKilo = unPrecio;
	}
	
	public void setDescripcion(String unaDesc) {
		this.descripcion = unaDesc;
	}
	
	public double getPrecioPorKilo() {
		return this.precioPorKilo;
	}
	
	public double getPrecio() {
		return this.peso * this.precioPorKilo; 
	}
	
	public String getDescripcion() {
		return this.descripcion;
	}
	
}
