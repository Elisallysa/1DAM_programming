package Tema5;

import java.util.Scanner;

public class ejercicio29 {

	public static void main(String[] args) {
		/*
		 * Escribe un programa que muestre por pantalla todos los números enteros
		 * positivos menores a uno leído por teclado que no sean divisibles entre otro
		 * también leído de igual forma.
		 */

		Scanner s = new Scanner(System.in);

		int numeromax = 0;
		int divisor = 0;

		try {
			do {
				System.out.println("Introduce un número entero positivo:");
				numeromax = Integer.parseInt(s.nextLine());
			} while (numeromax < 0);

			do {
				System.out.println("Introduce el divisor (debe ser menor al número anterior):");
				divisor = Integer.parseInt(s.nextLine());
			} while (divisor > numeromax);

			System.out.println("Los números enteros menores a " + numeromax + " divisibles entre " + divisor + " son:");

			for (int i = numeromax; i > 0; i--) {
				if (i % divisor == 0) {
					System.out.print(i);
					System.out.print(" ");
				}

			}
		} catch (Exception e) {
			System.out.println("Por favor, repite el proceso e introduce números enteros.");
		}

		s.close();

	}

}
