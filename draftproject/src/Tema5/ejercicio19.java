package Tema5;

import java.util.Scanner;

public class ejercicio19 {
	/*
	 * Realiza un programa que pinte una pirámide por pantalla. La altura se debe
	 * pedir por teclado. El carácter con el que se pinta la pirámide también se
	 * debe pedir por teclado.
	 */
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
/*
		int altura = 0;

		System.out.println("PIRÁMIDE DE CARACTERES. \nIntroduce un carácter:");
		String caracter = s.nextLine();

		System.out.println("Y la altura de la pirámide:");
		altura = Integer.parseInt(s.nextLine());

		// int i = 1;

	 for (i = 1; i <= altura; i ++) {
			System.out.println(caracter);
	*/
		
		
			System.out.print("Por favor, introduzca la altura de la pirámide: ");
		    int alturaIntroducida = Integer.parseInt(s.nextLine());

		    System.out.print("Introduzca el carácter de relleno: ");
		    String relleno = s.nextLine();
		    
		    int planta = 1;
		    int longitudDeLinea = 1;
		    int espacios = alturaIntroducida-1;
		    
		    while (planta <= alturaIntroducida) {
		      
		      // inserta espacios
		      for (int i = 1; i <= espacios; i++) {
		        System.out.print(" ");
		      }

		      // pinta la línea
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
