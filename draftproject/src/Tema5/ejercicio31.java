package Tema5;

import java.util.Scanner;

public class ejercicio31 {

	public static void main(String[] args) {
		/*
		 * Realiza un programa que pinte la letra L por pantalla hecha con asteriscos.
		 * El programa pedir� la altura. El palo horizontal de la L tendr� una longitud
		 * de la mitad (divisi�n entera entre 2) de la altura m�s uno.
		 */
		Scanner s = new Scanner(System.in);

		int altura;
		int horizontal = 0;

		try {
			do {
				System.out.println("Introduzca la altura de la L:");
				altura = Integer.parseInt(s.nextLine());
			} while (altura < 0);

			horizontal = (altura / 2) + 1;

			for (int i = altura - 1; i > 0; i--) {
				System.out.println("*");
			}
			for (int i = horizontal; i > 0; i--) {
				System.out.print("* ");

			}
		} catch (Exception e) {
			System.out.println("Por favor, introduce un n�mero entero positivo como altura.");
		}

		s.close();
	}

}
