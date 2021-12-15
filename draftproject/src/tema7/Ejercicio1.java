package tema7;

public class Ejercicio1 {

	/*
	 * Define un array de 12 números enteros con nombre num y asigna los valores
	 * según la tabla que se muestra a continuación. Muestra el contenido de todos
	 * los elementos del array. ¿Qué sucede con los valores de los elementos que no
	 * han sido inicializados?
	 */

	public static void main(String[] args) {

		int[] array = new int[12];

		array[0] = 39;
		array[1] = -2;
		array[4] = 0;
		array[6] = 14;
		array[8] = 5;
		array[9] = 120;

		System.out.println(
				"Si imprimo mi array como tal, aparece la partición de memoria RAM donde se almacena el array:");
		System.out.println(array);
		System.out.println("0\t1\t2\t3\t4\t5\t6\t7\t8\t9\t10\t11");
		System.out.println(array[0] + "\t" + array[1] + "\t" + array[2] + "\t" + array[3] + "\t" + array[4] + "\t"
				+ array[5] + "\t" + array[6] + "\t" + array[7] + "\t" + array[8] + "\t" + array[9] + "\t" + array[10]
				+ "\t" + array[11]);
		System.out.println("Los valores que no se han inicializado se imprimen como 0.");

	}

}
