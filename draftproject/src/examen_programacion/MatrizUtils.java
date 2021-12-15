package examen_programacion;

public class MatrizUtils {

	/**
	 * Obtiene la diagonal de una matriz cuadrada.
	 * 
	 * @param m Matriz a la que se extrae la diagonal
	 * @return Array con la diagonal de m
	 * @throws Exception Si la matriz no es cuadrada lanza excepción.
	 */
	private static int[] diagonal(int[][] m) throws Exception {
		if (m.length == m[0].length) {
			int[] diagonal = new int[m.length];

			for (int i = 0; i < m.length; i++) {
				diagonal[i] = m[i][i];
			}

			return diagonal;
		} else {
			throw new Exception("La matriz no es cuadrada.");
		}
	}

	/**
	 * Obtiene la diagonal invertida de una matriz cuadrada.
	 * 
	 * @param m Matriz a la que se extrae la diagonal invertida
	 * @return Array con la diagonal invertida de m
	 * @throws Exception Si la matriz no es cuadrada lanza excepción.
	 */
	private static int[] diagonalInvertida(int[][] m) throws Exception {
		if (m.length == m[0].length) {
			int[] diagonalInv = new int[m.length];
			int j = m.length - 1;

			for (int i = 0; i < diagonalInv.length; i++) {
				diagonalInv[i] = m[i][j--];
			}

			return diagonalInv;
		} else {
			throw new Exception("La matriz no es cuadrada.");
		}
	}

	/**
	 * Devuelve la diagonal de una matriz cuadrada, si invertida es true, devuelve
	 * la diagonal invertida.
	 * 
	 * @param m         Matriz a extraer la diagonal
	 * @param invertida Si es true, devuelve la diagonal invertida, si es false la
	 *                  diagonal principal
	 * @return Array con la diagonal seleccionada.
	 * @throws Exception Si la matriz no es cuadrada peta.
	 */
	public static int[] diagonal(int[][] m, boolean invertida) throws Exception {
		if (m.length == m[0].length) { // Si es cuadrada
			if (invertida) {
				return diagonalInvertida(m);
			} else {
				return diagonal(m);
			}
		} else {
			throw new Exception("La matriz no es cuadrada.");
		}
	}

	/**
	 * Imprime un array por pantalla E.g.: [1,5,9]
	 * 
	 * @param a Array a ser imprimido.
	 */
	public static void imprimir(int[] a) {
		System.out.print("[ ");
		for (int i = 0; i < a.length; i++) {
			if (i < a.length - 1) // Pon comas mientras no seas el último elemento del array.
				System.out.print(a[i] + ",");
			else
				System.out.print(a[i]);
		}
		System.out.println(" ]");
	}

	/**
	 * Imprime una matriz por pantalla
	 * 
	 * @param m Matriz a imprime
	 */
	public static void imprimir(int[][] m) {
		for (int i = 0; i < m.length; i++) {
			imprimir(m[i]);
		}
	}

	/**
	 * Rota todos los elems de la matriz a la derecha
	 * @param m Matriz a rotar
	 * @return Matriz rotada a la derecha (clockwise)
	 */
	public static int[][] rotarDerecha(int[][] m) {
		int filas = m.length, cols = m[0].length;
		int[][] rotada = new int[cols][filas];

		// FORMA ALGORÍTMICA
//		for (int i = 0; i < rotada.length; i++) {
//			for (int j = 0; j < rotada[i].length; j++) {
//				rotada[i][j] = m[m.length - 1 - j][i];
//			}
//		}
		
		for (int i = 0; i < rotada.length; i++) {
			rotada[i] = reverse(getColumna(m, i));
		}
		
		return rotada;
	}
	
	/**
	 * Da la vuelta a un array
	 * @param a Array a dar la vuelta
	 * @return Nuevo array dado la vuelta.
	 */
	public static int[] reverse(int[] a) {
		int[] dadoLaVuelta = new int[a.length];
		
		for (int i = 0; i < dadoLaVuelta.length; i++) {
			dadoLaVuelta[i] = a[a.length - 1 - i];
		}
		
		return dadoLaVuelta;		
	}
	
	/**
	 * Devuelve en forma de array la columna del indice
	 * @param m Matriz a extraer la columna
	 * @param indice Posición de la columna deseada
	 * @return Array con los números de la columna.
	 */
	public static int[] getColumna(int[][] m, int indice) {
		int[] columna = new int[m.length];
		
		for (int i = 0; i < columna.length; i++) {
			columna[i] = m[i][indice];
		}
		
		return columna;
	}
	
	/**
	 * Devuelve en forma de array la fila del indice
	 * @param m Matriz a extraer la fila
	 * @param indice Posición de la fila deseada
	 * @return Array con los números de la fila.
	 */
	public static int[] getFila(int[][] m, int indice) {
		int[] fila = new int[m.length];
		
		for (int i = 0; i < fila.length; i++) {
			fila[i] = m[indice][i];
		}
		
		return fila;
		
	}
	
	/**
	 * Multiplica dos matrices m1 y m2
	 * @param m1 matriz primera a multiplicar
	 * @param m2 matriz segunda a multiplicar
	 * @return Una matriz de m2.filas y m1.cols con la multiplicación de m1 y m2.
	 * @throws Exception Si el número de filas de m2 no es igual al número de columnas de m1.
	 */
	public static int[][] multiplica(int[][] m1, int[][] m2) throws Exception{
		if(m2.length == m1[0].length) {
			int[][] r = new int[m1.length][m2[0].length];
			
			for (int i = 0; i < r.length; i++) {
				for (int j = 0; j < r[i].length; j++) {
					for(int k = 0; k < m1[0].length; k++) {
						r[i][j] += m1[i][k] * m2[k][j];
					}
				}
			}
			
			return r;
		} else
			throw new Exception("El número de filas de m2 debe ser igual a las columnas de m1");
	}

}
