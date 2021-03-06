package models;

import java.util.ArrayList;

import enums.ModoJuego;

public abstract class AbstractGame {

	// Atributos

	/**
	 * Objeto que representa una mesa con una baraja.
	 */
	protected Mesa mesa;
	/**
	 * Lista de jugadores, bien CPU o humanos.
	 */
	protected ArrayList<AbstractPlayer> jugadores;
	/**
	 * Booleano que indicar? si el juego se ha terminado o no.
	 */
	protected boolean finished;
	/**
	 * Clase enum que indica el modo de juego.
	 */
	protected ModoJuego modo;
	/**
	 * N?mero entero que se podr? usar o no, que representa la ronda del juego.
	 */
	protected int ronda;

	// M?todos
	abstract public void bienvenida();

	abstract public void menuPrincipal();

	abstract public AbstractPlayer nextTurno();

	abstract public void start();

	public void barajar() {
		this.mesa.getBaraja().barajar();
	}

	/**
	 * M?todo que recoge todas las cartas en la mano de los jugadores.
	 */
	public void finish() {

	}
}
