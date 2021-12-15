package Tema4;

import java.util.Scanner;

public class ejercicio2 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		System.out.println("¿Qué hora es?");
		int hora = Integer.parseInt(s.nextLine());

		if ((hora >= 6) && (hora <= 12)) {
			System.out.println("¡Buenos días!");
		}
		if ((hora >= 13) && (hora <= 20)) {
			System.out.println("¡Buenas tardes!");
		}
		if ((hora >= 21) && (hora <= 24)) {
			System.out.println("¡Buenas noches!");
		}
		if ((hora >= 00) && (hora <= 5)) {
			System.out.println("¡Buenas noches!");
		}
	}

}
