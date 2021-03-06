package poo;

public class cuentaBancaria {

	// Propiedades
	private double saldo;
	private int pin;
	private String dniPropietario;
	private String IBAN;
	private boolean bloqueada;
	private int intentosPin;

	// Constructores
	public cuentaBancaria(int pin, String dniPropietario) {
		super();
		this.pin = pin;
		this.dniPropietario = dniPropietario;
		this.saldo = 0;
		this.bloqueada = false;
		this.IBAN = Integer.toString((int) (Math.random() * 1000000));
		this.intentosPin = 0;
	}

	// Getters and setters
	public double getSaldo() {
		return saldo;
	}

	public String getDniPropietario() {
		return dniPropietario;
	}

	public String getIBAN() {
		return IBAN;
	}

	public boolean isBloqueada() {
		return bloqueada;
	}

	// M?todos
	public void ingreso(int cantidad) {
		if (!this.bloqueada) {
			this.saldo += cantidad;
		} else {
			System.out.println("Cuenta bloqueada.");
		}

	}

	public void retirada(int cantidad) {
		if (!this.bloqueada) {
			if (saldo >= cantidad) {
				this.saldo -= cantidad;
			} else {
				System.out.println("Saldo insuficiente.");
			}
		} else {
			System.out.println("Cuenta bloqueada.");
		}
	}

	public boolean comprobarPin(int pinIntroducido) {
		if (pinIntroducido == this.pin) {
			this.intentosPin = 0;
			return true;
		} else {
			this.intentosPin++;
			if (this.intentosPin == 3) {
				this.bloqueada = true;
			}
			return false;
		}

	}

	public void transferencia(cuentaBancaria destino, int pasta) {
		if (!this.bloqueada) {
			if (this.saldo >= pasta) {
				this.saldo -= pasta;
				destino.ingreso(pasta);
			} else {
				System.out.println("Saldo insuficiente.");
			}
		} else {
			System.out.println("Cuenta bloqueada.");
		}
	}

	// toString:
	@Override
	public String toString() {
		return "cuentaBancaria [saldo=" + saldo + ", dniPropietario=" + dniPropietario + ", IBAN=" + IBAN
				+ ", bloqueada=" + bloqueada + "]";
	}

}
