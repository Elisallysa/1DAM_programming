package Tema4;

import java.util.Scanner;

/*Realiza un programa que, dado un día de la semana (de lunes a viernes) y una
hora (horas y minutos), calcule cuántos minutos faltan para el fin de semana.
Se considerará que el fin de semana comienza el viernes a las 15:00h. Se da
por hecho que el usuario introducirá un día y hora correctos, anterior al viernes
a las 15:00h.
*/

public class ejercicio22 {
public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	
	System.out.println("¿Cuántos minutos faltan para el fin de semana?\n¿Qué día de la semana es hoy? Introduzca un número del 1-7 según el día que corresponda:");
	int dia = Integer.parseInt(s.nextLine());
	
	
	switch (dia) {
	case 1:
		System.out.println("Introduce la hora (formato de 23:59h):");
		int hora = Integer.parseInt(s.nextLine());
		System.out.println("Introduce los minutos");
		int min = Integer.parseInt(s.nextLine());
		System.out.println("Quedan:"+(((24*3+15)-(23-hora))*60)+(60-min)+" minutos.");
	break;
	case 2:
		System.out.println("Introduce la hora (formato de 23:59h):");
		int hora2 = Integer.parseInt(s.nextLine());
		System.out.println("Introduce los minutos");
		int min2 = Integer.parseInt(s.nextLine());
		System.out.println("Quedan:"+(((23*2+15)-(23-hora2))*60)+(60-min2)+" minutos.");
	break;
	case 3:
		System.out.println("Introduce la hora (formato de 23:59h):");
		int hora3 = Integer.parseInt(s.nextLine());
		System.out.println("Introduce los minutos");
		int min3 = Integer.parseInt(s.nextLine());
		System.out.println("Quedan:"+(((24+15)-(23-hora3))*60)+(60-min3)+" minutos.");
	break;
	case 4:
		System.out.println("Introduce la hora (formato de 23:59h):");
		int hora4 = Integer.parseInt(s.nextLine());
		System.out.println("Introduce los minutos");
		int min4 = Integer.parseInt(s.nextLine());
		System.out.println("Quedan:"+(((23-hora4))*60)+(60-min4)+" minutos.");
	break;
	case 5:
		System.out.println("Introduce la hora (formato de 23:59h):");
		int hora5 = Integer.parseInt(s.nextLine());
		System.out.println("Introduce los minutos");
		int min5 = Integer.parseInt(s.nextLine());
		if (hora5>00 && hora5<=15) {
		System.out.println("Quedan:"+(((14-hora5))*60)+(60-min5)+" minutos.");	
		}else {
			System.out.println("Quedan:"+(((24*6)-(23-hora5))*60)+(60-min5)+" minutos.");
		}
	break;
	case 6:
		System.out.println("Introduce la hora (formato de 23:59h):");
		int hora6 = Integer.parseInt(s.nextLine());
		System.out.println("Introduce los minutos");
		int min6 = Integer.parseInt(s.nextLine());
		System.out.println("Quedan:"+(((24*5+15)-(23-hora6))*60)+(60-min6)+" minutos.");
	break;
	case 7:
		System.out.println("Introduce la hora (formato de 23:59h):");
		int hora7 = Integer.parseInt(s.nextLine());
		System.out.println("Introduce los minutos");
		int min7 = Integer.parseInt(s.nextLine());
		System.out.println("Quedan:"+(((24*4+15)-(23-hora7))*60)+(60-min7)+" minutos.");
	break;
	
	}
	
	
}
}
