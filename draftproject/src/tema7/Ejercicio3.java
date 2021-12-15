package tema7;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		int[] numeros = new int[10];

		for (int i = 0; i <= 9; i++) {
			System.out.println("Introduce el número " + i);
			numeros[i] = Integer.parseInt(s.nextLine());
		}

		System.out.println("10\t9\t8\t7\t6\t5\t4\t3\t2\t1");
		for (int i = 9; i >= 0; i--) {
			System.out.print(numeros[i]);
			System.out.print("\t");

		}

		s.close();

	}

}
