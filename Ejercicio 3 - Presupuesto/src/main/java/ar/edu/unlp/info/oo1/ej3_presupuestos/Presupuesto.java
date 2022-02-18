package ar.edu.unlp.info.oo1.ej3_presupuestos;
import java.time.LocalDate; import java.util.ArrayList;


public class Presupuesto {
	
	private LocalDate fecha;
	private String cliente;
	private ArrayList<Item> items;
	
	
	public Presupuesto() {
		this.initialize();
	}
	
	public Presupuesto(String unCliente, int cantidad) {
		this.cliente = unCliente;
		this.fecha = LocalDate.now();
		this.initialize();
	}
	
	public void initialize() {
		items = new ArrayList<Item>();
	}
	
	public void agregarItem(Item unItem) {
		this.items.add(unItem);
	}
	
	public double calcularTotal() {
//		Usando foreach clásico:
		
//		double total = 0.0;
//		for(Item item : items) {
//			total += item.costo();
//		}
//		return total;
		
		return items.stream().mapToDouble(item -> item.costo()).sum();   // Uso de streams
		
	}
	
	public String getCliente() {
		return cliente;
	}
	
	public ArrayList<Item> getItems() {
		return items;
	}
	
	public LocalDate getDate() {
		return this.fecha;
	}
	
	public Presupuesto cliente(String unCliente) {
		this.cliente = unCliente;
		return this;
	}

}
