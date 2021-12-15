package Tema3;

import java.util.Scanner;

public class ejercicio12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s = new Scanner(System.in);
System.out.println("Introduce la nota del primer examen:");
double nota1 = Double.parseDouble(s.nextLine());
System.out.println("Introduce la nota media del trimestre que quieres obtener:");
double notamedia = Double.parseDouble(s.nextLine());

System.out.println("\nPara tener un "+notamedia+" tienes que sacar un "+(((notamedia/0.6)-(0.4/0.6)*(nota1)))+" en el próximo examen.");
	}

}
