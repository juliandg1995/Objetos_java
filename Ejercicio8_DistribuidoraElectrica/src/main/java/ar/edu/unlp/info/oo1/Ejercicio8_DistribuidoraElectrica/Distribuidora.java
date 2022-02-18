package ar.edu.unlp.info.oo1.Ejercicio8_DistribuidoraElectrica;
import java.util.*;
import java.util.stream.Collectors;


public class Distribuidora {
	
	private Set<Usuario> usuarios;
	private double precioKWh;
	
	private void precioKWh(double unPrecio) {
		this.precioKWh = unPrecio;
	}
	
	public Distribuidora(double unPrecio) {
        this.precioKWh(unPrecio);
        this.usuarios = new HashSet<Usuario>();
    }
	
	public void agregarUsuario(Usuario unUsuario) {
		this.usuarios.add(unUsuario);
	}
	
	public List<Factura> facturar() {
		if (this.usuarios != null) {
			return this.usuarios
					.stream()
					.map(u -> u.facturarEnBaseA(precioKWh))
					.sorted( (f1, f2) -> f1.fecha().compareTo(f2.fecha()))
					.collect(Collectors.toList());
			//   .collect(Collectors.toCollection(ArrayList::new)); 			
		} else {
			return null;
		}
	}
	
	public double consumoTotalActiva() {
		if (usuarios != null) {
			return this.usuarios.stream()
						.mapToDouble( u -> u.ultimoConsumo().getConsumoEnergiaActiva())
						.sum();
		} else {
			return 0;
		}
	}
	
	public double getPrecioKW() {
		return this.precioKWh;
	}

	public List<Usuario> getUsuarios() {
		// Tengo que pasar los usuarios de una estructura Set a una List
		// Se puede crear una nueva colección pasando por parámetro los datos de otra para asignarselos
		return new ArrayList<Usuario>(this.usuarios);
	}
	
		
	
	

}
