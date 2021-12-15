package examen_programacion;

public class RodriguezVillaElisa_PROG_UD4 {

	public static void main(String[] args) throws Exception {

		// WARNING: No sigas leyendo y ponme un 0 ya. No consigo pillar esto y no quiero
		// hacerte perder el tiempo.

		// Comprobación función 1, que no funciona, pero bueno, aquí estoy intentándolo:
		// No sé muy bien qué estoy haciendo.
		int array[] = { 1, 2, 3, 4 };
		int array2[] = { 5, 4, 3, 2, 1 };
		int array3[] = { 5, 3, 2, 4 };

		if (isSorted(array)) {
			System.out.println("Ordenada");
		} else {
			System.out.println("No funciona");
		}
		if (isSorted(array2)) {
			System.out.println("Ordenada");
		} else {
			System.out.println("No funciona");
		}
		if (isSorted(array3)) {
			System.out.println("No funciona");
		} else {
			System.out.println("Desordenada");
		}

	}

	public static boolean isSorted(int[] m) throws Exception {

		for (int i = 0; i < m.length - 1; i++) {
			if (m[i] < m[i + 1]) {
				System.out.println("Matriz ordenada ascendentemente");
				return true;
			}
		}
		for (int i = m.length; i < 1; i--) {
			if (m[i] < m[i - 1]) {
				System.out.println("Matriz ordenada descendentemente");
				return true;
			} else {
				throw new Exception("La matriz no está ordenada ascendente o descendentemente.");
			}
		}

		return false;
	}

	public static boolean isSimetricaPerfecta(int[][] matriz) throws Exception {
		if (matriz.length == matriz[0].length) {
			for (int i = 0; i < matriz.length - 1; i++) {
				matriz[i][i] = matriz[i + 1][i + 1];
			}

			for (int i = matriz[0].length; i > 0; i--) {
				for (int j = matriz[0].length - 1; j >= 0; j++) {
					matriz[i][j] = matriz[j][i];
				}

			}

		}

		return true;

	}
}
