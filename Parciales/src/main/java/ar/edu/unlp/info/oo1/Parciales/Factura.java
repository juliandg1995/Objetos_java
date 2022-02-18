package ar.edu.unlp.info.oo1.Parciales;
import java.time.*;
import java.util.*;

public class Factura {
	
	private LocalDate fechaFacturacion;
	private LocalDate fechaExportacion;
	private HashSet<Exportable> items;
	
	public Factura (LocalDate fechaFact, LocalDate fechaExpo, HashSet<Exportable> exportables){
		this.fechaFacturacion = fechaFact;
		this.fechaExportacion = fechaExpo;
		this.items = exportables;
	}
	
	public double getCostoBasico() {
		return this.items.stream().mapToDouble( e -> e.getCosto()).sum();
	}
	
	public double getCostoExportacion() {
		return this.getCostoBasico() * 0.05;
	}
	
	public double getCostoFinal() {
		return this.getCostoBasico() + this.getCostoExportacion();
	}
	
	public HashSet<Exportable> getItems(){
		return this.items;
	}
	

}
