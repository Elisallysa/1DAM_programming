package tema7;

public class Ejercicio2_2 {

	public static void main(String[] args) {
	/*
	 * Escribe un programa que pida 20 números enteros. Estos números se deben
introducir en un array de 4 filas por 5 columnas. El programa mostrará las
sumas parciales de filas y columnas igual que si de una hoja de cálculo se
tratara. La suma total debe aparecer en la esquina inferior derecha.
	 */

		int[][] m = { { 1, 2, 3, 4, 5 }, { 1, 2, 3, 4, 5 }, { 1, 2, 3, 4, 5 }, { 1, 2, 3, 4, 5 } };

		int[] sumaFilas = new int[4];
		int[] sumaColumnas = new int[5];

		//Suma las filas
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				sumaFilas[i] += m[i][j]; 
			}
		}
		imprimirArray(sumaFilas);
		//Suma las columnas
		for (int col = 0; col < sumaColumnas.length; col++) {
			for (int fil = 0; fil < sumaFilas.length; fil++) {
				sumaColumnas[col] += m[fil][col];
			}
		}
		imprimirArray(sumaColumnas);
	}
	
	public static void imprimirArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
		
	}

}
