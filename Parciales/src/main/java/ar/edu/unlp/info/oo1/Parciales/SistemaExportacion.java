package ar.edu.unlp.info.oo1.Parciales;
import java.util.*;
import java.time.*;

public class SistemaExportacion {
	
	private HashSet<PedidoExportacion> pedidosExportacion;
	private HashSet<Factura> facturas;
	
	public SistemaExportacion() {
		this.pedidosExportacion = new HashSet<PedidoExportacion>();
		this.facturas = new HashSet<Factura>();
	}
	
	public PedidoExportacion darDeAltaPedido(String destino, LocalDate fechaExportacion, String empresa) {
		
		PedidoExportacion nuevoPedido = new PedidoExportacion(destino, fechaExportacion, empresa);
		this.pedidosExportacion.add(nuevoPedido);
		return nuevoPedido;
		
	}
	
	public void agregarBienAPedido(PedidoExportacion unPedido, String descripcion, int cantidad, double peso, double valor) {
		Exportable unNuevoProducto = new Producto(descripcion, cantidad, peso, valor);
		if (pedidosExportacion.contains(unPedido)) {
			unPedido.agregarExportable(unNuevoProducto);
		}
	}
	
	public void agregarServicioAPedido(PedidoExportacion unPedido, String descripcion, double unCostoMaterial, double unCostoMano) {
		Exportable unNuevoProducto = new Servicio(descripcion, unCostoMaterial, unCostoMano);
		if (pedidosExportacion.contains(unPedido)) {
			unPedido.agregarExportable(unNuevoProducto);
		}
	}
		
	public Factura facturarPedido(PedidoExportacion unPedido) {
		if (pedidosExportacion.contains(unPedido)) {
			return unPedido.facturar();
		}
		return null;
	}
	
	
	
	
	
}
