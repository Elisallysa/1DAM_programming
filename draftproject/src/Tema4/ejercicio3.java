package Tema4;

import java.util.Scanner;

public class ejercicio3 {
public static void main(String[] args) {
	Scanner s = new Scanner (System.in);
	
	System.out.println("Introduzca el n�mero del d�a de la semana:");
	int week = Integer.parseInt(s.nextLine());
	
	String weekday;
	
	switch (week) {
	case 1:
		weekday = "lunes";
		break;
	case 2:
		weekday = "martes";
		break;
	case 3:
		weekday = ("mi�rcoles");
		break;
	case 4:
		weekday = "jueves";
		break;
	case 5:
		weekday = "viernes";
		break;
	case 6:
		weekday = "s�bado";
		break;
	case 7:
		weekday = "domingo";
		break;
	default:
		weekday = "No existe ese d�a de la semana";
		
	}
	System.out.println("D�a de la semana "+week+": "+weekday);
	
}
}
