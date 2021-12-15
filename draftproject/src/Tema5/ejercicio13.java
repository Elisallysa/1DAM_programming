package Tema5;

import java.util.Scanner;

public class ejercicio13 {

	public static void main(String[] args) {

		/*
		 * Escribe un programa que lea una lista de diez n�meros y determine cu�ntos son
		 * positivos, y cu�ntos son negativos.
		 */
		Scanner s = new Scanner(System.in);

		System.out.println("Introduce una lista de 10 n�meros separados por INTRO:");

		int pos = 0;
		int neg = 0;

		do {
			int num = Integer.parseInt(s.nextLine());
			if (num >= 0) {
				pos++;
			} else if (num < 0) {
				neg++;

			}

		} while ((pos + neg) != 10);

		System.out.println("Has introducido " + pos + " n�meros positivos y " + neg + " n�meros negativos.");

		s.close();
	}

}
