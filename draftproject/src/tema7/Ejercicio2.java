package tema7;

public class Ejercicio2 {

	public static void main(String[] args) {
		
		char[] simbolo = new char [10];
		
		simbolo[0] = 'a';
		simbolo[1] = 'x';
		simbolo[4] = '@';
		simbolo[6] = ' ';
		simbolo[7] = '+';
		simbolo[8] = 'Q';
		
		System.out.println("0\t1\t2\t3\t4\t5\t6\t7\t8\t9");
		for (int i = 0; i < 10; i++) {
			System.out.print(simbolo[i]);
			System.out.print("\t");
			}

		
		System.out.println("Los valores de los elementos que no se han inicializado, aparecen en blanco.");
		

	}

}
