package models;

/**
 * Esta clase representa una carta de una baraja.
 * 
 * @author elisa
 *
 */
public class Carta {

	// Propiedades
	/**
	 * Entero que representa el n?mero de la carta.
	 */
	private int numero;
	/**
	 * Entero que representa el n?mero de la carta.
	 */
	private int palo;

	// Constructores
	/**
	 * Constructor para crear una carta dados su n?mero y su palo.
	 * 
	 * @param numero - entero que representa el n?mero de la carta (1-10)
	 * @param palo   - entero que representa el palo de la carta (0-3)
	 */
	public Carta(int numero, int palo) {
		super();
		this.numero = numero;
		this.palo = palo;
	}

	/**
	 * Constructor para crear una carta a partir de su id (1-40)
	 * 
	 * @param id - entero que representa cada carta de la baraja.
	 */
	public Carta(int id) {
		super();
		// Descartamos si la carta es un rey y averiguamos el n?mero de la carta con el
		// m?dulo %
		if (id != 10 && id != 20 && id != 30 && id != 40)
			this.numero = id % 10;
		// Si el id es 10, 20, 30 o 40, sabemos que es un rey
		else if (id == 10 || id == 20 || id == 30 || id == 40)
			this.numero = 10;
		else
			throw new IllegalArgumentException("La carta con el ID " + id + " no puede crearse.");
		// Restando una unidad al id, nos aseguramos que obtendremos el palo correcto en
		// el caso de que tengamos un rey
		this.palo = (id - 1) / 10;

	}

	// Getters y setters

	public int getId() {
		int id = (this.numero) + (this.palo * 10);
		return id;
	}

	public int getNumero() {
		return this.numero;
	}

	public int getPalo() {
		return this.palo;
	}

	// M?todos

	/*
	 * 
	 * ESTO NO SIRVE PARA NADA:
	 * 
	 * public int getId() {
	 *
	 * int [][] cardId = new int [4][10]; int numId=1; int i = 0; int j = 0;
	 * 
	 * do { for (i = 0; i<4; i++) { for (j=0; i<10; i++) { cardId[i][j] = numId;
	 * numId++; } } }while (i!=this.palo&j!=this.numero);
	 * 
	 * return numId; }
	 *
	 */

	/**
	 * M?todo que devuelve el nombre del n?mero de la carta como una cadena de
	 * caracteres.
	 * 
	 * @return String con el nombre del n?mero.
	 */
	public String getNombreNumero() {
		String numberName;
		switch (this.numero) {
		case 1:
			numberName = "as";
			break;
		case 2:
			numberName = "dos";
			break;
		case 3:
			numberName = "tres";
			break;
		case 4:
			numberName = "cuatro";
			break;
		case 5:
			numberName = "cinco";
			break;
		case 6:
			numberName = "seis";
			break;
		case 7:
			numberName = "siete";
			break;
		case 8:
			numberName = "sota";
			break;
		case 9:
			numberName = "caballo";
			break;
		case 10:
			numberName = "rey";
			break;
		default:
			numberName = "No se ha podido reconocer el n?mero.";
			break;

		}
		return numberName;
	}

	/**
	 * M?todo que devuelve el nombre del palo de la carta con una cadena de
	 * caracteres.
	 * 
	 * @return String con el nombre del palo de la carta.
	 */
	public String getNombrePalo() {
		String paloName;
		switch (this.palo) {
		case 0:
			paloName = "oros";
			break;
		case 1:
			paloName = "copas";
			break;
		case 2:
			paloName = "espadas";
			break;
		case 3:
			paloName = "bastos";
			break;
		default:
			paloName = "No se ha podido reconocer el palo, aseg?rate de que el n?mero introducido se encuentra entre 0 y 3.";
		}
		return paloName;
	}

	/**
	 * M?todo que devuelve el nombre de la carta. En el m?todo se llaman a otras
	 * funciones que devolver?n el nombre del n?mero en un String y el nombre del
	 * palo en un String.
	 * 
	 * @return String compuesto por el String del nombre del n?mero y el String del
	 *         nombre del palo de la carta.
	 */
	public String getNombreCarta() {

		return (this.getNombreNumero() + " de " + this.getNombrePalo());
	}

	/**
	 * M?todo que devuelve el valor de la carta en el juego del Tute.
	 * 
	 * @return N?mero entero que corresponde al valor de la carta.
	 */
	public int getValorTute() {

		int valorTute;

		switch (this.numero) {
		case 1:
			valorTute = 11;
			break;
		case 2:
			valorTute = 0;
			break;
		case 3:
			valorTute = 10;
			break;
		case 4:
			valorTute = 0;
			break;
		case 5:
			valorTute = 0;
			break;
		case 6:
			valorTute = 0;
			break;
		case 7:
			valorTute = 0;
			break;
		case 8:
			valorTute = 2;
			break;
		case 9:
			valorTute = 3;
			break;
		case 10:
			valorTute = 4;
			break;
		default:
			valorTute = 0;
		}
		return valorTute;
	}

	/**
	 * M?todo que devuelve el valor de la carta en el juego del Mus.
	 * 
	 * @return N?mero entero que corresponde al valor de la carta.
	 */
	public int getValorMus() {
		int valorMus;

		switch (this.numero) {
		case 1:
			valorMus = 1;
			break;
		case 2:
			valorMus = 1;
			break;
		case 3:
			valorMus = 10;
			break;
		case 4:
			valorMus = 4;
			break;
		case 5:
			valorMus = 5;
			break;
		case 6:
			valorMus = 6;
			break;
		case 7:
			valorMus = 7;
			break;
		case 8:
			valorMus = 10;
			break;
		case 9:
			valorMus = 10;
			break;
		case 10:
			valorMus = 10;
			break;
		default:
			valorMus = 0;
		}
		return valorMus;
	}

	/**
	 * M?todo que devuelve el valor de la carta en el juego de las 7 y media.
	 * 
	 * @return N?mero decimal que corresponde al valor de la carta.
	 */
	public double getValor7yMedia() {

		double valor7yM;

		switch (this.numero) {
		case 1:
			valor7yM = 1;
			break;
		case 2:
			valor7yM = 2;
			break;
		case 3:
			valor7yM = 3;
			break;
		case 4:
			valor7yM = 4;
			break;
		case 5:
			valor7yM = 5;
			break;
		case 6:
			valor7yM = 6;
			break;
		case 7:
			valor7yM = 7;
			break;
		case 8:
			valor7yM = 0.5;
			break;
		case 9:
			valor7yM = 0.5;
			break;
		case 10:
			valor7yM = 0.5;
			break;
		default:
			valor7yM = 0;
		}
		return valor7yM;
	}

	// toString

	/*
	 * NO SE NECESITA EL TO STRING??
	 * 
	 * @Override public String toString() { return "Carta [numero=" + numero +
	 * ", palo=" + palo + "]"; }
	 * 
	 */
}
