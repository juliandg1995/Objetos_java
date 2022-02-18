package ar.edu.unlp.info.oo1.ClienteDeCorreo;

public class Archivo {
	
	private String nombre;
	
	public Archivo(String unNombre) {
		this.nombre = unNombre;
	}
	
	public void setNombre(String unNombre) {
		this.nombre = unNombre;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public double getTamanio() {
		return this.nombre.length();
	}
	
}
