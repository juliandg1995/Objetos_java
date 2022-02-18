package ar.edu.unlp.info.oo1.Ejercicio9_CuentaConGanchos;

public class CuentaCorriente extends Cuenta {
	
	private double descubierto;
	private double limiteDescubierto;
	
	
	public CuentaCorriente() {
		super();
		this.descubierto = 0;
	}
	
	protected boolean puedeExtraer(double monto) {
		if (descubierto > 0 && this.getSaldo() + this.descubierto >= monto) {
			return true;
		}
		return false;
	}
	
	public void depositar(double unMonto) {
		if (descubierto < limiteDescubierto) {
			double diferencia = limiteDescubierto - descubierto;
			unMonto -= diferencia;
			descubierto += diferencia;
			this.saldo += unMonto;
		} 
		this.saldo += unMonto;
	}
	
	public boolean extraer(double unMonto) {
		if (this.puedeExtraer(unMonto)) {
			if (this.saldo >= unMonto) {
				this.saldo -= unMonto;
			} else {
				if (this.saldo + descubierto >= unMonto) {
					this.saldo += descubierto;
					descubierto = 0;
					this.saldo -= unMonto;
				}
			}
			return true;
		}
		return false;
	}
	
	public boolean transferirACuenta(Cuenta cuentaDestino, double unMonto) {
		if(this.extraer(unMonto)){
			cuentaDestino.depositar(unMonto);
			return true;			
		}
		return false;
	}
	
	public void setDescubierto(double unMonto) {
		this.limiteDescubierto = unMonto;
		this.descubierto = unMonto;
	}
	
	public double getDescubierto() {
		return descubierto;
	}

}
