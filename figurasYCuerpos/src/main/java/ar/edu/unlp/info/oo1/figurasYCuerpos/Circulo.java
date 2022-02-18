package ar.edu.unlp.info.oo1.figurasYCuerpos;

public class Circulo implements Figura2D {
	
	private double radio;
	
	public Circulo() {
	}
	
	public Circulo(double unRadio){
		this.setRadio(unRadio);
	}
	
	public void setRadio(double unRadio) {
		this.radio = unRadio;
	}
	
	public double getDiametro() {
		return this.getRadio() * 2;
	}
	
	public double getRadio() {
		return this.radio;
	}
	
	public double getArea() {
		return Math.PI * Math.pow(this.getRadio(), 2);
	}
	
	public double getPerimetro() {
		return Math.PI * this.getDiametro();
	}

}
