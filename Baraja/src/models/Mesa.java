package models;

import java.util.ArrayList;
import java.util.List;

public class Mesa {

	// Atributos

	/**
	 * Objeto que representa la baraja, que a su vez contiene una serie de cartas.
	 */
	private Baraja baraja;

	// Constructores

	/**
	 * Cuando se cree la mesa no quiero pasarle directamente la baraja, porque yo
	 * puedo crear la baraja por ?l.
	 */
	public Mesa() {
		this.baraja = new Baraja(1, true);
	}

	// Getters & Setters

	/**
	 * Getter que devuelve la baraja de la mesa.
	 * 
	 * @return Objeto Baraja de la mesa.
	 */
	public Baraja getBaraja() {
		return baraja;
	}

	// M?todos

	/**
	 * M?todo que roba la primera carta de la baraja.
	 * 
	 * @return Una carta menos en la baraja.
	 */
	public Carta robarCartaDeBaraja() {
		return this.baraja.robar();
	}

	/**
	 * M?todo que elimina n cartas de la baraja.
	 * 
	 * @param n - N?mero entero de cartas que se desea robar.
	 * @return ArrayList de las n cartas que se han robado.
	 */
	public List<Carta> robarVariasCartas(int n) {
		ArrayList<Carta> aux = new ArrayList<Carta>();
		for (int i = 0; i < n; i++) {
			aux.add(this.baraja.robar());
		}
		return aux;
	}

	/**
	 * M?todo que a?ade un Objeto Carta al final de la baraja.
	 * 
	 * @param c - Carta que se insertar? al final de la baraja de la mesa.
	 */
	public void addCartaABaraja(Carta c) {
		this.baraja.insertaCartaFinal(c);
	}

}
