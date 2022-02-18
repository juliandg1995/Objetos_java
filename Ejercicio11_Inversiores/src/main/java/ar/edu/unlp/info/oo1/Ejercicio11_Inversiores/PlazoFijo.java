package ar.edu.unlp.info.oo1.Ejercicio11_Inversiores;
import java.time.LocalDate;

public class PlazoFijo implements Inversion {
	
	LocalDate fechaDeConstitucion;
	double montoDepositado;
	double porcentajeDeInteresDiario;
	
	
	public PlazoFijo(double unPorcentaje) {
		this.montoDepositado = 0;
		this.fechaDeConstitucion = LocalDate.now();
		this.setPorcentajeDeInteresDiaria(unPorcentaje);
	}
	
	private void setPorcentajeDeInteresDiaria(double unPorcentaje) {
		this.porcentajeDeInteresDiario = unPorcentaje;
	}

	public double getValorActual() {
		return  this.montoDepositado + this.montoDepositado * (this.porcentajeDeInteresDiario / 100);
	}
	
}
