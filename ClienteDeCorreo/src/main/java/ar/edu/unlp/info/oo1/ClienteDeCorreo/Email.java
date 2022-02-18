package ar.edu.unlp.info.oo1.ClienteDeCorreo;
import java.util.ArrayList;

public class Email {
		
	private String titulo;
	private String cuerpo;
	private ArrayList<Archivo> adjuntos;
	
	public Email(String unTitulo) {
		this.adjuntos = new ArrayList<Archivo>();
		this.titulo = unTitulo;
	}
	
	public String getTitulo() {
		return this.titulo;
	}
	
	public String getCuerpo() {
		return this.cuerpo;
	}
	
	public ArrayList<Archivo> getAdjuntos(){
		return adjuntos;
	}
	
	public double tamanio() {
		return this.adjuntos.stream()
				   .mapToDouble( a -> a.getTamanio())
				   .sum() + this.titulo.length() 
				   		  + this.cuerpo.length();
	}

	
	
}
