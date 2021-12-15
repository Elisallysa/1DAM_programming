package poo;

import java.util.Scanner;

public class perro {

	// Propiedades
	private String nombre;
	private String raza;
	private String colorPelaje;
	private String colorOjos;
	private String pienso;
	private String macho;
	private String hembra;
	private int altura;
	private int mesesEdad;
	private double peso;
	private double pesoMinimo;
	private int energia;
	private int caloriasQuemadas;
	private int caloriasConsumidas;
	private int horasDormir;
	private boolean chip;
	private boolean registradoAdn;
	private boolean vacunadoRabia;
	private boolean vacunadoLesmania;
	private boolean alergico;
	private boolean enfermo;
	private boolean vivo;

	// Getters y setters
	public String getNombre() {
		return nombre;
	}

	public String getRaza() {
		return raza;
	}

	public String getColorPelaje() {
		return colorPelaje;
	}

	public String getColorOjos() {
		return colorOjos;
	}

	public String getPienso() {
		return pienso;
	}

	public int getMesesEdad() {
		return mesesEdad;
	}

	public double getPeso() {
		return peso;
	}

	public double getPesoMinimo() {
		return pesoMinimo;
	}

	public int energia() {
		return energia;
	}

	public int caloriasQuemadas() {
		return caloriasQuemadas;
	}

	public int caloriasConsumidas() {
		return caloriasConsumidas;
	}

	public int horasDormir() {
		return horasDormir;
	}

	public boolean isChip() {
		return chip;
	}

	public boolean isRegistradoAdn() {
		return registradoAdn;
	}

	public boolean isVacunadoRabia() {
		return vacunadoRabia;
	}

	public boolean isVacunadoLesmania() {
		return vacunadoLesmania;
	}

	public boolean enfermo() {
		return enfermo;
	}

	public boolean isAlergico() {
		return alergico;
	}

	public boolean isVivo() {
		return vivo;
	}

	// Constructores
	public perro(String nombre, String raza, String colorPelaje, String colorOjos, String pienso, int mesesEdad,
			boolean chip, boolean registradoAdn, boolean vacunadoRabia, boolean vacunadoLesmania, boolean alergico,
			boolean vivo) {
		super();
		this.nombre = nombre;
		this.raza = raza;
		this.colorPelaje = colorPelaje;
		this.colorOjos = colorOjos;
		this.pienso = pienso;
		this.mesesEdad = mesesEdad;
		this.chip = chip;
		this.registradoAdn = registradoAdn;
		this.vacunadoRabia = vacunadoRabia;
		this.vacunadoLesmania = vacunadoLesmania;
		this.alergico = alergico;
		this.vivo = vivo;
	}

	// Métodos

	/**
	 * Si se sacrifica al perro:
	 */
	public void sacrificar() {
		this.vivo = false;
	}

	/**
	 * Si el perro consume calorías / come:
	 */
	public void comer() {
		if (caloriasConsumidas > caloriasQuemadas && energia > 0) {
			for (int i = caloriasConsumidas; i > caloriasQuemadas; i--) {
				this.peso = this.peso + 0.1;
			}
		}
		if (caloriasConsumidas < caloriasQuemadas && energia > 0) {
			for (int i = caloriasQuemadas; i > caloriasConsumidas; i--) {
				this.peso = this.peso - 0.1;

				if (peso < pesoMinimo) {
					this.vivo = false;
				}
			}
		}

	}

	/**
	 * Si el perro duerme:
	 */
	public void dormir() {
		for (int i = horasDormir; i > 0; i--) {
			energia++;
		}

		if (energia < -20) {
			this.vivo = false;
		}
	}

	/*
	 * Si el perro juega:
	 */

	public void jugar () {
		Scanner s = new Scanner (System.in);
		
		System.out.println("¿Cuántas horas va a jugar el perro?");
		int horasJuego = Integer.parseInt(s.nextLine());
	
		if (this.enfermo || !this.vacunadoRabia || !this.vacunadoLesmania) {

		energia = energia - horasJuego;
}
		}
	
	/*
	 * Si dos perros se reproducen:
	 */
	
	public void culeo (perro abajo) {
		
		if ((this.macho != null)&&(abajo.hembra != null)&&(this.altura>abajo.altura)) {
			System.out.println("En aproximadamente 2 meses y pico vas a tener más perritos.");
		}else {
			System.out.println("Perros culeando.");
		}
	}
	}
