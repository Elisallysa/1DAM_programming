package Tema3;

import java.util.Scanner;

public class ejercicio9 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		System.out.println("Calculador del volumen de un cono\nIntroduzca el radio (cm):");
		double r = Double.parseDouble(s.nextLine());
		System.out.println("Introduzca la altura (cm):");
		double h = Double.parseDouble(s.nextLine());

		System.out.println("\nVolumen: " + (Math.PI * r * h) / 3 + " cm\u00B3");

	}
}
