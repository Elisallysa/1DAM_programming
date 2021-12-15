package Tema3;

import java.util.Scanner;

public class ejercicio6 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		System.out.println("¡rea de un tri·ngulo\nIntroduzca la longitud de la base:");
		double b = Double.parseDouble(s.nextLine());
		System.out.println("Introduzca la altura del tri·ngulo:");
		double h = Double.parseDouble(s.nextLine());

		System.out.println("\n¡rea: " + b * h / 2 + " cm\u00B2");

	}
}
