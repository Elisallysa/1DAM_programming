package Tema5;

import java.util.Scanner;

public class ejercicio17 {
	/*
	 * Realiza un programa que sume los 100 números siguientes a un número entero y
	 * positivo introducido por teclado. Se debe comprobar que el dato introducido
	 * es correcto (que es un número positivo).
	 */
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		int numero;

		do {
			System.out.println("Introduce un número entero positivo:");
			numero = Integer.parseInt(s.nextLine());

		} while (numero < 0);

		s.close();

		int i;
		int suma = 0;

		for (i = 100; i > 0; i--) {
			suma += numero + i;

		}

		System.out.println("La suma de los 100 números después de " + numero + " da: " + suma);


	}
}
