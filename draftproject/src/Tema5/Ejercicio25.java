package Tema5;

import java.util.Scanner;

public class Ejercicio25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Realiza un programa que pida un n�mero por teclado y que luego muestre ese
		// n�mero al rev�s.

		Scanner s = new Scanner (System.in);
		
		System.out.println("Introduzca un n�mero por teclado y le dar� la vuelta:");
		int numero = Integer.parseInt(s.nextLine());
		


		for (int i = 1; numero%10>0; i++) {
			System.out.print(numero%10);
			int aux = numero/10;
			numero = aux;
		}
		s.close();
	}

}
