package ar.edu.unlp.info.oo1.Ejercicio11_Inversiores;
import java.util.ArrayList;

public class Inversor {
	
	private String nombre;
	private ArrayList<Inversion> inversiones;
	
	public Inversor(String unNombre) {
		this.nombre = unNombre;
		this.inversiones = new ArrayList<Inversion>();
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public ArrayList<Inversion> getInversiones(){
		return this.inversiones;
	}
	
	public double valorActual() {
		return this.inversiones.stream().mapToDouble( inv -> inv.getValorActual()).sum();
	}
	
}
