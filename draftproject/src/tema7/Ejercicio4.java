package tema7;

public class Ejercicio4 {

	public static void main(String[] args) {

		int[] numero = new int[20];
		int[] cuadrado = new int[20];
		int[] cubo = new int[20];

		System.out.println("0\t1\t2\t3\t4\t5\t6\t7\t8\t9\t10\t11\t12\t13\t14\t15\t16\t17\t18\t19\t20");
		for (int i = 0; i <= 19; i++) {
			numero[i] = (int) (Math.random() * 101);
			System.out.print(numero[i]);
			System.out.print("\t");

		}

		System.out.println("\n");
		System.out.println("0\t1\t2\t3\t4\t5\t6\t7\t8\t9\t10\t11\t12\t13\t14\t15\t16\t17\t18\t19\t20");
		for (int i = 0; i <= 19; i++) {
			cuadrado[i] = (int) Math.pow(numero[i], 2);
			System.out.print(cuadrado[i]);
			System.out.print("\t");
		}
		System.out.println("\n");
		System.out.println("0\t1\t2\t3\t4\t5\t6\t7\t8\t9\t10\t11\t12\t13\t14\t15\t16\t17\t18\t19\t20");
		for (int i = 0; i <= 19; i++) {
			cubo[i] = (int) Math.pow(numero[i], 3);
			System.out.print(cubo[i]);
			System.out.print("\t");
		}
	}

}
