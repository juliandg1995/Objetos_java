package ar.edu.unlp.info.oo1.figurasYCuerpos;

public class Cuerpo3D {
	
	private double altura;
	private Figura2D caraBasal;
	
	public Cuerpo3D() {
	}
	
	public Cuerpo3D(double unaAltura, Figura2D unaCB) {
		this.altura = unaAltura;
		this.caraBasal = unaCB;
	}
	
	public void setAltura(double unaAltura) {
		this.altura = unaAltura;
	}
	
	public void setCaraBasal(Figura2D unaCara) {
		this.caraBasal = unaCara;
	}
	
	public double getAltura() {
		return this.altura;
	}
	
	public double getVolumen() {
		return this.caraBasal.getArea() * altura;
	}
	
	public double getSuperficieExterior() {
		return (2 * this.caraBasal.getArea()) + (caraBasal.getPerimetro() * altura); 
	}

}
