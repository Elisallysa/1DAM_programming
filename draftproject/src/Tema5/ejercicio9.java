package Tema5;

import java.util.Scanner;

// 9. Realiza un programa que nos diga cu�ntos d�gitos tiene un n�mero introducido por teclado.
public class ejercicio9 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		int digitos = 1;

		System.out.println("�Cu�ntos d�gitos tiene un n�mero?\nIntroduce un n�mero:");
		int numero = Integer.parseInt(s.nextLine());

		int n = numero;

		while (n >= 10) {
			n /= 10;
			digitos++;
		}

		System.out.println(numero + " tiene " + digitos + " d�gito/s.");

		s.close();

		/*
		 * int operaciones = 0; int division = 0;
		 * 
		 * System.out.println("�Cu�ntos d�gitos tiene un n�mero?\nIntroduce un n�mero:"
		 * ); int numero = Integer.parseInt(s.nextLine());
		 * 
		 * 
		 * do { division = numero/10; System.out.println(division/10); operaciones++; }
		 * while (division%10<0); {
		 * 
		 * }
		 * 
		 * System.out.println("El n�mero tiene "+operaciones+" d�gitos.");
		 */
	}

}
