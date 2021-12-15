package Tema5;

import java.util.Scanner;

public class ejercicio30 {

	/*
	 * Realiza una programa que calcule las horas transcurridas entre dos horas de
	 * dos d�as de la semana. No se tendr�n en cuenta los minutos ni los segundos.
	 * El d�a de la semana se puede pedir como un n�mero (del 1 al 7) o como una
	 * cadena (de �lunes� a �domingo�). Se debe comprobar que el usuario introduce
	 * los datos correctamente y que el segundo d�a es posterior al primero.
	 */

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int horas = 0;
		int horas2 = 0;

		
		do {
			System.out.println("Primer d�a de la semana");
			String diaSemana = s.nextLine();

			switch (diaSemana) {
			case "lunes":
			case "1":
				horas = 24;
				break;
			case "martes":
			case "2":
				horas = 24 * 2;
				break;
			case "mi�rcoles":
			case "3":
				horas = 24 * 3;
				break;
			case "jueves":
			case "4":
				horas = 24 * 4;
				break;
			case "viernes":
			case "5":
				horas = 24 * 5;
				break;
			case "s�bado":
			case "6":
				horas = 24 * 6;
				break;
			case "domingo":
			case "7":
				horas = 24 * 7;
				break;
			}
		} while (horas>0);

		do {
			System.out.println("Segundo d�a");
			String diaSemana2 = s.nextLine();

			switch (diaSemana2) {
			case "lunes":
			case "1":
				horas2 = 24;
				break;
			case "martes":
			case "2":
				horas2 = 24 * 2;
				break;
			case "mi�rcoles":
			case "3":
				horas2 = 24 * 3;
				break;
			case "jueves":
			case "4":
				horas2 = 24 * 4;
				break;
			case "viernes":
			case "5":
				horas2 = 24 * 5;
				break;
			case "s�bado":
			case "6":
				horas2 = 24 * 6;
				break;
			case "domingo":
			case "7":
				horas2 = 24 * 7;
				break;
			}
		} while (horas2 < horas);

		System.out.println("�Qu� hora es el primer d�a?");
		int hora1 = Integer.parseInt(s.nextLine());

		System.out.println("�Qu� hora es el segundo d�a?");
		int hora2 = Integer.parseInt(s.nextLine());

		System.out.println("Entre el primer y segundo d�a hay: " + ((horas2 - horas - hora1 + hora2)) + " horas.");

		s.close();

	}

}
