package Tema4;

import java.util.Scanner;

public class ejercicio3 {
public static void main(String[] args) {
	Scanner s = new Scanner (System.in);
	
	System.out.println("Introduzca el número del día de la semana:");
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
		weekday = ("miércoles");
		break;
	case 4:
		weekday = "jueves";
		break;
	case 5:
		weekday = "viernes";
		break;
	case 6:
		weekday = "sábado";
		break;
	case 7:
		weekday = "domingo";
		break;
	default:
		weekday = "No existe ese día de la semana";
		
	}
	System.out.println("Día de la semana "+week+": "+weekday);
	
}
}
