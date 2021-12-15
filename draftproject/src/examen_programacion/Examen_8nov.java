package examen_programacion;

import java.util.Scanner;

public class Examen_8nov {

	public static void main(String[] args) {

		/*
		 * Se pide realizar un programa que sea capaz de convertir un n�mero natural a
		 * n�mero romano. Si no recuerdas los s�mbolos, estos son los que vas a
		 * necesitar:
		 * 
		 * I = 1 V = 5 X = 10 L = 50
		 * 
		 * Para simplificar el ejercicio pondremos que el programa podr� convertir del 1
		 * (I) al 89 (LXXXIX). En caso de que el usuario introduzca cualquier otro valor
		 * se le invitar� amablemente a introducir otro n�mero v�lido. El programa
		 * terminar� cuando el usuario introduzca un 0.
		 */

		Scanner s = new Scanner(System.in);

		System.out.println("CONVERSOR DE N�MEROS �RABES A ROMANOS");

		int num = 0;
		int unidad = 0;

		String uno = "I";
		String cinco = "V";
		String diez = "X";
		String cincuenta = "L";
		
		try {
		do {
			System.out.println("Por favor, introduce un n�mero entero del 1 al 89. Si deseas terminar el programa, introduce 0:");
			num = Integer.parseInt(s.next());

			if (num<0 || num>89) {
				System.out.println("N�MEROS ENTEROS ENTRE 1 Y 89, JODER.");
			}
			
			// Empiezo con los n�meros que tienen L al principio.
			if (num >= 50 && num <= 89) {
				System.out.print(cincuenta);
				// Los mayores-igual de 60 tienen que a�adir X.
				if (num >= 60) {
					for (int i = num / 10 - 5; i >= 1; i--) {
						System.out.print(diez);
					}
				}
			}

			// Entre 10 y 49 empiezan por X.
			if (num >= 10 && num <= 49) {
				System.out.print(diez);

				// Entre 20 y 40 tienen m�s de una X.
				if (num >= 20 && num < 40) {
					for (int i = num / 10; i > 1; i--) {
						System.out.print(diez);
					}
				}
				// Entre 40 y 49 hay que a�adir una L.
				if (num >= 40 && num <= 49) {
					System.out.print(cincuenta);
				}
			}

			// Para todos los n�meros hay que a�adir una unidad.
			if (num > 0 && num <= 89) {

				unidad = num % 10;

				// Todos estos ifs a�aden la unidad si es distinta a 0.
				if (unidad > 0 && unidad <= 3) {
					for (int i = unidad; i > 0; i--) {
						System.out.print(uno);
					}
				}
				if (unidad == 4) {
					System.out.println(uno + cinco);
				}
				if (unidad == 5) {
					System.out.println(cinco);
				}
				if (unidad >= 6 && unidad <= 8) {
					System.out.print(cinco);
					for (int i = unidad - 5; i >= 1; i--) {
						System.out.print(uno);
					}
				}
				if (unidad == 9) {
					System.out.print(uno + diez);
				}

			}

			System.out.println("");

		} while (num != 0);

		}catch (Exception e) {
			System.out.println("No metas decimales, co�o.");
		}
		s.close();

		System.out.println("Gracias por usar nuestro conversor.");

	}

}
