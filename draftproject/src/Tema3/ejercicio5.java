package Tema3;

import java.util.Scanner;

public class ejercicio5 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		System.out.println("�rea de un rect�ngulo\nIntroduzca la longitud del lado a:");
		double a = Double.parseDouble(s.nextLine());
		System.out.println("Introduzca la longitud del lado b:");
		double b = Double.parseDouble(s.nextLine());

		System.out.println("\nEl �rea del rect�ngulo es:\n" + a * b + " cm\u00B2");

	}
}
