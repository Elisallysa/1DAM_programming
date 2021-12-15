package Tema5;

import java.util.Scanner;

public class Ejercicio26 {

	public static void main(String[] args) {

// Realiza un programa que pida primero un n�mero y a continuaci�n un d�gito.
		// El programa nos debe dar la posici�n (o posiciones) contando de izquierda a
		// derecha que ocupa ese d�gito en el n�mero introducido.

		Scanner s = new Scanner(System.in);

		System.out.println("Introduzca un n�mero:");
		int numeroIntroducido = Integer.parseInt(s.nextLine());

		System.out.println("Introduzca un d�gito del n�mero anterior:");
		String digito = (s.nextLine());

		String numero = String.valueOf(numeroIntroducido);

		for (int i = 0; i < numero.length(); i++) {

			String posicion = String.valueOf(numero.charAt(i));

			if (posicion.equals(digito)) {
				System.out.println("El d�gito se encuentra en la posici�n " + (i + 1));
			}
		}
		s.close();

	}

}
