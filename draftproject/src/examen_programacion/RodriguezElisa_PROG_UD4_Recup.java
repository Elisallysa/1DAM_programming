package examen_programacion;

public class RodriguezElisa_PROG_UD4_Recup {

	public static void main(String[] args) throws Exception {

		// 1. PRUEBA FUNCIÓN isSorted

		String frase[] = { "Tus", "tres", "perros", "vomitan", "compulsivamente" };
		String frase2[] = { "He", "tardao", "un", "taco", "en", "hacer", "este", "puto", "ejemplo" };
		String frase3[] = { "Yo", "pruebo", "definitivamente", "JA" };

		System.out.println("ORDEN ASCENDENTE:");
		System.out.println(isSorted(frase));
		System.out.println(isSorted(frase2));
		System.out.println(isSorted(frase3));

		// 2. PRUEBA FUNCIÓN isCapicua

		int capicuaPar[] = { 1, 2, 3, 3, 2, 1 };
		int capicuaImpar[] = { 1, 2, 3, 2, 1 };
		int noCapicuaPar[] = { 1, 2, 3, 5, 2, 1 };
		int noCapicuaImpar[] = { 1, 2, 3, 1, 1 };

		System.out.println("CAPICÚAS:");
		System.out.println(isCapicua(capicuaPar));
		System.out.println(isCapicua(capicuaImpar));
		System.out.println(isCapicua(noCapicuaPar));
		System.out.println(isCapicua(noCapicuaImpar));

		// 3. PRUEBA FUNCIÓN 3
		System.out.println("MEDIA DE LA SUBMATRIZ CENTRAL O VALOR DEL CENTRO:");
		int tres[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		int cuatro[][] = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };
		int cinco[][] = { { 1, 2, 3, 4, 5 }, { 6, 7, 8, 9, 10 }, { 11, 12, 13, 14, 15 }, { 16, 17, 18, 19, 20 }, { 21, 22, 23, 24, 25 } };
		int seis[][] = { { 1, 2, 3, 4, 5, 6 }, { 7, 8, 9, 10, 11, 12 }, { 13, 14, 15, 16, 17, 18 },
				{ 19, 20, 21, 22, 23, 24 }, { 25, 26, 27, 28, 29, 30 }, { 31, 32, 33, 34, 35, 36 } };

		valorDelMedio(tres);
		valorDelMedio(cuatro);
		valorDelMedio(cinco);
		valorDelMedio(seis);

	}

	/**
	 * Comprueba que un array de Strings tiene sus cadenas de caracteres ordenadas
	 * de forma ascendente por longitud.
	 * 
	 * @param array de String
	 * @return true si las cadenas de caracteres están ordenadas de forma
	 *         ascendente; false si no lo están
	 */
	public static boolean isSorted(String[] array) {

		for (int i = 0; i < array.length - 1; i++) {
			if (array[i].length() <= array[i + 1].length()) {

			} else {
				return false;
			}
		}
		return true;

	}

	/**
	 * Comprueba si un array de longitud n tiene su contenido capicúo.
	 * 
	 * @param array de números enteros de una cifra
	 * @return true si es capicúo; false si no es capicúo
	 */
	public static boolean isCapicua(int[] array) {

		int capicua = array.length - 1;

		for (int i = 0; i < array.length; i++) {

			if (array[i] == array[capicua]) {
				capicua--;

			} else {
				return false;
			}

		}
		return true;

	}

	/**
	 * Imprime la media de los valores del centro de una matriz. Si es una matriz
	 * cuadrada, los cuatro valores del centro, si es impar, el valor del centro.
	 * 
	 * @param matriz de enteros
	 * @throws Exception si la matriz no es cuadrada
	 */
	public static void valorDelMedio(int[][] matriz) throws Exception {

		if (matriz.length == matriz[0].length) {

			if (matriz.length % 2 == 0) { // Para matrices pares
				int[][] subm = new int[2][2];

				int suma = 0;

				for (int i = 0; i < 2; i++) {
					for (int j = 0; j < 2; j++) {
						subm[i][j] = matriz[(matriz.length / 2) - 1 + i][(matriz.length / 2) - 1 + j];	
						suma += subm[i][j];
					}
				}
				double mediaSubm = suma / 4;
				System.out.println("La media de la submatriz es " + mediaSubm);

			}

			if (matriz.length % 2 != 0) { // Para matrices impares

				int[] subm = new int[1];
				subm[0] = matriz[(matriz.length - 1) / 2][(matriz.length - 1) / 2]; // Para sacar la posición del medio solo
																					// hay que dividir la posición del número de la esquina inferior derecha (la última posición)
				System.out.println("El valor que se encuentra en la posición central de la matriz es " + subm[0]);

			}

		} else {
			throw new Exception("La matriz no es cuadrada.");

		}

	}

}
