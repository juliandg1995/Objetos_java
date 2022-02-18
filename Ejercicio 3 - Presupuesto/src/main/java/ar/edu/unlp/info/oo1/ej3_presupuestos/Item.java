package ar.edu.unlp.info.oo1.ej3_presupuestos;

public class Item {
	
	private String detalle;
	private int cantidad;
	private double costoUnitario;
	
	public Item() {
		
	}
	
	public Item(String unDetalle, int unaCantidad, double unCosto) {
		this.detalle = unDetalle;
		this.cantidad = unaCantidad;
		this.costoUnitario = unCosto;
	}
	
	public double getCostoUnitario() {
		return this.costoUnitario;
	}
	
	public String getDetalle() {
		return this.detalle;
	}
	
	public int getCantidad() {
		return this.cantidad;
	}


	public Item costoUnitario(double costoUnitario) {
		this.costoUnitario = costoUnitario;
		return this;
	}

	public Item detalle(String detalle) {
		this.detalle = detalle;
		return this;
	}

	public Item cantidad(int cantidad) {
		this.cantidad = cantidad;
		return this;
	}
	
	public double costo() {
		return this.costoUnitario * this.cantidad;
	}
}
