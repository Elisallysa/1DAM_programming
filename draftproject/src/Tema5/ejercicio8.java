package Tema5;

import java.util.Scanner;

public class ejercicio8 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		System.out.println("TABLAS DE MULTIPLICAR\nIntroduce el número de la tabla que quieres visualizar:");
		int i = Integer.parseInt(s.nextLine());

		for (int factor = 0; factor < 11; factor++) {
			System.out.println(i + "x" + factor + "=" + i * factor);
		}
		s.close();

	}

}
