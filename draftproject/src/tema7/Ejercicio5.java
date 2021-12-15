package tema7;

import java.util.Scanner;

public class Ejercicio5 {

	/*
	 * Escribe un programa que pida 10 números por teclado y que luego muestre los
	 * números introducidos junto con las palabras “máximo” y “mínimo” al lado del
	 * máximo y del mínimo respectivamente.
	 */

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		System.out.println("Introduce 10 numeros separados por intro:");

		int[] diezNumeros = new int[10];

		int max = 0;
		int min = 0;

		/*
		 * PARA PROBAR: diezNumeros[0]= 3; diezNumeros[1] = 5; diezNumeros[2] =4;
		 * diezNumeros[3]=8; diezNumeros[4] =9; diezNumeros[5]=10; diezNumeros[6]=1;
		 * diezNumeros[7]=20; diezNumeros[8]=2; diezNumeros[9]=7;
		 */

		for (int i = 0; i < 10; i++) {
			int numero = Integer.parseInt(s.nextLine());
			diezNumeros[i] = numero;
		}

		if (diezNumeros[0] > diezNumeros[1] && diezNumeros[0] > max) {
			max = diezNumeros[0];
			min = diezNumeros[1];
		} else {
			max = diezNumeros[1];
			min = diezNumeros[0];
		}

		for (int i = 0; i < 9; i++) {

			if (diezNumeros[i] > diezNumeros[i + 1] && diezNumeros[i] > max) {
				max = diezNumeros[i];
			}
			if (diezNumeros[i] < diezNumeros[i + 1] && diezNumeros[i] < min) {
				min = diezNumeros[i];
			}

		}

		for (int i = 0; i < 10; i++) {
			System.out.print(diezNumeros[i]);
			if (max == diezNumeros[i]) {
				System.out.print(" Máximo\n\n");
			} else if (min == diezNumeros[i]) {
				System.out.print(" Mínimo\n\n");
			} else {
				System.out.println("\n");
			}

		}

		s.close();
	}

}
