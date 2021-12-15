package Tema4;

import java.util.Scanner;

public class ejercicio13 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		
		int a = 0;
		int b = 0;
		int c = 0;
		
		
		System.out.println("Introduzca tres números y se ordenarán de mayor a menor:\nNúmero a:");
		int n1 = Integer.parseInt(s.nextLine());
		System.out.println("Número b:");
		int n2 = Integer.parseInt(s.nextLine());
		System.out.println("Número c:");
		int n3 = Integer.parseInt(s.nextLine());

		if (n1 > n2 && n1 > n3) {
			a = n1;	
		} 
		
		if (n2 > n3 && n2 > n1) {
			a = n2;
		} else {
			a = n3;
		}
		
		if (n1 < n2 && n1 < n3) {
			c = n1;
		}
		if (n1 > n2 && n2 > n3) {
			c = n3;
		}
		if (n1 > n2 && n3 > n2) {
			c =n2;
		}
		
		if (n1 < n2 && n1 < n3 && n2 < n3)  {
			b = n2;
		}
		if (n1 < n2 && n1 < n3 && n2 > n3) {
			b = n3;
		}
		if ((n1 > n2 && n1 < n3) || (n1<n2 && n1> n3)) {
			b =n1;
		}
		
		//if ((a == n1 && c == n2) || (c == n1 && a == n2)) {
		//	b= n3;
		//}
		
	
	//if ((n2 == a && n3 == c)|| (n2 == c && n3 == a)) {
			//b = n1;
			//}
		//if ((n1 == a && n3 == c) ||(n1 == c && n3 == a)) {
		//	b = n2;}
		
		System.out.println(a +" "+b+" "+ c);
		
		
		
		
		
		
		
	}
}
