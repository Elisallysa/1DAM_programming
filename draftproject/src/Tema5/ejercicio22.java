package Tema5;

public class ejercicio22 {

	/*
	 * Muestra por pantalla todos los números primos entre 2 y 100, ambos incluidos.
	 */
	public static void main(String[] args) {

		System.out.println("Todos los números primos entre 2 y 100:");

		for (int i = 2; i <= 100; i++) {
			if (!(i % 2 == 0 || i % 3 == 0 || i % 5 == 0) || (i == 2))
				System.out.println(i);
		}

	}

}
