package Tema3;

import java.util.Scanner;

public class ejercicio11 {
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		System.out.println("Conversor de KB a MB\nIntroduzca la cantidad de KB:");
		double kb = Double.parseDouble(s.nextLine());
		System.out.println(kb + " KB =" + (double) (kb / 1024) + " MB");

	}
}
