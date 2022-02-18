package ar.edu.unlp.info.oo1.Ejercicio8_DistribuidoraElectrica;

import java.time.LocalDate;

public class Consumo {
    private LocalDate fecha;
    private double consumoEnergiaActiva;
    private double consumoEnergiaReactiva;
    
    public Consumo(LocalDate unaFecha, int unaEA, int unaER) {
    	this.fecha = unaFecha; this.consumoEnergiaActiva = unaEA; 
    	this.consumoEnergiaReactiva = unaER;
    }

    public double costoEnBaseA(double precioKWh) {
        return this.consumoEnergiaActiva * precioKWh;
    }

    public double factorDePotencia() {
        return this.consumoEnergiaActiva 
        		  / Math.sqrt(Math.pow(this.consumoEnergiaActiva, 2) 
        		  + Math.pow(this.consumoEnergiaReactiva, 2));
    }
    
    public double getConsumoEnergiaActiva() {
    	return this.consumoEnergiaActiva;
    }


    public double getConsumoEnergiaReactiva() {
    	return this.consumoEnergiaReactiva;
    }
    
    public LocalDate getFecha() {
    	return this.fecha;
    }
    
}
