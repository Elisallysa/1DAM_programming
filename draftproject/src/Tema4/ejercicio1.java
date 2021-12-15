package Tema4;

import java.util.Scanner;

public class ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);

		System.out.println("¿Qué asignatura tenemos a primera hora?\nIntroduce el día de la semana:");
		String day = s.nextLine();

		if (day.equals("Lunes")) {
			System.out.println("BBDD");
		}
		if (day.equals("Martes")) {
			System.out.println("S. Inf.");
		}
		if (day.equals("Miércoles")) {
			System.out.println("FOL");
		}

		if (day.equals("Jueves")) {
			System.out.println("BBDD");
		}
		if (day.equals("Viernes")) {
			System.out.println("Programación");
		}
	}
}
