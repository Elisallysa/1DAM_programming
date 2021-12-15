package Tema3;

import java.util.Scanner;

public class ejercicio7 {
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		System.out.println("Introduzca la cuantía de la base imponible:");
		double bi = Double.parseDouble(s.nextLine());
		System.out.println("Total: " + (bi * 1.21) + " €");

	}
}
