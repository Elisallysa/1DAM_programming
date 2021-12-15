package Tema5;

import java.util.Scanner;

public class ejercicio12 {

	/*
	 * Escribe un programa que muestre los n primeros términos de la serie de
	 * Fibonacci. El primer término de la serie de Fibonacci es 0, el segundo es 1 y
	 * el resto se calcula sumando los dos anteriores, por lo que tendríamos que los
	 * términos son 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144… El número n se
	 * debe introducir por teclado.
	 */

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		System.out.println("SERIE DE FIBONACCI\n¿Cúantos números quieres ver?");
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