package Tema5;

import java.util.Scanner;

public class ejercicio19 {
	/*
	 * Realiza un programa que pinte una pir�mide por pantalla. La altura se debe
	 * pedir por teclado. El car�cter con el que se pinta la pir�mide tambi�n se
	 * debe pedir por teclado.
	 */
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
/*
		int altura = 0;

		System.out.println("PIR�MIDE DE CARACTERES. \nIntroduce un car�cter:");
		String caracter = s.nextLine();

		System.out.println("Y la altura de la pir�mide:");
		altura = Integer.parseInt(s.nextLine());

		// int i = 1;

	 for (i = 1; i <= altura; i ++) {
			System.out.println(caracter);
	*/
		
		
			System.out.print("Por favor, introduzca la altura de la pir�mide: ");
		    int alturaIntroducida = Integer.parseInt(s.nextLine());

		    System.out.print("Introduzca el car�cter de relleno: ");
		    String relleno = s.nextLine();
		    
		    int planta = 1;
		    int longitudDeLinea = 1;
		    int espacios = alturaIntroducida-1;
		    
		    while (planta <= alturaIntroducida) {
		      
		      // inserta espacios
		      for (int i = 1; i <= espacios; i++) {
		        System.out.print(" ");
		      }

		      // pinta la l�nea
		      for (int i = 1; i <= longitudDeLinea; i++) {
		        System.out.print(relleno);
		      }

		      System.out.println();

		      planta++;
		      espacios--;
		      longitudDeLinea += 2;
			
			
		}

	}

}
