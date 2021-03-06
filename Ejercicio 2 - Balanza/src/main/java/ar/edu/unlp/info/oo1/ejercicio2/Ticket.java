package ar.edu.unlp.info.oo1.ejercicio2;
import java.time.LocalDate;

public class Ticket {
	
	private LocalDate fecha;
	private int cantidadDeProductos;
	private double pesoTotal;
	private double precioTotal;
	
	public Ticket(int cant, double unPeso, double unPrecio) {
		this.cantidadDeProductos = cant;
		this.pesoTotal = unPeso;
		this.precioTotal = unPrecio; 
		this.fecha = LocalDate.now();
	}
	
	public double impuesto() {
		return this.precioTotal * 0.21;
	}

	public LocalDate getFecha() {
		return fecha;
	}

	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}

	public int getCantidadDeProductos() {
		return cantidadDeProductos;
	}

	public double getPesoTotal() {
		return pesoTotal;
	}

	public void setPesoTotal(double pesoTotal) {
		this.pesoTotal = pesoTotal;
	}

	public double getPrecioTotal() {
		return this.precioTotal;
	}

	public void setPrecioTotal(double precioTotal) {
		this.precioTotal = precioTotal + this.impuesto();
	}

}
