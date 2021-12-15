package models;

import models.Persona;

public class CuentaCorriente {

	//Propiedades
	private int numeroCuenta;
	private double saldo;
	//private Persona titular;
	
	
	//Constructores
	public CuentaCorriente(int numeroCuenta, double saldo) {
		super();
		this.numeroCuenta = numeroCuenta;
		this.saldo = 0;
		
	}

	
	//Getters y setters
	public int getNumeroCuenta() {
		return numeroCuenta;
	}


	public double getSaldo() {
		return saldo;
	}
	
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}


//	public Persona getTitular() {
//		return titular;
//	}

	
	//Métodos
	

	public CuentaCorriente nuevacuenta () {
		int i = 0;
		return new CuentaCorriente (i, 0); 
}
	
	


	public void sumarCantidad (double cantidad) {
		this.saldo += cantidad;
	}
	
	public void restarCantidad (double cantidad) {
		this.saldo -= cantidad;
	}
	
	
	
	
	//toString
	@Override
	public String toString() {
		return "CuentaCorriente [numeroCuenta=" + numeroCuenta + ", saldo=" + saldo + "]";
	}
	
}
