package models;

public class Mano extends Baraja {

	// Constructor
	/**
	 * Constructor para no dejar la clase vac?a. Este constructor llamar? a la clase
	 * Baraja. Que lo que hace es inicializar un ArrayList vac?o.
	 */
	public Mano() {
		super();
	}

	// M?todos

	/**
	 * M?todo que imprime todas las cartas en la mano.
	 */
	public void listarCartas() {
		for (Carta c : this.lista_cartas) {
			System.out.println(c.getNombreCarta() + " ");
		}
	}

	/**
	 * Lista cartas y adem?s permite elegir una de las cartas y la devuelve.
	 */
	public Carta elegirCarta() {
		return null;
	}

}
