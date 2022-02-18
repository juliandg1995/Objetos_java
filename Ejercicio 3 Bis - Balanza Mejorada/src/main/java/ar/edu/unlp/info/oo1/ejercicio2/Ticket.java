package ar.edu.unlp.info.oo1.ejercicio2;
import java.time.LocalDate;
import java.util.ArrayList;

public class Ticket {
	
	private LocalDate fecha;
	private ArrayList<Producto> productos;
	private double pesoTotal;
	private double precioTotal;
//	private int cantidadDeProductos;
	
	public Ticket(ArrayList<Producto> listaProductos) {
		this.productos = listaProductos;
		this.fecha = LocalDate.now();
		this.setPesoTotal(listaProductos);
		this.setPrecioTotal(listaProductos);
//		this.pesoTotal = unPeso;
//		this.precioTotal = unPrecio; 
	}
	

	public LocalDate getFecha() {
		return fecha;
	}

	public int getCantidadDeProductos() {
		return this.productos.size();
	}

	public double getPesoTotal() {
		return pesoTotal;
	}
	
	public double getPrecioTotal() {
		return this.precioTotal;
	}

	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}

	public void setPesoTotal(ArrayList<Producto> productos) {
		this.pesoTotal = productos.stream().mapToDouble(producto -> producto.getPeso()).sum();	
//		this.pesoTotal = pesoTotal;
	}
	
	public void setPrecioTotal(ArrayList<Producto> productos) {
		this.precioTotal = productos.stream().mapToDouble(producto -> producto.getPrecio()).sum() + this.impuesto(); 
//		this.precioTotal = precioTotal + this.impuesto();
	}
	
	public double impuesto() {
		return this.precioTotal * 0.21;
	}


}
