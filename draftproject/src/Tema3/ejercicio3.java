package Tema3;

import java.util.Scanner;

public class ejercicio3 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		double euros = 0.006;

		System.out.println("Conversor de pesetas a euros.\nIntroduzca una cantidad en pesetas:");
		int ptas = Integer.parseInt(s.nextLine());

		System.out.println(ptas + " ptas. = " + ptas * euros + " €");

	}
}
