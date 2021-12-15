package funciones;

public class MainApp {

	public static void main(String[] args) {
		int[][] matriz = { { 1, 2, 3 }, { 4, 5, 6 } };
		int[][] rotada = MatrizUtils.rotarDerecha(matriz);

		MatrizUtils.imprimir(matriz);
		System.out.println();
		MatrizUtils.imprimir(rotada);

		System.out.println();

		int[] a = { 1, 2, 3, 4 };
		int[] reverse = MatrizUtils.reverse(a);
		MatrizUtils.imprimir(reverse);

		System.out.println("-----");

		int[][] m1 = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		int[][] m2 = { { 5, 4 }, { 3, 2 }, { 1, 0 } };
		
		try {
			MatrizUtils.imprimir(MatrizUtils.multiplica(m1, m2));
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
