package ar.edu.unlp.info.oo1.Ejercicio9_CuentaConGanchos;

public class CajaDeAhorro extends Cuenta {
	
	public CajaDeAhorro() {
		super();
	}
	
	protected boolean puedeExtraer(double monto) {
		if (this.getSaldo() >= monto * 1.02) {
			return true;
		}
		return false;
	}
	
	public boolean extraer(double unMonto) {
		if (this.puedeExtraer(unMonto)) {
			this.saldo -= unMonto * 1.02;
			return true;
		}
		return false;
	}
	
	public void depositar(double unMonto) {
		this.saldo += unMonto * 0.98;
	}
	
	public boolean transferirACuenta(double unMonto, Cuenta cuentaDestino) {
		if(this.extraer(unMonto)) {
			cuentaDestino.depositar(unMonto);
			return true;
		}
		return false;
		
	}
	
}
