package tema7;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		/*
		 * Escribe un programa que genere 100 n�meros aleatorios del 0 al 20 y que los
		 * muestre por pantalla separados por espacios. El programa pedir� entonces por
		 * teclado dos valores y a continuaci�n cambiar� todas las ocurrencias del
		 * primer valor por el segundo en la lista generada anteriormente. Los n�meros
		 * que se han cambiado deben aparecer entrecomillados.
		 */

		Scanner s = new Scanner(System.in);

		int[] array = new int[100];

		for (int i = 0; i < 100; i++) {
			array[i] = (int) (Math.random() * 21);
			if (i != 99) {
				System.out.print(array[i] + " ");
			} else {
				System.out.println(array[i]);
			}

		}

		System.out.println("�Qu� n�mero quieres sustituir?");
		int num = Integer.parseInt(s.nextLine());
		System.out.println("�Por cu�l?");
		int num2 = Integer.parseInt(s.nextLine());

		for (int i = 0; i < 100; i++) {
			if (array[i] == num) {
				System.out.print("'" + num2 + "' ");

			} else {
				System.out.print(array[i] + " ");
			}
		}

	}

}
