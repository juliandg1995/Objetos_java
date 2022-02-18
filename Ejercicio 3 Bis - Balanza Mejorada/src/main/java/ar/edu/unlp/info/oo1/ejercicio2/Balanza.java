package ar.edu.unlp.info.oo1.ejercicio2;
import java.util.ArrayList;

public class Balanza {
	
//	private int cantidadDeProductos;
//	private double precioTotal;
//	private double pesoTotal;
	private ArrayList<Producto> productos;
	
	public Balanza() {
		this.ponerEnCero();
	}
	
	public void ponerEnCero() {
//		this.precioTotal = 0;
//		this.pesoTotal = 0;
//		this.cantidadDeProductos = 0;
		this.productos =  new ArrayList<Producto>();
	}

	public void agregarProducto(Producto unProducto){
		this.productos.add(unProducto);
//		this.precioTotal = this.precioTotal + unProducto.getPrecio();
//		this.pesoTotal = this.pesoTotal + unProducto.getPeso();
	}
	
	public Ticket emitirTicket() {
		Ticket unTicket = new Ticket(this.productos);
		return unTicket;
	}

	public int getCantidadDeProductos() {
		return this.productos.size();
	}


	public double getPrecioTotal() {
//		return this.precioTotal();
		return this.productos.stream().mapToDouble(producto -> producto.getPrecio()).sum();
	}


	public double getPesoTotal() {
//		return this.pesoTotal;
		return this.productos.stream().mapToDouble(producto -> producto.getPeso()).sum();
	}

	
	

}
