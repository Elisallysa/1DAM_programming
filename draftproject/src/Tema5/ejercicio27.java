package Tema5;

import java.util.Scanner;

public class ejercicio27 {

	public static void main(String[] args) {

		// Ejercicio 27. Escribe un programa que muestre, cuente y sume los m�ltiplos de
		// 3 que hay
		// entre 1 y un n�mero le�do por teclado.

		Scanner s = new Scanner(System.in);

		int contador = 0;
		int suma = 0;

		try {

			System.out.println("Introduce un n�mero:");
			int numero = Integer.parseInt(s.nextLine());

			System.out.println("Los m�ltiplos de tres entre 1 y " + numero + " son:");
			for (int i = 1; (i * 3) <= numero; i++) {
				int multiplo = i * 3;

				contador++;
				suma += multiplo;

				System.out.print(multiplo);
				System.out.print(" ");

			}
			System.out.println("");
			System.out.println("En total son " + contador + " n�mero(s).");
			System.out.println("Y la suma de estos n�meros da: " + suma);

		} catch (Exception e) {
			System.out.println("Por favor, introduce un n�mero ENTERO mayor de 1.");
		}

		s.close();
	}

}
