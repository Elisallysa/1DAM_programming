package Tema4;

import java.util.Scanner;

public class ejercicio17 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		System.out.println("�ltima cifra de un n�mero. Introduzca un n�mero con m�ximo 5 cifras:");
		int numero = Integer.parseInt(s.nextLine());

		if (numero < 10) {
			System.out.println("La �ltima cifra es: " + numero);

		}
		if (numero >= 10 && numero < 100) {
			System.out.println("La �ltima cifra es " + (numero - (numero / 10) * 10));

		}
		if (numero >= 100 && numero < 1000) {
			int dec = numero - ((numero / 100) * 100);
			int uni = dec - ((dec / 10) * 10);
			System.out.println("La �ltima cifra es " + uni);
		}
		if (numero >= 1000 && numero < 10000) {
			int cen = numero - ((numero /1000)*1000);
			int dec = cen - (cen / 100) * 100;
			int uni = dec - ((dec / 10) * 10);
			System.out.println("La �ltima cifra es " + uni);
		}
		if (numero >=10000 && numero < 100000) {
			int mil = numero-((numero/10000)*10000);
			int cen = mil - ((mil /1000)*1000);
			int dec = cen - (cen / 100) * 100;
			int uni = dec - ((dec / 10) * 10);
			System.out.println("La �ltima cifra es " + uni);
		}
		

	}
}
