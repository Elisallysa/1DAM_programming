package main;

import java.util.Scanner;
import models.AbstractGame;
import models.SieteYMedia;

public class MainApp {

	public static void main(String[] args) {
		// jugar7ymedia();

		partida();

	}

	@SuppressWarnings("resource")
	public static void partida() {
		Scanner s = new Scanner(System.in);
		AbstractGame juego = new SieteYMedia();
		String restart = null;

		juego.bienvenida();

		do {
			juego.menuPrincipal();
			System.out.println("");
			System.out.println("?Otra partida? Introduce S? para continuar o cualquier otro caracter para salir.");
			try {
				restart = s.nextLine();
			} catch (Exception e) {
				System.out.println("Por favor, introduce un caracter.");
			}

		} while (restart.equalsIgnoreCase("S?") || restart.equalsIgnoreCase("SI"));

		System.out.println("?Gracias por jugar a las 7 y media!");

	}

//	public static void jugar7ymedia() {
//		Scanner s = new Scanner(System.in);
//
//		Baraja baraja = new Baraja(1, true);
//
//		double puntuacion = 0;
//		int choice;
//		boolean finJuego = false;
//		ArrayList<Carta> mano = new ArrayList<Carta>();
//
//		System.out.println("Juego de las 7 y media:\n");
//
//		try {
//
//			do {
//				if (puntuacion < 7.5) {
//					System.out.println("?Qu? deseas hacer?\n1.Robar carta\t2.Plantarme");
//					choice = Integer.parseInt(s.nextLine());
//
//					switch (choice) {
//					case 1:
//						Carta aux = new Carta(baraja.robar().getId());
//						mano.add(aux);
//						puntuacion += aux.getValor7yMedia();
//						System.out.println("Has sacado el " + aux.getNombreCarta() + "\tTu puntuaci?n: " + puntuacion);
//						System.out.println("Tu mano de cartas:");
//						for (int i = 0; i < mano.size(); i++) {
//							System.out.println("? " + mano.get(i).getNombreCarta());
//						}
//						break;
//					case 2:
//						finJuego = true;
//						break;
//					default:
//						System.out.println(
//								"Por favor, introduce el n?mero 1 o 2 para continuar con el juego o plantarte.");
//						break;
//					}
//
//				} else {
//					finJuego = true;
//				}
//			} while (!finJuego);
//
//		} catch (Exception exc) {
//			System.out.println("Por favor, introduzca el 1 o el 2 para jugar.");
//		}
//
//		System.out.println("");
//
//		if (puntuacion == 0) {
//			System.out.println("?No quieres jugar o qu??");
//		}
//		if (puntuacion > 0 && puntuacion < 6) {
//			System.out.println("Qu? cagao.");
//		}
//		if (puntuacion > 6 && puntuacion < 7.5) {
//			System.out.println("Uf, ?qu? cerca!");
//		}
//		if (puntuacion == 7.5) {
//			System.out.println("?Has ganado!");
//		}
//		if (puntuacion > 7.5) {
//			System.out.println("Te has pasado.");
//		}
//
//		s.close();
//	}

}
