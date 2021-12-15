package Tema5;

import java.util.Scanner;

public class ejercicio21 {

	/*
	 * Realiza un programa que vaya pidiendo números hasta que se introduzca un
	 * numero negativo y nos diga cuantos números se han introducido, la media de
	 * los impares y el mayor de los pares. El número negativo sólo se utiliza para
	 * indicar el final de la introducción de datos pero no se incluye en el
	 * cómputo.
	 */

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		System.out.println(
				"Introduce todos los números que quieras para saber el total de la suma de los números, la media de los impares y el mayor de los pares. Para terminar la lista introduce un número negativo (no se tendrá en cuenta en los resultados):");

		int numero;
		int totalnumeros = -1;
		int sumaimp = 0;
		int parmayor = 0;
		int aux = 0;

		do {
			numero = Integer.parseInt(s.nextLine());
			totalnumeros++;

			if ((numero % 2 == 0) && (numero >= aux)) {
				aux = numero;
				numero = aux;
				parmayor = numero;

			}
			if (numero % 2 != 0) {
				sumaimp += numero;
			}
		} while (numero >= 0);

		System.out.println("Se han introducido " + totalnumeros + " números." + "\nLa media de los números impares es "
				+ sumaimp / 2 + "." + "\nEl mayor número par es " + parmayor + ".");

		s.close();
	}

}
