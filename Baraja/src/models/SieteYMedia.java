package models;

import java.util.ArrayList;
import java.util.Scanner;

import enums.ModoJuego;

public class SieteYMedia extends AbstractGame {

	/**
	 * Constructor del juego "7 y media". Cuando se construye, se crea un nuevo
	 * objeto Mesa y una nueva lista de jugadores.
	 */
	public void SieteYmedia() {
		this.mesa = new Mesa();
		this.jugadores = new ArrayList<AbstractPlayer>();

	}

	@Override
	public void bienvenida() {
		System.out.println(
				"Bienvenido al juego de las 7 y media.\nEl objetivo del juego es acercarse lo m?ximo posible al 7,5 sin pasarse.\nLas figuras valen 0,5 puntos y el resto de cartas tienen su valor.");

	}

	@SuppressWarnings("resource")
	@Override
	public void menuPrincipal() {
		try {
			System.out.println(
					"?Qu? modo de juego desea jugar?\n 1. Solitario\t 2. Uno vs CPU\t 3. PvP\t 4. Multiplayer");
			Scanner s = new Scanner(System.in);
			int modoChoice = Integer.parseInt(s.nextLine());
			this.mesa = new Mesa();
			this.jugadores = new ArrayList<AbstractPlayer>();

			switch (modoChoice) {
			case 1:
				System.out.println("Modo Solitario seleccionado.");
				this.modo = ModoJuego.Solitario;

				System.out.println("Por favor, introduce tu nickname:");
				String nickname = s.nextLine();
				AbstractPlayer jugSolo = new HumanPlayer(mesa, nickname);
				this.jugadores.add(jugSolo);

				do {
					jugSolo.jugarTurno();
				} while (jugSolo.getPuntos() < 7.5 && !jugSolo.mano.isVacia());

				System.out.println("");

				// Resultados del juego Solitario:

				if (jugSolo.getPuntos() == 0) {
					System.out.println("?No quieres jugar o qu??");
				}
				if (jugSolo.getPuntos() > 0 && jugSolo.getPuntos() <= 6) {
					System.out.println("Te has plantado con " + jugSolo.getPuntos() + " puntos. Qu? cagao.");
				}
				if (jugSolo.getPuntos() > 6 && jugSolo.getPuntos() < 7.5) {
					System.out.println("Te has plantado con " + jugSolo.getPuntos() + " puntos. Uf, ?qu? cerca!");
				}
				if (jugSolo.getPuntos() == 7.5) {
					System.out.println("?Has ganado!");
				}
				if (jugSolo.getPuntos() > 7.5) {
					System.out.println("Tu puntuaci?n final es de " + jugSolo.getPuntos() + ". Te has pasado.");
				}
				break;
			case 2:
				System.out.println("Modo Uno vs CPU seleccionado.");
				this.modo = ModoJuego.UnovsCPU;
				System.out.println("Por favor, introduce tu nickname:");
				nickname = s.nextLine();
				System.out.println("?C?mo se va a llamar tu contrincante?");
				String cpu0Name = s.nextLine();
				AbstractPlayer jugador0 = new HumanPlayer(mesa, nickname);
				AbstractPlayer cpu0 = new CPUPlayer(mesa, cpu0Name);
				this.jugadores.add(jugador0);
				this.jugadores.add(cpu0);

				if (Math.round(Math.random()) == 0) {
					System.out.println("Empiezas t?, " + jugador0.nombre + ".");
					do {
						if (cpu0.getPuntos() <= 7.5) {
							jugador0.jugarTurno();
						}
						System.out.println("");
						if (jugador0.getPuntos() <= 7.5) {
							cpu0.jugarTurno();
						}

					} while ((jugador0.getPuntos() <= 7.5 && cpu0.getPuntos() <= 7.5)
							&& !(jugador0.mano.isVacia() && cpu0.mano.isVacia()));
				} else {
					System.out.println("Empieza " + cpu0.nombre + ".");
					do {
						if (jugador0.getPuntos() <= 7.5) {
							cpu0.jugarTurno();
						}
						System.out.println("");
						if (cpu0.getPuntos() <= 7.5) {
							jugador0.jugarTurno();
						}
					} while ((jugador0.getPuntos() <= 7.5 && cpu0.getPuntos() <= 7.5)
							&& !(jugador0.mano.isVacia() && cpu0.mano.isVacia()));
				}

				System.out.println("");
				// Resultados del juego 1vsCPU:

				System.out.println("Tu puntuaci?n final: " + jugador0.getPuntos());
				System.out.println("Puntuaci?n de " + cpu0.nombre + ": " + cpu0.getPuntos());

				if (jugador0.getPuntos() > 7.5) {
					System.out.println("Lo siento, " + cpu0.nombre + " ha ganado el juego.");
				} else if (cpu0.getPuntos() > 7.5) {
					System.out.println("?Has ganado, " + jugador0.nombre + "!");
				} else if ((7.5 - jugador0.getPuntos()) > (7.5 - cpu0.getPuntos()) || cpu0.getPuntos() == 7.5) {
					System.out.println("Lo siento, " + cpu0.nombre + " ha ganado el juego.");
				} else if ((7.5 - cpu0.getPuntos()) > (7.5 - jugador0.getPuntos()) || jugador0.getPuntos() == 7.5) {
					System.out.println("?Has ganado, " + jugador0.nombre + "!");
				} else if (jugador0.getPuntos() == cpu0.getPuntos()) {
					System.out.println("?Empate!");
				}

				break;
			case 3:
				System.out.println("Modo PvP seleccionado.");
				this.modo = ModoJuego.PvP;
				System.out.println("Por favor, introduce el nickname del jugador 1:");
				String jug1Name = s.nextLine();
				System.out.println("Ahora, el del jugador 2:");
				String jug2Name = s.nextLine();
				AbstractPlayer jugador1 = new HumanPlayer(mesa, jug1Name);
				AbstractPlayer jugador2 = new HumanPlayer(mesa, jug2Name);
				this.jugadores.add(jugador1);
				this.jugadores.add(jugador2);

				if (Math.round(Math.random()) == 0) {
					System.out.println("Empieza " + jugador1.nombre + ". ?Adelante!");
					do {
						if (jugador2.getPuntos() <= 7.5 && !jugador1.mano.isVacia()) {
							System.out.println("Turno de " + jugador1.nombre + ".");
							jugador1.jugarTurno();
						}
						System.out.println("");
						if (jugador1.getPuntos() <= 7.5 && !jugador2.mano.isVacia()) {
							System.out.println("Turno de " + jugador2.nombre + ".");
							jugador2.jugarTurno();
						}
						System.out.println("");
					} while ((jugador1.getPuntos() <= 7.5 && jugador2.getPuntos() <= 7.5)
							&& !(jugador1.mano.isVacia() && jugador2.mano.isVacia()));
				} else {
					System.out.println("Empieza " + jugador2.nombre + ". ?Adelante!");
					do {
						if (jugador1.getPuntos() <= 7.5 && !jugador2.mano.isVacia()) {
							System.out.println("Turno de " + jugador2.nombre + ".");
							jugador2.jugarTurno();
						}
						System.out.println("");
						if (jugador2.getPuntos() <= 7.5 && !jugador1.mano.isVacia()) {
							System.out.println("Turno de " + jugador1.nombre + ".");
							jugador1.jugarTurno();
						}
						System.out.println("");
					} while ((jugador1.getPuntos() <= 7.5 && jugador2.getPuntos() <= 7.5)
							&& !(jugador1.mano.isVacia() && jugador2.mano.isVacia()));
				}

				System.out.println("");
				// Resultados del juego 1vsCPU:

				System.out.println("La puntuaci?n final de " + jugador1.nombre + ": " + jugador1.getPuntos());
				System.out.println("La puntuaci?n final de " + jugador2.nombre + ": " + jugador2.getPuntos());

				if (jugador1.getPuntos() > 7.5) {
					System.out.println("?Has ganado, " + jugador2.nombre + "!");
				} else if (jugador2.getPuntos() > 7.5) {
					System.out.println("?Has ganado, " + jugador1.nombre + "!");
				} else if ((7.5 - jugador1.getPuntos()) > (7.5 - jugador2.getPuntos()) || jugador2.getPuntos() == 7.5) {
					System.out.println("Lo siento, " + jugador1.nombre + " ha ganado el juego.");
				} else if ((7.5 - jugador2.getPuntos()) > (7.5 - jugador1.getPuntos()) || jugador1.getPuntos() == 7.5) {
					System.out.println("?Has ganado, " + jugador1.nombre + "!");
				} else if (jugador1.getPuntos() == jugador2.getPuntos()) {
					System.out.println("?Empate!");
				}
				break;
			case 4:
				System.out.println("Modo Multijugador seleccionado.");
				this.modo = ModoJuego.Multiplayer;
				System.out.println("Este modo no est? disponible.");
				break;
			default:
				System.out.println("Por favor introduzca un n?mero entero del 1 - 4.");
				break;

			}
		} catch (Exception e) {
			System.out.println("Por favor introduce un n?mero entero del 1-4.");
		}

	}

	@Override
	public AbstractPlayer nextTurno() {
		return null;
	}

	@Override
	public void start() {
	}

}
