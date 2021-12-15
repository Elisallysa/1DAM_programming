package models;

import models.CuentaCorriente;

public class Persona {

	//Propiedades
	private String nombre;
	private String apellidos;
	private String dni;
	private double sueldo;
	public CuentaCorriente cuenta;
	
	//Constructores
	public Persona(String nombre, String apellidos, String dni, double sueldo, CuentaCorriente cuenta) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.dni = dni;
		this.sueldo = 0;
		this.cuenta = cuenta;
	}
	//Getters y setters
	public String getNombre() {
		return nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public String getDni() {
		return dni;
	}

	public double getSueldo() {
		return sueldo;
	}
	
	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}
	public CuentaCorriente getCuenta() {
		return cuenta;
	}
	public void setCuenta(CuentaCorriente cuenta) {
		this.cuenta = cuenta;
	}
	
	//Métodos
	
	public Persona clone () {
		return new Persona (this.getNombre(), this.getApellidos(), this.getDni(), this.getSueldo(), this.getCuenta());
	}
	
	public void cobrarSueldo() {
		//this.cuenta.sumarCantidad(this.sueldo);
		this.cuenta.setSaldo(cuenta.getSaldo()+sueldo);
	}
	
	public void sacarPasta(double cantidad) {
		
		double dinero = this.cuenta.getSaldo();
		
		if (cantidad <= dinero) {
			dinero -= cantidad;
			this.cuenta.setSaldo(dinero);
			}else {
				System.out.println("Saldo insuficiente.");
			}
	}
	
	public void subirSueldo (double nuevoSueldo) {
		this.setSueldo(nuevoSueldo);
	}
	
	//toString
	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", apellidos=" + apellidos + ", dni=" + dni + ", sueldo=" + sueldo + ", cuenta=" + cuenta.getNumeroCuenta() + ", saldo=" + cuenta.getSaldo() +"]";
	}
	
}


