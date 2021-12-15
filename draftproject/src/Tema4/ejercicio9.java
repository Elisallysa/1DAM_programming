package Tema4;

import java.util.Scanner;

public class ejercicio9 {
public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	
	System.out.println("Resolución de ecuaciones de segundo grado\nax\u00B2+bx+c=0\nIntroduce el valor de a:");
	
	double a = Double.parseDouble(s.nextLine());
	
	System.out.println("Introduce el valor de b:");
	
	double b = Double.parseDouble(s.nextLine());
	
	System.out.println("Introduce el valor de c:");
	
	double c = Double.parseDouble(s.nextLine());
	
	
	double e = 4*a*c;
	double f = Math.sqrt(b*b-e);
	
	if (f < 0) {
		System.out.println("La ecuación no tiene solución.");
	}
	
	System.out.println("x = "+(-b+f)/2*a+"/"+(-b-f)/2*a);
	

}
}
