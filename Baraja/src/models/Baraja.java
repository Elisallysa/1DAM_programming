package models;

import java.util.ArrayList;
import java.util.Collections;

public class Baraja {

	/**
	 * La ?nica propiedad de la baraja es un ArrayList con las cartas que incluye la
	 * baraja. ?No se puede dejar una propiedad sin inicializar!
	 */
	// Propiedades
	protected ArrayList<Carta> lista_cartas;

	/**
	 * Si yo creo una baraja vac?a y no le reservo memoria, no va a funcionar. Se le
	 * reserva la memoria a?adiendo "lista_cartas = new ArrayList<>();
	 */
	// Constructores
	public Baraja() {
		lista_cartas = new ArrayList<>();
	}

	/**
	 * Constructor que crea una baraja de 40 o una baraja doble de 80. Se le asigna
	 * un numero a cada carta (1-40). En el caso de la bajara doble, cada carta
	 * aparece duplicada en la lista.
	 * 
	 * @param tipobaraja - Entero (1 o 2) que se introducir? para seleccionar el
	 *                   tipo de baraja.
	 */
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

	/**
	 * Constructor para crear una baraja simple o doble barajada.
	 * 
	 * @param tipobaraja - entero (1 o 2) que crea una baraja simple (40 cartas) o
	 *                   doble (80 cartas).
	 * @param barajar    - Baraja las cartas de forma aleatoria.
	 */
	public Baraja(int tipobaraja, boolean barajar) {
		this(tipobaraja);
		barajar();

	}

	// M?todos
	/**
	 * M?todo que baraja las Cartas de la lista de forma aleatoria.
	 */
	public void barajar() {
		Collections.shuffle(lista_cartas);

		this.lista_cartas.get(0);

		/*
		 * Otra forma:
		 * 
		 * ArrayList<Carta> aux = new ArrayList<Carta>(); int con =
		 * this.lista_cartas.size(); while (!this.lista_cartas.isEmpty()) { int random =
		 * (int) (Math.random() * con); aux.add(this.lista_cartas.get(random));
		 * this.lista_cartas.remove(random); con--; }
		 * 
		 * for (int i = 0; i < aux.size(); i++) { this.lista_cartas.add(aux.get(i)); }
		 * 
		 */
	}

	/**
	 * M?todo que corta la baraja por un punto aleatorio y pasa la primera mitad al
	 * final del mazo.
	 */
	public void cortar() {
		ArrayList<Carta> aux = new ArrayList<Carta>();
		int size = this.lista_cartas.size();
		int corte = (int) (Math.random() * size);
		for (int i = corte; i < this.lista_cartas.size(); i++) {
			aux.add(this.lista_cartas.get(i));

		}
		for (int j = 0; j < corte; j++) {
			aux.add(this.lista_cartas.get(j));
		}
	}

	/**
	 * M?todo que elimina una carta de la lista.
	 * 
	 * @return Una carta menos en la baraja.
	 */
	public Carta robar() {
		return this.lista_cartas.remove(0);
	}

	/**
	 * M?todo que inserta una carta al final de la baraja.
	 * 
	 * @param id_carta - N?mero entero que corresponde al ID de una carta de la
	 *                 baraja.
	 */
	public void insertaCartaFinal(int id_carta) {
		this.lista_cartas.add(new Carta(id_carta));
	}

	/**
	 * M?todo que inserta una carta al principio de la baraja.
	 * 
	 * @param id_carta - N?mero entero que corresponde al ID de una carta de la
	 *                 baraja.
	 */
	public void insertaCartaPrincipio(int id_carta) {
		this.lista_cartas.add(0, new Carta(id_carta));
	}

	/**
	 * M?todo que inserta una carta al final de la baraja.
	 * 
	 * @param c - Objeto que representa una Carta de la baraja.
	 */
	public void insertaCartaFinal(Carta c) {
		this.lista_cartas.add(c);
	}

	/**
	 * M?todo que inserta una carta al principio de la baraja.
	 * 
	 * @param c - Objeto que representa una Carta de la baraja.
	 */
	public void insertaCartaPrincipio(Carta c) {
		this.lista_cartas.add(0, c);
	}

	/**
	 * M?todo que devuelve true si la lista est? vac?a.
	 * 
	 * @return true: si la lista est? vac?a; false: si la lista tiene cartas.
	 */
	public boolean isVacia() {
		return this.lista_cartas.isEmpty();
	}
}
