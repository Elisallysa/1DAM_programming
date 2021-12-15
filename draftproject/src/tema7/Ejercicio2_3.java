package tema7;

public class Ejercicio2_3 {

	public static void main(String[] args) {
		/*
		 * Modifica el programa anterior de tal forma que los números que se introducen
en el array se generen de forma aleatoria (valores entre 100 y 999).
		 */
		
		int[][] m = new int[4][5];
		
		for (int k = 0; k < m.length; k++) {
			for (int l = 0; l < m[k].length; l++) {
				m[k][l] = (int) (Math.random()*1000);
			}
		}

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
