package Tema4;

import java.util.Scanner;

/*
 * 
 */
public class ejercicio19 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		System.out.println("�Cu�ntos d�gitos tiene un n�mero?\nIntroduzca uno:");
		int numero = Math.abs(Integer.parseInt(s.nextLine()));

		if (numero > 99999) {
			System.out.println("Por favor, introduce un n�mero de 5 cifras como m�ximo.");
		} else {
			if (numero >= 10000 && numero <= 99999) {
				System.out.println("El n�mero tiene 5 d�gitos.");

			} else {
				if (numero >= 1000 && numero < 10000) {
					System.out.println("El n�mero tiene 4 d�gitos.");
				} else {
					if (numero >= 100 && numero < 1000) {
						System.out.println("El n�mero tiene 3 d�gitos.");
					} else {
						if (numero >= 10 && numero < 100) {
							System.out.println("El n�mero tiene 2 d�gitos.");
						} else {
							if (numero < 10) {
								System.out.println("El n�mero tiene 1 d�gito.");
							}
						}

					}

				}

			}

		}

	}

}
