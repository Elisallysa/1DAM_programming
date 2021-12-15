package Tema5;

import java.util.Scanner;

public class ejercicio14 {

	public static void main(String[] args) {

		/*
		 * Escribe un programa que pida una base y un exponente (entero positivo) y que
		 * calcule la potencia.
		 */

		Scanner s = new Scanner(System.in);

		int exp = 0;

		System.out.println("CALCULA LA POTENCIA\nIntroduzca la base:");
		int base = Integer.parseInt(s.nextLine());
		do {
			System.out.println("Introduzca el exponente (entero positivo):");
			exp = Integer.parseInt(s.nextLine());

		} while (exp < 0);

		System.out.println("El resultado de " + base + " elevado a " + exp + " es: " + (int) Math.pow(base, exp));

		s.close();
	}

}
