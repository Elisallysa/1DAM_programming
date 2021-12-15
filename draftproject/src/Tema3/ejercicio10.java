package Tema3;

import java.util.Scanner;

public class ejercicio10 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		System.out.println("Conversor de MB a KB\nIntroduzca la cantidad de Megabytes:");
		int mb = Integer.parseInt(s.nextLine());
		System.out.println(mb + " MB = " + mb * 1024 + " KB");
	}
}
