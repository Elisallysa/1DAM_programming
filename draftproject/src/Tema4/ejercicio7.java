package Tema4;

import java.util.Scanner;

public class ejercicio7 {
public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	
	System.out.println("Introduzca la nota del examen 1:");
	Double examen1 = Double.parseDouble(s.nextLine());
	System.out.println("Nota del examen 2:");
	Double examen2 =Double.parseDouble(s.nextLine());
	System.out.println("Nota del examen 3:");
	Double examen3 =Double.parseDouble(s.nextLine());
	
	System.out.println("\nNota media: "+(examen1+examen2+examen3)/3 );
	
	

}
}
