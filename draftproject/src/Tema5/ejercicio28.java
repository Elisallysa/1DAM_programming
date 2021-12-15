package Tema5;

import java.util.Scanner;

public class ejercicio28 {
	public static void main(String[] args) {

		/*
		 * Ejercicio 28. Escribe un programa que calcule el factorial de un n�mero
		 * entero le�do por teclado.
		 */

		Scanner s = new Scanner(System.in);

		int producto = 1;

		System.out.println("CALCULADOR DE FACTORIAL:");

		try {
			System.out.println("Introducta un n�mero entero:");
			int numero = Integer.parseInt(s.nextLine());

			if (numero<1) {
				System.out.println("Por favor, introduce un n�mero entero mayor de 0");
			}else {
			
			for (int i = numero; i > 0; i--) {
				producto = producto * i;
			}

			System.out.println(numero + "! = " + producto);
			}
		} catch (Exception e) {
			System.out.println("Por favor, introduzca un n�mero entero mayor de 0.");
		}

		s.close();

	}
}
