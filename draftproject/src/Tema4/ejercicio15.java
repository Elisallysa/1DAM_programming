package Tema4;

import java.util.Scanner;

public class ejercicio15 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		System.out.println("Cree una pir�mide con el s�mbolo o caracter que desee.\nIntroduzca primero el caracter:");
		String c = (s.nextLine());
		System.out.println("�Hacia d�nde debe apuntar la pir�mide? �Arriba, abajo, derecha o izquierda?");
		String dir = (s.nextLine());

		if (dir.equals("derecha") || dir.equals("Derecha")) {
			System.out.println(c);
			System.out.println(c + "" + c + "" + c);
			System.out.println(c + "" + c + "" + c + "" + c + "" + c + "" + c);
			System.out.println(c + "" + c + "" + c + "" + c + "" + c + "" + c + "" + c);
			System.out.println(c + "" + c + "" + c + "" + c + "" + c + "" + c);
			System.out.println(c + "" + c + "" + c + "" + c);
			System.out.println(c);
		}

		if (dir.equals("arriba") || dir.equals("Arriba")) {
			System.out.println("    " + c);
			System.out.println("    " + c + "" + c);
			System.out.println("   " + c + "" + c + "" + c);
			System.out.println("  " + c + "" + c + "" + c + "" + c + "" + c);
			System.out.println(" " + c + "" + c + "" + c + "" + c + "" + c + "" + c + "" + c + " ");
			System.out.println(c + "" + c + "" + c + "" + c + "" + c + "" + c + "" + c + "" + c + "" + c);
		}

		if (dir.equals("izquierda") || dir.equals("Izquierda")) {
			System.out.println("       " + c);
			System.out.println("    " + "" + c + "" + c + "" + c + "" + c);
			System.out.println("  " + c + "" + c + "" + c + "" + c + "" + c + "" + c);
			System.out.println(c + "" + c + "" + c + "" + c + "" + c + "" + c + "" + c + "" + c);
			System.out.println("  " + c + "" + c + "" + c + "" + c + "" + c + "" + c);
			System.out.println("    " + c + "" + c + "" + c + "" + c);
			System.out.println("       " + c);
		}

		if (dir.equals("abajo") || dir.equals("Abajo")) {
			System.out.println(c + "" + c + "" + c + "" + c + "" + c + "" + c + "" + c + "" + c + "" + c);
			System.out.println(" " + c + "" + c + "" + c + "" + c + "" + c + "" + c + "" + c + " ");
			System.out.println("  " + c + "" + c + "" + c + "" + c + "" + c);
			System.out.println("   " + c + "" + c + "" + c);
			System.out.println("   " + c + "" + c);
			System.out.println("    " + c);
		}
	}
}
