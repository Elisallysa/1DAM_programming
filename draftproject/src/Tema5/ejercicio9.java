package Tema5;

import java.util.Scanner;

// 9. Realiza un programa que nos diga cuántos dígitos tiene un número introducido por teclado.
public class ejercicio9 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		int digitos = 1;

		System.out.println("¿Cuántos dígitos tiene un número?\nIntroduce un número:");
		int numero = Integer.parseInt(s.nextLine());

		int n = numero;

		while (n >= 10) {
			n /= 10;
			digitos++;
		}

		System.out.println(numero + " tiene " + digitos + " dígito/s.");

		s.close();

		/*
		 * int operaciones = 0; int division = 0;
		 * 
		 * System.out.println("¿Cuántos dígitos tiene un número?\nIntroduce un número:"
		 * ); int numero = Integer.parseInt(s.nextLine());
		 * 
		 * 
		 * do { division = numero/10; System.out.println(division/10); operaciones++; }
		 * while (division%10<0); {
		 * 
		 * }
		 * 
		 * System.out.println("El número tiene "+operaciones+" dígitos.");
		 */
	}

}
