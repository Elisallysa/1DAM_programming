package models;

import java.util.Scanner;

public class HumanPlayer extends AbstractPlayer {

	// Constructor

	/**
	 * Constructor del jugador humano, que hereda los atributos de AbstractPlayer.
	 * 
	 * @param mesa   - Mesa del juego
	 * @param nombre - Nombre del jugador
	 */
	public HumanPlayer(Mesa mesa, String nombre) {
		super(mesa, nombre);
	}

	/**
	 * M?todo que permite al jugador humano jugar su turno.
	 */
	@SuppressWarnings("resource")
	@Override
	public void jugarTurno() {
		Scanner s = new Scanner(System.in);
		int choice;

		try {
			if (getPuntos() < 7.5 || !this.mano.lista_cartas.isEmpty()) {
				System.out.println("?Qu? deseas hacer?\n1.Robar carta\t2.Plantarme");
				choice = Integer.parseInt(s.nextLine());

				switch (choice) {
				case 1:
					Carta aux = new Carta(this.mesa.getBaraja().robar().getId());

					this.mano.insertaCartaFinal(aux);
					sumarPuntos(aux.getValor7yMedia());
					System.out.println("Has sacado: " + aux.getNombreCarta() + "\tPuntuaci?n de " + this.nombre + ": "
							+ getPuntos());
					System.out.println("Mano de cartas de " + this.nombre + ":");
					this.mano.listarCartas();
					break;
				case 2:
					this.mano.lista_cartas.clear();
					break;
				default:
					System.out.println("Por favor, introduce el n?mero 1 o 2 para continuar con el juego o plantarte.");
					break;
				}

			} else {
				this.mano.lista_cartas.clear();
			}

		} catch (Exception exc) {
			System.out.println("Por favor, introduce el 1 o el 2 para jugar.");
		}
	}

}
