package Tema5;

import java.util.Scanner;

public class Ejercicio26 {

	public static void main(String[] args) {

// Realiza un programa que pida primero un número y a continuación un dígito.
		// El programa nos debe dar la posición (o posiciones) contando de izquierda a
		// derecha que ocupa ese dígito en el número introducido.

		Scanner s = new Scanner(System.in);

		System.out.println("Introduzca un número:");
		int numeroIntroducido = Integer.parseInt(s.nextLine());

		System.out.println("Introduzca un dígito del número anterior:");
		String digito = (s.nextLine());

		String numero = String.valueOf(numeroIntroducido);

		for (int i = 0; i < numero.length(); i++) {

			String posicion = String.valueOf(numero.charAt(i));

			if (posicion.equals(digito)) {
				System.out.println("El dígito se encuentra en la posición " + (i + 1));
			}
		}
		s.close();

	}

}
