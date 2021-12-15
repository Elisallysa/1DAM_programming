package examen_programacion;

import examen_programacion.MatrizUtils;

public class Examen_8nov_solucion {

	public static void main(String[] args) {

		int[] array = { 7, 6, 51, 0 };
		System.out.println(isSorted(array));

		int[][] m = { { 1, 2, 3 }, { 2, 1, 4 }, { 3, 4, 1 } };
		System.out.println(isSimetricaPerfecta(m));
		MatrizUtils.imprimir(relleno(m));
	}

	public static boolean isSorted(int[] array) {
		boolean ascendente = true, descendente = true;
		// Paralante
		for (int i = 1; i < array.length - 1; i++) {
			if (array[i] > array[i - 1]) {
				ascendente = false;
			}
		}
		// Patrás
		for (int i = array.length - 1; i >= 1; i--) {
			if (array[i] < array[i - 1]) {
				descendente = false;
			}
		}
		return ascendente || descendente;

	}

	public static boolean isSimetricaPerfecta(int[][] matriz) {
		// Debe ser cuadrada
		if (matriz.length != matriz[0].length)
			return false;

		// Su traspuesta es igual
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				if (matriz[i][j] != matriz[j][i])
					return false; // Si hay alguno distinto se devuelve false
			}
		}

		// Todos los elementos de la diagonal coinciden
		try {
			int[] diagonal = MatrizUtils.diagonal(matriz, false);
			for (int i = 0; i < diagonal.length - 1; i++) {
				if (diagonal[i] != diagonal[i + 1]) // Si hay alguno distinto se devuelve false
					return false;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return true;
	}

	public static int[][] relleno(int[][] matriz) {
		// Se crea la matriz de relleno vacía.
		int[][] relleno = new int[matriz.length - 2][matriz[0].length - 2];

		// Se saca el relleno de la matriz empezando en 1 y terminando en length-1
		for (int i = 1; i < matriz.length - 1; i++) {
			for (int j = 1; j < matriz[i].length - 1; j++) {
				relleno[i - 1][j - 1] = matriz[i][j];
			}
		}
		return relleno;
	}
}
