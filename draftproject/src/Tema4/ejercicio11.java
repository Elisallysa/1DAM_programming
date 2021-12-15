package Tema4;

import java.util.Scanner;

public class ejercicio11 {

	public static void main(String[] args) {

Scanner s = new Scanner(System.in);

System.out.println("Si me dices qué hora es, yo te digo cuántos segundos quedan para medianoche:");

int hora = Integer.parseInt(s.next());
System.out.print(":");
int min = Integer.parseInt(s.next());

if ((hora >=0) && (hora<=23)) {
	System.out.println("Quedan: "+((24-hora)*3600)+(60-min)*60+" segundos.");
	
}
		
		
	}
}
