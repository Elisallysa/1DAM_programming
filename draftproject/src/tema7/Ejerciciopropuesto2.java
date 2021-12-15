package tema7;

public class Ejerciciopropuesto2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//2. Dada una matriz cuadrada, extrae las dos diagonales de la matriz, guárdalas en 2 
		//dos arrays y muestralos por pantalla (3.5 ptos)
	
		int [][] matriz = {{1,2,3,4},{5,6,7,8},{9,0,1,2},{3,4,5,6}};
		int [] diagonal = new int[matriz.length];
		int nFilas = matriz.length;
		int ncols = matriz[0].length;

		
		for (int i=0; i<=diagonal.length; i++) {
			diagonal[i] = matriz[i][i];
			System.out.print(diagonal+" ");
		}
		System.out.println("");
	
		for (int i= 0; i<4; i++) {
			for (int j=3; j>=0; j--) {
				System.out.print(matriz[i][j]+" ");
				diagonal[]
			}
		}
		System.out.println();
		
		for (int k = matriz.length - 1; k>=0; k--) {
			for (int l = 0; l<matriz.length; l++) {
				if (k+l == matriz.length -1) {
					
				}
			}
		}
	}
	

}
