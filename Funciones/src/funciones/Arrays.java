package funciones;

public class Arrays {

	/**
	 * 
	 * @param x
	 */
	public static void diagonal(int x[]) {

		int[][] matriz = { {}, {}, {}, {} };
		int[] diagonal = new int[matriz.length];

		for (int i = 0; i <= diagonal.length; i++) {
			diagonal[i] = matriz[i][i];
			System.out.print(diagonal + " ");
		}
	}
	/**
	 * 
	 * @param x
	 * @return
	 */
	public static boolean invertida (int x[]) {
		
		int[][] matriz = { {}, {}, {}, {} };
		int[] diagonalInv = new int[matriz.length];
		int j = matriz.length - 1;
		int [] x1 = {};
		
		for (int i = 0; i < diagonalInv.length; i++) {
			diagonalInv[i] = matriz[i][j--];
			
			if (diagonalInv[i] == matriz[]) {
				return true;
			}
		}
	}
	/**
	 * 
	 * @param a
	 * @return
	 */
	public static int[] reverse(int[] a) {
		int[] dadoLaVuelta = new int[a.length];
		
		for (int i = 0; i < dadoLaVuelta.length; i++) {
			
		}
	}
	
 /**
  * Devuelve en forma de array la columna del indice
  * @param m Matriz a extraer la columna
  * @param indice Posicion de la columna deseada
  * @return Array con los números de la columna
  */
	
	
	/*
	 * Multiplica dos matrices m1 y m2
	 * @param m1 matriz primera a multiplicar
	 * @param m2 matriz segunda a multiplicar
	 * @return Una matriz de m2.filas y m1.cols con la multiplicación de m1 y m2
	 * @throws Exception Si el número de filas de m2 no es igual al número de columnas de m1.
	 */
	public static int[][] multiplica(int[][] m1, int[][] m2) throws Exception {
		if (m2.length == m1[0].length) {
			int[][] r = new int [m2.length][m1[0].length];
			
			for (int i=0; i< r.length; i++) {
				for (int j = 0; j < r[i].length; j++) {
					for(int k = 0; k < m1[0].length; k++) {
						r[i][j] += m1[i][k] * m2[k][j];
			}
		}
	}return r;
 }else
		throw new Exception("El número de filas de m2 debe ser igual a las columnas de m1");
	}

}
