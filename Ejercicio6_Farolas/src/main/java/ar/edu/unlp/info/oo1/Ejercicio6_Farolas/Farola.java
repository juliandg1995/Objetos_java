package ar.edu.unlp.info.oo1.Ejercicio6_Farolas;
import java.util.*;

public class Farola {
	
	private ArrayList<Farola> vecinas;
	private boolean prendida;

	public Farola(Farola vecina1){
		this.vecinas = new ArrayList<Farola>();
		this.vecinas.add(vecina1);
		this.prendida = false;
	}
	
	public Farola() {
		this.prendida = false;
		this.vecinas = new ArrayList<Farola>();
	}
	
	public boolean turnOn () {
		if (!this.prendida) {
			prendida = true;
			if (!this.getNeighbors().isEmpty()) {
				this.getNeighbors().stream().forEach(farola -> farola.turnOn());
			}
			return true;
		}
		return false;
	}
	
	public boolean turnOff() {
		if (this.prendida) {
			prendida = false;
			if (!this.getNeighbors().isEmpty()) {
				this.getNeighbors().stream().forEach(farola -> farola.turnOff());
			}
			return true;
		}
		return false;
	}
	
	public boolean isOn() {
		return this.prendida;
	}
	
	public ArrayList<Farola> getNeighbors(){
		return this.vecinas;
	}
	
	public void pairWithNeighbor(Farola unaFarola) {
		unaFarola.getNeighbors().add(this);
		this.getNeighbors().add(unaFarola);
	}
	
}
