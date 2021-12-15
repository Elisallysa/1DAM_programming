package tareas_programacion;

import java.util.Scanner;

public class practicaresumen_once {

	/*
	 * Crear un programa en Java que permita introducir un n�mero de 5 d�gitos y
	 * compruebe (simulando la loter�a de la ONCE) si ese n�mero es el n�mero
	 * premiado o no. El n�mero premiado se calcular� como un n�mero aleatorio entre
	 * 00000 y 99999 en el propio programa. Adicionalmente, deber� decir cu�nto
	 * dinero te ha tocado en funci�n de las coincidencias que haya entre tu n�mero
	 * y el n�mero premiado.
	 */

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		int aleatorio = (int) (Math.random() * 100000);
		String numPremiado = String.valueOf(aleatorio);

		// System.out.println("aleatorio:" + aleatorio);

		System.out.println("Introduce el n�mero de tu d�cimo:");
		String decimo = s.nextLine();

		if (numPremiado == decimo) {
			System.out.println("QU� M�QUINA IO HAS ASERTAO ERMANO");
		} else if (numPremiado.charAt(1) == decimo.charAt(1) && numPremiado.charAt(2) == decimo.charAt(2)
				&& numPremiado.charAt(3) == decimo.charAt(3) && numPremiado.charAt(4) == decimo.charAt(4)) {
			System.out.println("�CASI PERO NO! REINTEGRO DE 200 �.");
		} else if (numPremiado.charAt(2) == decimo.charAt(2) && numPremiado.charAt(3) == decimo.charAt(3)
				&& numPremiado.charAt(4) == decimo.charAt(4)) {
			System.out.println("�BIBA! REINTEGRO DE 20 �.");
		} else if (numPremiado.charAt(3) == decimo.charAt(3) && numPremiado.charAt(4) == decimo.charAt(4)) {
			System.out.println("�PA LOS PITIS! REINTEGRO DE 6 �.");
		} else if (numPremiado.charAt(4) == decimo.charAt(4) || numPremiado.charAt(0) == decimo.charAt(0)) {
			System.out.println("�TE FORRAS! REINTEGRO DE 1,5 �.");
		} else {
			System.out.println("Un carajo es lo que has ganado.");
		}
		
		

		// if (numPremiado.charAt(4))

	}

}
