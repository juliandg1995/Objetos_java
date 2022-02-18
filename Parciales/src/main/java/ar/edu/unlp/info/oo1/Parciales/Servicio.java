package ar.edu.unlp.info.oo1.Parciales;

public class Servicio extends Exportable {
	
	private double costoMaterial;
	private double costoManoObra;
	
	public Servicio(String unaDescripcion, double unCostoMaterial, double unCostoMano) {
		super(unaDescripcion);
		this.costoMaterial = unCostoMaterial;
		this.costoManoObra = unCostoMano;
	}
	
	public double getCostoManoObra() {
		return this.costoManoObra;
	}

	public double getCostoMaterial() {
		return costoMaterial;
	}

	public void setCostoMaterial(double costoMaterial) {
		this.costoMaterial = costoMaterial;
	}
	
	public void setCostoManoObra(double costoMano) {
		this.costoManoObra = costoMano;
	}
	
	public double getCosto() {
		return costoManoObra + costoMaterial;
	}

}
