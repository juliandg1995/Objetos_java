package ar.edu.unlp.info.oo1.figurasYCuerpos;

public class Cuadrado implements Figura2D {
	
	private double lado;
	
	public Cuadrado() {
	}
	
	public Cuadrado(double longLado) {
		this.setLado(longLado);
	}
	
	public void setLado(double unValor) {
		this.lado = unValor;
	}
	
	public double getLado() {
		return this.lado;
	}
	
	public double getPerimetro() {
		return this.getLado()*4;
	}
	
	public double getArea() {
		return Math.pow(getLado(), 2);
	}

}
