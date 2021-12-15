package Tema4;

import java.util.Scanner;

public class ejercicio6 {
public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	
	System.out.println("¿Cuánto tarda un objeto en caer desde una altura determinada?\nIntroduzca la altura (m):");
	double h = Double.parseDouble(s.nextLine());
	
	System.out.println("Tarda "+Math.sqrt(2*h/9.81)+" minutos.");
}
}
