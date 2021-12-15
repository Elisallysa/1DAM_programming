package Tema5;

import java.util.Scanner;

public class ejercicio18 {

	/*
	 * Escribe un programa que obtenga los números enteros comprendidos entre dos
	 * números introducidos por teclado y validados como distintos, el programa debe
	 * empezar por el menor de los enteros introducidos e ir incrementando de 7 en
	 * 7.
	 */
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		int n1;
		int n2;
		int aux;
		int i;

		System.out.println(
				"Introduce dos números distintos y se mostrará una serie de números con un incremento de 7 unidades desde el número más pequeño al mayor.\nIntroduce el numero n1:");
		n1 = Integer.parseInt(s.nextLine());

		do {
			System.out.println("Introduce otro número distinto al anterior:");
			n2 = Integer.parseInt(s.nextLine());
		} while (n1 == n2);

		s.close();

		if ((n1 > n2) && (n1 - n2 >= 7)) {
			aux = n1;
			n1 = n2;
			n2 = aux;

			for (i = n1; i <= n2; i += 7) {
				System.out.println(i);
			}

		} else if (n2 - n1 >= 7) {
			for (i = n1; i <= n2; i += 7) {
				System.out.println(i);
			}
		}

		if (((n1 - n2 >= 0) && (n1 - n2 < 7)) || ((n2 - n1 >= 0) && (n2 - n1 < 7))) {
			System.out.println("Introduzca dos números que disten más de 7 unidades entre sí.");
		}

	}

}
