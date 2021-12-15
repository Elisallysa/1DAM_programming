package tema7;

public class Ejerciciopropuesto1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//1. Dada una matriz cualquiera, calcula el número de ocurrencias 
		//que hay de un determinado valor. (2 ptos)
		
		int[][] m = {{1,2,3,4},{2,0,2,1}};
		int valorBuscado = 9;
		int nFilas = m.length;
		int nCols = m[0].length;
		int contador = 0;
		
		for (int i = 0; i< nFilas; i++) {
			for (int j= 0; j<nCols; j++) {
				if (m[i][j] == valorBuscado) {
					contador++;
				}
			}
		}
		
		System.out.println(contador);
		
	}

}
