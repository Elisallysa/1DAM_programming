package Tema4;

import java.util.Scanner;

public class ejercicio18 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		System.out.println("Introduzca un número de 5 cifras como máximo:");
		int numero = Integer.parseInt(s.nextLine());

		if (numero < 10) {
			System.out.println("La primera cifra es: " + numero);

		}
		if (numero >= 10 && numero < 100) {
			System.out.println("La primera cifra es " + numero / 10);

		}
		if (numero >= 100 && numero < 1000) {
			System.out.println("La primera cifra es " + numero / 100);
		}
		if (numero >= 1000 && numero < 10000) {

			System.out.println("La primera cifra es " + numero / 1000);
		}
		if (numero >= 10000 && numero < 100000) {
			System.out.println("La primera cifra es " + numero / 10000);
		}
	}
}
