package ar.edu.unlp.info.oo1.Ejercicio8_DistribuidoraElectrica;
import java.util.*;

public class Usuario {
    private String domicilio;
    private String nombre;
    private ArrayList<Factura> facturas;
    private ArrayList<Consumo> consumos;
    
    private Optional<Consumo> ultimoConsumoAsOptional() {
        //retorna un Optional ya que puede no tener consumos
        return this.consumos
            .stream()
            .max((Consumo c1, Consumo c2) -> c1.getFecha().compareTo(c2.getFecha()));
    }
    
    public Usuario(String unNombre, String unaDireccion) {
    	this.domicilio = unaDireccion;
    	this.nombre = unNombre;
    	this.facturas = new ArrayList<Factura>();
    	this.consumos = new ArrayList<Consumo>();
    }

    public void agregarMedicion(Consumo medicion) {
    	consumos.add(medicion);
    }

    public double ultimoConsumoActiva() {
        return this.ultimoConsumoAsOptional()
            .map((Consumo c) -> c.getConsumoEnergiaActiva())
            .orElse(0d);
    }

    public Consumo ultimoConsumo() {
    	return this.ultimoConsumoAsOptional().orElse(null);
    }

    public Factura facturarEnBaseA(double precioKWh) {
    	
    	if (consumos == null || consumos.get(0) == null) {
    		return null;
    	}
    			
    	Factura nuevaFactura = new Factura(this.ultimoConsumo().costoEnBaseA(precioKWh), this);
    	facturas.add(nuevaFactura);
    	
    	return nuevaFactura;
    	
    }

    public ArrayList<Factura> facturas(){
        return this.facturas;
    }
    
    
    public String getDomicilio() {
    	return this.domicilio;
    }
    
    public String getNombre() {
    	return this.nombre;
    }
}
