package Tema4;
import java.util.Scanner;

public class ejercicio10 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		String horoscopo = "";

		System.out.println("Tu horóscopo\n¿Qué día naciste?");
		int day = Integer.parseInt(s.nextLine());

		System.out.println("¿De qué mes? Escríbe el número:");
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
				horoscopo = "Géminis";
			}
			break;
		case 6:
			if (day < 21) {
				horoscopo = "Géminis";
			} else {
				horoscopo = "Tauro";
			}
			break;
		case 7:
			if (day < 23) {
				horoscopo = "Cáncer";
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
