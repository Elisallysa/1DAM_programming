package Tema5;

import java.util.Scanner;

public class ejercicio10 {
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		int numero = 0;
		int suma = 0;

		System.out.println(
				"Introduce todos los n�mero que quieres sumar pulsando INTRO. Introduce un n�mero negativo para terminar.");

		while (numero >= 0) {
			numero = Integer.parseInt(s.nextLine());
			suma += numero;
		}

		System.out.println("El resultado de la suma de los n�meros introducidos es: " + (suma - numero));

		s.close();

	}
}
