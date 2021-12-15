package tema7;

import java.util.Scanner;

public class Ejercicio6 {

	/*
	 * Escribe un programa que lea 15 números por teclado y que los almacene en un
	 * array. Rota los elementos de ese array, es decir, el elemento de la posición
	 * 0 debe pasar a la posición 1, el de la 1 a la 2, etc. El número que se
	 * encuentra en la última posición debe pasar a la posición 0. Finalmente,
	 * muestra el contenido del array.
	 */
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		int[] array = new int[15];
		int j = 0;

		System.out.println("Introduce 15 números:");
		for (int i = 0; i < 15; i++) {
			array[i] = Integer.parseInt(s.nextLine());
		}

		// int[] array = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16};

		for (int i = array.length - 1; i > 7; i--) {
			int aux = 0;
			aux = array[i];
			array[i] = array[j];
			array[j] = aux;
			j++;
		}

		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}

	}

}
