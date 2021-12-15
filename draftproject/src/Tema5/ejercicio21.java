package Tema5;

import java.util.Scanner;

public class ejercicio21 {

	/*
	 * Realiza un programa que vaya pidiendo n�meros hasta que se introduzca un
	 * numero negativo y nos diga cuantos n�meros se han introducido, la media de
	 * los impares y el mayor de los pares. El n�mero negativo s�lo se utiliza para
	 * indicar el final de la introducci�n de datos pero no se incluye en el
	 * c�mputo.
	 */

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		System.out.println(
				"Introduce todos los n�meros que quieras para saber el total de la suma de los n�meros, la media de los impares y el mayor de los pares. Para terminar la lista introduce un n�mero negativo (no se tendr� en cuenta en los resultados):");

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

		System.out.println("Se han introducido " + totalnumeros + " n�meros." + "\nLa media de los n�meros impares es "
				+ sumaimp / 2 + "." + "\nEl mayor n�mero par es " + parmayor + ".");

		s.close();
	}

}
