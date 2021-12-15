package Tema3;

import java.util.Scanner;

public class ejercicio2 {
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		double ptas = 166.386;

		System.out.println("Conversor de euros a pesetas:");
		System.out.println("Introduzca la cantidad en euros:");
		int euros = Integer.parseInt(s.nextLine());

		System.out.println("\n" + euros + " € = " + euros * ptas + " ptas.");

	}
}
