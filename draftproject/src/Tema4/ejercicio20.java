package Tema4;

import java.util.Scanner;

/**
 * Realiza un programa que diga si un número entero positivo introducido por
 * teclado es capicúa. Se permiten números de hasta 5 cifras.
 */
public class ejercicio20 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		System.out.println("Introduzca un número de 5 cifras como máximo:");
		int numero = Integer.parseInt(s.nextLine());

		int mil = numero / 1000;
		int cien = numero / 100;
		int rest = numero % 100;

		if (numero < 10) {
			System.out.println("Tu número solo tiene una cifra.");
		}

		if ((numero >= 10 && numero < 100) && ((numero / 10) == (numero % 10))) {
			System.out.println("Tu número es capicúa.");
		} else {
			System.out.println("Tu número no es capicúa.");
		}

		if ((numero >= 100 && numero < 1000) && (numero / 100) == (numero % 10)) {

			System.out.println("Tu número es capicúa.");
		} else {
			System.out.println("Tu número no es capicúa.");
		}

		if ((numero >= 1000 && numero < 10000) && (numero / 1000) == (numero % 10)
				&& (((cien / 10) + (cien % 10)) == ((rest / 10) + (rest % 10)))) {

			System.out.println("Tu número es capicúa.");
		}

		if ((numero >= 10000 && numero < 100000) && ((numero / 10000) == (numero % 10))
				&& (((mil / 10) + (mil % 10)) == ((cien / 10) + (cien / 10)))) {
			System.out.println("Tu número es capicúa.");
		} else {
			System.out.println("Tu número no es capicúa.");
		}

		/*
		 * System.out.println(numero/1000); System.out.println(numero%10);
		 * System.out.println((cien/10)+(cien%10));
		 * System.out.println((rest/10)+(rest%10));
		 */
	}
}
