package Tema5;

import java.util.Scanner;

public class ejercicio11 {
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		System.out.println("CUADRADO Y CUBO DE 5 NÚMEROS\nIntroduce un número entero.");
		int num = Integer.parseInt(s.nextLine());

		for (int i = num; num < i + 5; num++) {
			double cuadrado = Math.pow(num, 2);
			double cubo = Math.pow(num, 3);
			System.out.println(num + "\t" + cuadrado + "\t" + cubo);
		}

		s.close();

	}
}
