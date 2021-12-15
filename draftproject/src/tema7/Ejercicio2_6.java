package tema7;

public class Ejercicio2_6 {

	public static void main(String[] args) {

		/*
		 * Modifica el programa anterior de tal forma que no se repita ningún número en
		 * el array.
		 */
		
		// NO FUNCIONA, NO ENTIENDO EL EJERCICIO RESUELTO EN GITHUB

		int[][] m = new int[6][10];

		int fila;
		int columna;

		int j = 0;
		boolean repetido;

		for (fila = 0; fila < m.length; fila++) {
			for (columna = 0; columna < m[fila].length; columna++) {

				do {
					m[fila][columna] = (int) (Math.random() * 1001);

					repetido = false;
					for (int i = 0; i < 10 * fila + columna; i++) {
						if (m[fila][columna] == m[i / 10][i % 10]) {
							repetido = true;
						}

					}
				} while (repetido);

				if (j != 9) {
					System.out.print(m[fila][columna] + " ");
				}
				if (j == 9) {
					System.out.println(m[fila][columna]);
				}

			}

		}
		System.out.println("");

		int mayor = 0;
		int menor = m[0][0];
		int M1 = 0;
		int M2 = 0;
		int m1 = 0;
		int m2 = 0;

		for (fila = 0; fila < m.length; fila++) {
			for (columna = 0; j < m[fila].length; columna++) {
				if (m[fila][columna] > mayor) {
					mayor = m[fila][columna];
					M1 = fila;
					M2 = columna;
				}
				if (m[fila][columna] < menor) {
					menor = m[fila][columna];
					m1 = fila;
					m2 = columna;
				}

			}
		}

		System.out.println("El mayor número es el: " + m[M1][M2]);
		System.out.println("Se encuentra en la posición [" + M1 + "][" + M2 + "]");
		System.out.println("El menor número es el: " + m[m1][m2]);
		System.out.println("Se encuentra en la posición [" + m1 + "][" + m2 + "]");

	}
}
