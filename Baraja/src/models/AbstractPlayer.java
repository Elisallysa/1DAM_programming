package models;

public abstract class AbstractPlayer {

	// Atributos

	/**
	 * Objeto Mano con las cartas de la mano del jugador.
	 */
	protected Mano mano;
	/**
	 * Objeto Mesa donde se juega la partida.
	 */
	protected Mesa mesa;
	/**
	 * String que representa el nombre del jugador.
	 */
	protected String nombre;
	/**
	 * Puntuaci?n del jugador.
	 */
	private double puntos;

	// Constructor
	/*
	 * Constructor del jugador abstracto que juega en una mesa y tiene un nombre y
	 * al que se le crea una nueva mano vac?a de cartas y se le da una puntuaci?n
	 * inicial de 0 puntos.
	 */
	public AbstractPlayer(Mesa mesa, String nombre) {
		super();
		this.mano = new Mano();
		this.mesa = mesa;
		this.nombre = nombre;
		this.puntos = 0;
	}

	public double getPuntos() {
		return this.puntos;
	}

	public void sumarPuntos(double masPuntos) {
		this.puntos += masPuntos;
	}

	// M?todos
	/**
	 * M?todo para que el jugador pueda jugar su turno.
	 */
	public abstract void jugarTurno();

}
