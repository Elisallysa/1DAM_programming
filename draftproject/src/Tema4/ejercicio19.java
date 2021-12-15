package Tema4;

import java.util.Scanner;

/*
 * 
 */
public class ejercicio19 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		System.out.println("¿Cuántos dígitos tiene un número?\nIntroduzca uno:");
		int numero = Math.abs(Integer.parseInt(s.nextLine()));

		if (numero > 99999) {
			System.out.println("Por favor, introduce un número de 5 cifras como máximo.");
		} else {
			if (numero >= 10000 && numero <= 99999) {
				System.out.println("El número tiene 5 dígitos.");

			} else {
				if (numero >= 1000 && numero < 10000) {
					System.out.println("El número tiene 4 dígitos.");
				} else {
					if (numero >= 100 && numero < 1000) {
						System.out.println("El número tiene 3 dígitos.");
					} else {
						if (numero >= 10 && numero < 100) {
							System.out.println("El número tiene 2 dígitos.");
						} else {
							if (numero < 10) {
								System.out.println("El número tiene 1 dígito.");
							}
						}

					}

				}

			}

		}

	}

}
