package Tema5;

import java.util.Scanner;

public class ejercicio7 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int codigo = 0000;
		int intentos = 0;

		do {
			System.out.println("Introduzca el c�digo secreto:");
			codigo = Integer.parseInt(s.nextLine());
			if (codigo != 1987) {
				System.out.println("C�digo incorrecto.");
				intentos++;
			} else {
				System.out.println("C�digo correcto");
			}

		} while ((intentos < 4) && (codigo != 1987));

		s.close();

		/*
		 * while ((codigo!=1987)&&(intentos<5)) {
		 * System.out.println("Introduzca el c�digo secreto:"); codigo =
		 * Integer.parseInt(s.nextLine());
		 * 
		 * if (codigo!=1987) {
		 * System.out.println("C�digo incorrecto. Vuelva a intentarlo."); intentos++; }
		 * 
		 * System.out.println("Ha agotado sus intentos.");
		 * 
		 * if (codigo==1987) { System.out.println("C�digo correcto.");
		 */
	}

}
