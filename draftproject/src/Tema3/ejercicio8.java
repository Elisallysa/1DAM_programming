package Tema3;

import java.util.Scanner;

public class ejercicio8 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		System.out.println("Calculador de salario semanal\nIntroduzca las horas semanales trabajadas:");
		double h = Double.parseDouble(s.nextLine());

		if (h<=40) {
			System.out.println("Salario semanal: " + (h * 12) + " €");
		}
		else {
			System.out.println("Salario semanal: " + (480+((h-40)*16)) + " €");
		}
		
	}
}
