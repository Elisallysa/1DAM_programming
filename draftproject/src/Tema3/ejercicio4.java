package Tema3;

import java.util.Scanner;

public class ejercicio4 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		System.out.println("Introduzca el primer número:");
		double numero1 = Double.parseDouble(s.nextLine());
		System.out.println("Introduzca el segundo número:");
		double numero2 = Double.parseDouble(s.nextLine());

		System.out.println(numero1 + "+" + numero2 + "=" + (numero1 + numero2));
		System.out.println(numero1 + "-" + numero2 + "=" + (numero1 - numero2));
		System.out.println(numero1 + "x" + numero2 + "=" + (numero1 * numero2));
		System.out.println(numero1 + ":" + numero2 + "=" + (numero1 / numero2));

	}
}
