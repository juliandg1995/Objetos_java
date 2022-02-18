package ar.edu.unlp.info.oo1.Parciales;
import java.time.*;
import java.util.*;

public class PedidoExportacion {
	
	private String destino;
	private LocalDate fecha;
	private String empresa;
	private HashSet<Exportable> exportables;

	public PedidoExportacion(String unDestino, LocalDate unaFecha, String unaEmpresa) {
		this.destino = unDestino;
		this.fecha = unaFecha;
		this.empresa = unaEmpresa;
		this.exportables = new HashSet<Exportable>();
	}
	
	public void agregarExportable(Exportable unExportable) {
		this.exportables.add(unExportable);
	}
	
	public Factura facturar() {
		return new Factura(LocalDate.now(), this.fecha, this.exportables);
	}
	
}
