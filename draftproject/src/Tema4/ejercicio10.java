package Tema4;
import java.util.Scanner;

public class ejercicio10 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		String horoscopo = "";

		System.out.println("Tu hor�scopo\n�Qu� d�a naciste?");
		int day = Integer.parseInt(s.nextLine());

		System.out.println("�De qu� mes? Escr�be el n�mero:");
		int month = Integer.parseInt(s.nextLine());

		switch (month) {
		case 1:
			if (day < 20) {
				horoscopo = "Capricornio";
			} else {
				horoscopo = "Acuario";
			}
			break;
		case 2:
			if (day < 19) {
				horoscopo = "Acuario";
			} else {
				horoscopo = "Piscis";
			}
			break;
		case 3:
			if (day < 21) {
				horoscopo = "Aries";
			} else {
				horoscopo = "Piscis";
			}
			break;
		case 4:
			if (day < 20) {
				horoscopo = "Aries";
			} else {
				horoscopo = "Tauro";
			}
			break;
		case 5:
			if (day < 21) {
				horoscopo = "Tauro";
			} else {
				horoscopo = "G�minis";
			}
			break;
		case 6:
			if (day < 21) {
				horoscopo = "G�minis";
			} else {
				horoscopo = "Tauro";
			}
			break;
		case 7:
			if (day < 23) {
				horoscopo = "C�ncer";
			} else {
				horoscopo = "Leo";
			}
			break;
		case 8:
			if (day < 23) {
				horoscopo = "Leo";
			} else {
				horoscopo = "Virgo";
			}
			break;
		case 9:
			if (day < 23) {
				horoscopo = "Virgo";
			} else {
				horoscopo = "Libra";
			}
			break;
		case 10:
			if (day < 23) {
				horoscopo = "Libra";

			} else {
				horoscopo = "Escorpio";
			}
			break;
		case 11:
			if (day < 22) {
				horoscopo = "Escorpio";
			} else {
				horoscopo = "Sagitario";
			}
			break;
		case 12:
			if (day < 22) {
				horoscopo = "Sagitario";
			} else {
				horoscopo = "Capricornio";
			}
			break;
		
		}
	}

}
