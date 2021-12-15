package Tema5;

import java.util.Scanner;

public class ejercicio15 {

	public static void main(String[] args) {
		/*
		 * Escribe un programa que dados dos números, uno real (base) y un entero
		 * positivo (exponente), saque por pantalla todas las potencias con base el
		 * numero dado y exponentes entre uno y el exponente introducido. No se deben
		 * utilizar funciones de exponenciación. Por ejemplo, si introducimos el 2 y el
		 * 5, se deberán mostrar 21, 22, 23, 24 y 25.
		 */

		Scanner s = new Scanner(System.in);

		System.out.println("Visualizar potencias con base x y exponente n. \nIntroduce primero la base x:");

		int x = Integer.parseInt(s.nextLine());

		System.out.println("Y ahora el exponente n (un número entero positivo):");

		int n = Integer.parseInt(s.nextLine());
		int exp = n - 1;

		do {

			System.out.println(x + "^" + (n - (exp--)));
		} while (exp >= 0);

	}

}
