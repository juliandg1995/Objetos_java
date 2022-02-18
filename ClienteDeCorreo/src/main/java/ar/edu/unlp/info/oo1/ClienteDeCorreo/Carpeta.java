package ar.edu.unlp.info.oo1.ClienteDeCorreo;
import java.util.ArrayList;


public class Carpeta {
	
	private ArrayList<Email> emails;
	private String nombre;
	
	
	public Carpeta(String unNombre) {
		this.emails = new ArrayList<Email>();
		this.nombre = unNombre;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String unNombre) {
		nombre = unNombre;
	}
	
	public ArrayList<Email> emails(){
		return this.emails;
	}
	
	public void agregarMail(Email unEmail) {
		emails.add(unEmail);
	}
	
	public Email getEmail(String texto){
		
		return emails.stream().filter(email -> email.getTitulo().equals(texto) 
											|| email.getCuerpo().equals(texto))
											  .findFirst()
											  .orElse(null);
	}
	
	public double getEspacio() {
		return this.emails.stream().mapToDouble( e -> e.tamanio()).sum();
	}
	
    public boolean contieneMail(Email mail) {
        return this.emails.contains(mail);
    }

    public boolean borrarMail(Email mail) {
        return this.emails.remove(mail);
    }
	
	
}
