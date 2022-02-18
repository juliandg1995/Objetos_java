package ar.edu.unlp.info.oo1.Ejercicio8_DistribuidoraElectrica;
import java.time.LocalDate;

public class Factura {
    private double subtotal;
    private double descuento;
    private LocalDate fecha;
    private Usuario usuario;
    
    private double descuento(double sinDescuento) {
    	if (this.usuario.ultimoConsumo().factorDePotencia() > 0.8) {
    		return 10;
    	}
    	return 0;
    }
    
    public Factura(double totalSinDescuento, Usuario unUsuario) {
    	
    	this.fecha = LocalDate.now();
    	this.usuario = unUsuario;
    	this.subtotal = totalSinDescuento;
    	this.descuento = this.descuento(totalSinDescuento);
    	
    }

    public double montoTotal() {
    	// return this.usuario.ultimoConsumo().costoEnBaseA(this.montoEnergiaActiva);
    	return subtotal - ((this.descuento / 100) * subtotal);
    }

    public Usuario usuario() {
        return this.usuario;
    }

    public LocalDate fecha() {
        return this.fecha;
    }
    
    public LocalDate getFecha() {
    	return this.fecha;
    }
    
    
    public double getDescuento() {
    	return this.descuento;
    }
    
    public double getMontoEnergiaActiva() {
    	return this.subtotal;
    }
    
}
