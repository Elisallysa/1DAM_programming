package EEDD;

import java.util.Scanner;

public class debugging {

	public static void main(String[] args) {
		
		Scanner s= new Scanner (System.in);
		
		System.out.println("Introduce el primer número");
		int numero1 = s.nextInt();
		System.out.println("Introduce el segundo número");
		int numero2 = s.nextInt();
		System.out.println("La suma es: "+numero1+numero2);
		s.close();
	
	}

}
