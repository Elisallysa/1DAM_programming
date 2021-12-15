package Tema3;

import java.util.Scanner;

public class ejercicio1 {

	public static void main(String[] args) {
		try (Scanner s = new Scanner(System.in)) {
			System.out.println("Número 1: ");
			int numero1 = Integer.parseInt(s.nextLine());
			System.out.println("Número 2: ");
			int numero2 = Integer.parseInt(s.nextLine());

			System.out.println("\n" + numero1 + "x" + numero2 + "=" + numero1 * numero2);
		} catch (NumberFormatException e) {
			// Sale una advertencia en los ejercicios con scanner.
			// Dice que el scanner no se ha cerrado y automáticamente inserta un try -
			// catch.
			e.printStackTrace();
		}

	}

}
