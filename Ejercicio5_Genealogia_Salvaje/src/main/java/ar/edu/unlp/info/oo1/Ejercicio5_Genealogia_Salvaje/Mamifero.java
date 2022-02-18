package ar.edu.unlp.info.oo1.Ejercicio5_Genealogia_Salvaje;
import java.util.Date;


public class Mamifero {
	
	String identificador;
	String especie;
    Date fechaNacimiento;
    Mamifero padre;
    Mamifero madre;
    Mamifero abueloMaterno;
    Mamifero abueloPaterno;
    Mamifero abuelaMaterna;
    Mamifero abuelaPaterna;
    
    public Mamifero(String identificador) {
    	this.setIdentificador(identificador);
    }
    
    public Mamifero() {
    	this.setIdentificador("anonimo");
    }
    
	public String getIdentificador() {
		return identificador;
	}
	public void setIdentificador(String identificador) {
		this.identificador = identificador;
	}
	public String getEspecie() {
		return especie;
	}
	public void setEspecie(String especie) {
		this.especie = especie;
	}
	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}
	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	public Mamifero getPadre() {
		return padre;
	}
	public void setPadre(Mamifero padre) {
		this.padre = padre;
	}
	public void setMadre(Mamifero madre) {
		this.madre = madre;
	}

	public Mamifero getMadre() {
		return madre;
	}

	public Mamifero getAbueloMaterno() {
		
		if (this.getMadre() != null) {
			return this.getMadre().getPadre();			
		} else {
			return null;
		}
	}

	public Mamifero getAbueloPaterno() {
		
		if (this.getPadre() != null) {			
			return this.getPadre().getPadre();
		} else {
			return null;
		}
	}

	public Mamifero getAbuelaMaterna() {
		
		if (this.getMadre() != null) {
			return this.getMadre().getMadre();			
		} else {
			return null;
		}
	}

	public Mamifero getAbuelaPaterna() {
		
		if (this.getPadre() != null) {
			return this.getPadre().getMadre();			
		} else {
			return null;
		}
	}

    
	public boolean tieneComoAncestroA(Mamifero ancestro) {
		String ancestroID = ancestro.getIdentificador();
		try {
			if(this.getMadre().getIdentificador() == ancestroID ||
			   this.getAbuelaMaterna().getIdentificador() == ancestroID ||
			   this.getAbueloMaterno().getIdentificador() == ancestroID ||
			   this.getPadre().getIdentificador() == ancestroID ||
			   this.getAbuelaPaterna().getIdentificador() == ancestroID ||
			   this.getAbueloPaterno().getIdentificador() == ancestroID
			  ) {
					return true;
				}
		}
		catch(Exception e){}
		return false;
		}
    
    
}
