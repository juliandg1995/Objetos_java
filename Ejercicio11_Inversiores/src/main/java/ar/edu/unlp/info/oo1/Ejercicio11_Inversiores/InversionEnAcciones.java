package ar.edu.unlp.info.oo1.Ejercicio11_Inversiores;

public class InversionEnAcciones implements Inversion {
	
	private String nombre;
	private int cantidad;
	private double valorUnitario;
	
	public InversionEnAcciones(double unValor, int cant, String unNombre) {
		this.nombre = unNombre;
		this.cantidad = cant;
		this.valorUnitario = unValor;
	}	
	
	public void setValorUnitario(double unValor) {
		this.valorUnitario = unValor;
	}
	
	public void setNombre(String unNombre) {
		this.nombre = unNombre;
	}
	
	public void setCantidad(int unaCantidad) {
		this.cantidad = unaCantidad;
	}
	
	public double getValorActual() {
		return this.cantidad * valorUnitario;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
}
