package models;

public class CPUPlayer extends AbstractPlayer {

	/**
	 * Constructor del jugador CPU, que hereda los atributos de AbstractPlayer.
	 * 
	 * @param mesa   - Mesa del juego
	 * @param nombre - Nombre del jugador
	 */
	public CPUPlayer(Mesa mesa, String nombre) {
		super(mesa, nombre);
	}

	/**
	 * M?todo con el que el CPU juega su turno.
	 */
	@Override
	public void jugarTurno() {

		int cardsNeeded = 0;

		// Recorre la baraja para saber cu?ntas cartas no le har?an perder la partida al
		// CPU. Solo lo hace si tiene m?s de 5 puntos.

		if (getPuntos() < 7.5) {
			if (getPuntos() > 5) {
				for (Carta c : this.mesa.getBaraja().lista_cartas) {
					if (getPuntos() + c.getValor7yMedia() <= 7.5) {
						cardsNeeded++;
					}
				}

			}
			// El CPU solo robar? otra carta si tiene menos de 5 puntos o su probabilidad de
			// conseguir una carta que no le har?a perder es mayor del 50%.
			if (getPuntos() <= 5 || ((cardsNeeded / this.mesa.getBaraja().lista_cartas.size()) > 0.5)) {
				Carta aux = new Carta(this.mesa.getBaraja().robar().getId());
				this.mano.insertaCartaFinal(aux);
				sumarPuntos(aux.getValor7yMedia());
				System.out.println(
						this.nombre + " ha sacado: " + aux.getNombreCarta() + "\tSu puntuaci?n: " + getPuntos());
				System.out.println("Su mano de cartas:");
				this.mano.listarCartas();
			} else {
				this.mano.lista_cartas.clear();
			}
		}
	}

}
