package Tema5;

import java.util.Scanner;

public class ejercicio16 {

	public static void main(String[] args) {
		/*
		 * Escribe un programa que diga si un número introducido por teclado es o no
		 * primo. Un número primo es aquel que sólo es divisible entre él mismo y la
		 * unidad.
		 */

		Scanner s = new Scanner(System.in);

		System.out.println("Introduce un número:");
		int n = Integer.parseInt(s.nextLine());
		int i = 0;
		i = n - 1;

		do {
			i--;

		} while ((double) n % i != 0);

		if (i == 1) {
			System.out.println("El número es primo.");
		} else {
			System.out.println("El número no es primo.");
		}

		s.close();

	}

}
