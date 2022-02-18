package ar.edu.unlp.info.oo1.ClienteDeCorreo;
import java.util.ArrayList;

public class ClienteDeCorreo {
	
	private ArrayList<Carpeta> carpetas;
	private Carpeta inbox;
	
	public ClienteDeCorreo() {
		
		this.carpetas = new ArrayList<Carpeta>();
		this.inbox = new Carpeta("Inbox");
		carpetas.add(0, inbox);
	}
	
	public void recibir(Email unEmail) {
		this.inbox.agregarMail(unEmail);
	}
	
    public Email buscar(String texto){
        // Busca y retorna el priemr mail que coincida con el texto del argumento
        return carpetas.stream()
        			   .map(carpeta -> carpeta.getEmail(texto))
        			   .filter(e -> e != null)
        			   .findFirst()
        			   .orElse(null);
        }

	
	// Consultar si está bien
    public void mover(Email unEmail, Carpeta origen, Carpeta destino) {
        if (origen.contieneMail(unEmail)) {
            origen.borrarMail(unEmail);
            destino.agregarMail(unEmail);
        }
    }
	
	public double espacioOcupado() {
		return this.carpetas.stream()
						    .mapToDouble( c -> c.getEspacio())
						    .sum();
	}
	
}
