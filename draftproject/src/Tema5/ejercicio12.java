package Tema5;

import java.util.Scanner;

public class ejercicio12 {

	/*
	 * Escribe un programa que muestre los n primeros t�rminos de la serie de
	 * Fibonacci. El primer t�rmino de la serie de Fibonacci es 0, el segundo es 1 y
	 * el resto se calcula sumando los dos anteriores, por lo que tendr�amos que los
	 * t�rminos son 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144� El n�mero n se
	 * debe introducir por teclado.
	 */

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		System.out.println("SERIE DE FIBONACCI\n�C�antos n�meros quieres ver?");
		int n = Integer.parseInt(s.nextLine());

		int n1 = 0;
		int n2 = 1;
		n1 = 0;
		n2 = 1;

		System.out.print("0 1");

		while (n != 0) {

			int aux;
			aux = n1;
			n1 = n2;
			n2 = aux + n2;
			System.out.print(" " + n2);
			n--;

		}

	}
}