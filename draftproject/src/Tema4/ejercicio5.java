package Tema4;

import java.util.Scanner;

public class ejercicio5 {
public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	
	System.out.println("Este programa resuelve ecuaciones de primer grado del tipo ax + b = 0.\nPor favor, introduzca el valor de a:");
	double a = Double.parseDouble(s.nextLine());
	System.out.println("Ahora introduzca el valor de b:");
	double b = Double.parseDouble(s.nextLine());
	
	System.out.println("x ="+(-b/a));
	
	
	
}
}
