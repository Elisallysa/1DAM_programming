package Tema5;

import java.util.Scanner;

public class ejercicio16 {

	public static void main(String[] args) {
		/*
		 * Escribe un programa que diga si un n�mero introducido por teclado es o no
		 * primo. Un n�mero primo es aquel que s�lo es divisible entre �l mismo y la
		 * unidad.
		 */

		Scanner s = new Scanner(System.in);

		System.out.println("Introduce un n�mero:");
		int n = Integer.parseInt(s.nextLine());
		int i = 0;
		i = n - 1;

		do {
			i--;

		} while ((double) n % i != 0);

		if (i == 1) {
			System.out.println("El n�mero es primo.");
		} else {
			System.out.println("El n�mero no es primo.");
		}

		s.close();

	}

}
