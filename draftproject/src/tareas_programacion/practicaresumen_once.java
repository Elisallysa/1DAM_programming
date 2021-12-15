package tareas_programacion;

import java.util.Scanner;

public class practicaresumen_once {

	/*
	 * Crear un programa en Java que permita introducir un número de 5 dígitos y
	 * compruebe (simulando la lotería de la ONCE) si ese número es el número
	 * premiado o no. El número premiado se calculará como un número aleatorio entre
	 * 00000 y 99999 en el propio programa. Adicionalmente, deberá decir cuánto
	 * dinero te ha tocado en función de las coincidencias que haya entre tu número
	 * y el número premiado.
	 */

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		int aleatorio = (int) (Math.random() * 100000);
		String numPremiado = String.valueOf(aleatorio);

		// System.out.println("aleatorio:" + aleatorio);

		System.out.println("Introduce el número de tu décimo:");
		String decimo = s.nextLine();

		if (numPremiado == decimo) {
			System.out.println("QUÉ MÁQUINA IO HAS ASERTAO ERMANO");
		} else if (numPremiado.charAt(1) == decimo.charAt(1) && numPremiado.charAt(2) == decimo.charAt(2)
				&& numPremiado.charAt(3) == decimo.charAt(3) && numPremiado.charAt(4) == decimo.charAt(4)) {
			System.out.println("¡CASI PERO NO! REINTEGRO DE 200 €.");
		} else if (numPremiado.charAt(2) == decimo.charAt(2) && numPremiado.charAt(3) == decimo.charAt(3)
				&& numPremiado.charAt(4) == decimo.charAt(4)) {
			System.out.println("¡BIBA! REINTEGRO DE 20 €.");
		} else if (numPremiado.charAt(3) == decimo.charAt(3) && numPremiado.charAt(4) == decimo.charAt(4)) {
			System.out.println("¡PA LOS PITIS! REINTEGRO DE 6 €.");
		} else if (numPremiado.charAt(4) == decimo.charAt(4) || numPremiado.charAt(0) == decimo.charAt(0)) {
			System.out.println("¡TE FORRAS! REINTEGRO DE 1,5 €.");
		} else {
			System.out.println("Un carajo es lo que has ganado.");
		}
		
		

		// if (numPremiado.charAt(4))

	}

}
