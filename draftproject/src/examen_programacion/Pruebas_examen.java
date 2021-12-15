package examen_programacion;

public class Pruebas_examen {

	public static void main(String[] args) {

	}

	/*
	 * #public static int[] diagonal(int[][] m); -> Para una matriz cuadrada,
	 * devolverá su diagonal principal en forma de array, es decir, la diagonal que
	 * va desde la esquina superior izquierda hasta la inferior derecha. Ojo con la
	 * comprobación de errores, informar al usuario siempre.
	 */

	/**
	 * Devuelve un array con la diagonal de la matriz.
	 * 
	 * @param m - Matriz cuadrada
	 * @return nuevam - Array con los valores de la diagonal de la matriz cuadrada.
	 */
	public static int[] diagonal(int[][] m) {

		if (m.length == m[0].length) {
			int[] nuevam = new int[m.length];

			for (int i = 0; i < m.length; i++) {

				nuevam[i] = m[i][i];

			}
			return nuevam;

		} else {
			System.out.println("La matriz no es cuadrada.");
			return null;

		}

	}

	/**
	 * Devuelve la diagonal o diagonal invertida según se indique en los parámetros.
	 * 
	 * @param m         -- Una matriz cuadrada. Si no es cuadrada, devolverá un
	 *                  valor nulo.
	 * @param invertida -- invertida true = devuelve diagonal invertida, invertida
	 *                  false = devuelve diagonal.
	 * @return devuelve array con los valores de la diagonal o diagonal invertida
	 *         según se indique.
	 */
	public static int[] diagonal(int[][] m, boolean invertida) throws Exception {

		if (m.length == m[0].length) {
			if (invertida) {
				
				int[] nuevainv = new int[m.length];
				int j = m.length - 1;
				
				for (int i = 0; i < m.length; i++) {
					
						nuevainv[i] = m[i][j--];
					

				}
				return nuevainv;
			} else {
				return diagonal(m);
			}

		} else {
			throw new Exception("La matriz no es cuadrada.");
		}

	}
	
	
	public static int[] extraerEstadisticas(int[][] m) {
		
		int min;
		int max;
		int media;
		int desviacionTipica;
		int varianza;
		
		
		for (int i=0;i<m.length;i++) {
			for (int j=0;j<m[0].length;j++) {
			if (m[i][j] < m[i+1][j+1]) {
				
			}
			}
			
		}
		
	}
	
	

}
