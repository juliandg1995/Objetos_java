package ar.edu.unlp.info.oo1.ejercicio2;

public class Balanza {
	
	private int cantidadDeProductos;
	private double precioTotal;
	private double pesoTotal;
	
	public Balanza() {
		this.ponerEnCero();
	}
	
	public void ponerEnCero() {
		this.precioTotal = 0;
		this.pesoTotal = 0;
		this.cantidadDeProductos = 0;
	}

	public void agregarProducto(Producto unProducto){
		this.cantidadDeProductos++;
		this.precioTotal = this.precioTotal + unProducto.getPrecio();
		this.pesoTotal = this.pesoTotal + unProducto.getPeso();
	}
	
	public Ticket emitirTicket() {
		Ticket unTicket = new Ticket(this.cantidadDeProductos, this.pesoTotal, this.precioTotal);
		return unTicket;
	}

	public int getCantidadDeProductos() {
		return cantidadDeProductos;
	}


	public double getPrecioTotal() {
		return precioTotal;
	}


	public double getPesoTotal() {
		return pesoTotal;
	}

	
	

}
