package models;

import java.util.ArrayList;

public class Baraja {

	/**
	 * La �nica propiedad de la baraja es un ArrayList con las cartas que incluye la
	 * baraja. �No se puede dejar una propiedad sin inicializar!
	 */
	// Propiedades
	private ArrayList<Carta> lista_cartas;

	/**
	 * Si yo creo una baraja vac�a y no le reservo memoria, no va a funcionar. Se le
	 * reserva la memoria a�adiendo "lista_cartas = new ArrayList<>();
	 */
	// Constructores
	public Baraja() {
		lista_cartas = new ArrayList<>();
	}

	public Baraja(int tipobaraja) {
		this();
		if (tipobaraja == 1 || tipobaraja == 2) {
			for (int i = 1; i <= (40 * tipobaraja); i++) {
				if (i < 41) {
					this.lista_cartas.add(new Carta(i));
				} else {
					this.lista_cartas.add(new Carta(i - 40));
				}
			}
		}
	}

	public Baraja(int tipobaraja, boolean barajar) {
		this(tipobaraja);
		barajar();
	
	}

	// M�todos
	/**
	 * 
	 */
	public void barajar() {
		
	}
	
	public void cortar() {
		
	}
	
	public void robar() {
		
	}
	
	public void insertaCartaFinal(int id_carta) {
		
	}
	
	public void insertaCartaPrincipio(int id_carta) {
		
	}
	
	public void insertaCartaFinal(Carta c) {
		
	}
	
	public void insertaCartaPrincipio(Carta c) {
		
	}

	// toStrings

}
