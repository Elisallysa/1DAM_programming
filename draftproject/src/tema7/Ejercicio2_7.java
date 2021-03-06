package tema7;

import java.util.Scanner;

public class Ejercicio2_7 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner (System.in);
		
		/*
		 * Mejora el juego ?Busca el tesoro? de tal forma que si hay una mina a una casilla
de distancia, el programa avise diciendo ?Cuidado! ?Hay una mina cerca!
		 */

		// se definen constantes para representar el
		// contenido de las celdas
		
		final int VACIO = 0;
		final int MINA = 1;
		final int TESORO = 2;
		final int INTENTO = 3;
		int x;
		int y;
		int[][] cuadrante = new int[5][4];
		
		// inicializa el array
		for(x = 0; x < 4; x++) {
		for(y = 0; y < 3; y++) {
		cuadrante[x][y] = VACIO;
		}
		}
		// coloca la mina
		int minaX = (int)(Math.random() * 5);
		int minaY = (int)(Math.random() * 4);
		cuadrante[minaX][minaY] = MINA;
		// coloca el tesoro
		int tesoroX;
		int tesoroY;
		do {
		tesoroX = (int)(Math.random() * 5);
		tesoroY = (int)(Math.random() * 4);
		} while ((minaX == tesoroX) && (minaY == tesoroY));
		cuadrante[tesoroX][tesoroY] = TESORO;
		// juego
		System.out.println("?BUSCA EL TESORO!");
		
		boolean salir = false;
		String c = "";
		do {
		// pinta el cuadrante
		for(y = 3; y >= 0; y--) {
		System.out.print(y + "|");
		for(x = 0; x < 5; x++) {
		if (cuadrante[x][y] == INTENTO) {
		System.out.print("\tX\t");
		} else {
		System.out.print(" ");
		}
		}
		System.out.println();
		}
		System.out.println(" -----------------------------------------\n \t0\t1\t2\t3\t4\n");
		// pide las coordenadas
		System.out.print("Coordenada x: ");
		x = Integer.parseInt(s.nextLine());
		System.out.print("Coordenada y: ");
		y = Integer.parseInt(s.nextLine());
		// mira lo que hay en las coordenadas indicadas por el usuario
		switch(cuadrante[x][y]) {
		case VACIO:
		cuadrante[x][y] = INTENTO;
		break;
		case MINA:
		System.out.println("Lo siento, has perdido.");
		salir = true;
		break;
		case TESORO:
		System.out.println("?Enhorabuena! ?Has encontrado el tesoro!");
		salir = true;
		break;
		default:
		}
		} while (!salir);
		
		// pinta el cuadrante
		for(y = 3; y >= 0; y--) {
		System.out.print(y + " ");
		for(x = 0; x < 5; x++) {
		switch(cuadrante[x][y]) {
		
			case VACIO:			
			c = " ";
			break;
			case MINA:
			c = "*\t";
			break;
			case TESORO:
			c = "?\t";
			break;
			case INTENTO:
			c = "X\t";
			break;
			default:
			}
			System.out.print(c);
			}
			System.out.println();
			}
			System.out.println(" -----------------------------------------\n \t0\t1\t2\t3\t4\n");
			}
				

	}

