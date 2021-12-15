package tema7;

import java.util.Scanner;

public class Ejercicio2_8 {

	public static void main(String[] args) {

	/*
	  	Escribe un programa que, dada una posición en un tablero de ajedrez, nos diga
	    a qué casillas podría saltar un alfil que se encuentra en esa posición. Como se
		indica en la figura, el alfil se mueve siempre en diagonal. El tablero cuenta con
		64 casillas. Las columnas se indican con las letras de la “a” a la “h” y las filas
		se indican del 1 al 8.
	 */
		
		Scanner s = new Scanner (System.in);
		
		String [][] tablero = new String [8][8];
		
		tablero [3][3] = "alfil";
		
		System.out.println("Si el alfil se encuentra en d5, podrá moverse a la:");
		
		int ocho = 9;
		int dos = 1;
		int cuatro = 5;
		int seis = 5;
		String horizontal = "";
		
		for (int i=0; i<=2; i++) {
			ocho--;
			dos++;
			
			int num = i;
			
			switch (num) {
			case 0:
				horizontal = "a";
				break;
			case 1:
				horizontal = "b";
				break;
			case 2:
				horizontal = "c";
			
			}
			
			System.out.println("Posición ["+horizontal+"]["+ocho+"]");
			System.out.println("Posición ["+horizontal+"]["+dos+"]");
		
		}
		
		for (int i=4; i<=6; i++) {
			cuatro--;
			seis++;
			
			int num = i;
		
			switch (num) {
			
			case 4:
				horizontal = "e";
				break;
			case 5:
				horizontal = "f";
				break;
			case 6:
				horizontal = "g";
				
			}
			
			System.out.println("Posición ["+horizontal+"]["+cuatro+"]");
			System.out.println("Posición ["+horizontal+"]["+seis+"]");
			
		
		}
		
			System.out.println("Posición [h][1]");
			System.out.println("");
			
			int ejex = 0;
			System.out.println("Escribe cualquier otra posición. Primero la posición horizontal de a-h:");
			horizontal = s.nextLine();
			System.out.println("Y ahora la posición vertical de 1-8:");
			int ejey = Integer.parseInt(s.nextLine());
			
			
			
			switch (horizontal) {
			case "a":
				ejex = 0;
				break;
			case "b":
				ejex = 1;
				break;
			case "c":
				ejex = 2;
				break;
			case "d":
				ejex = 3;
				break;
			case "e":
				ejex = 4;
				break;
			case "f":
				ejex = 5;
				break;
			case "g":
				ejex = 6;
				break;
			case "h":
				ejex = 7;
			}
			
			int ejex2 = ejex;
				
			do {
				ejex++;
				ejey--;
				
				System.out.println("Posición ["+ejex+"]["+ejey+"]");
				
			}while(ejex<=7 && ejey>=0);
			
			do {
				ejex2--;
				ejey++;
				
				System.out.println("Posición ["+ejex2+"]["+ejey+"]");
				
			}while(ejex>=0 && ejey<=7);
			
			do {
				ejex2--;
				ejey--;
				
				System.out.println("Posición ["+ejex2+"]["+ejey+"]");
				
			}while(ejex>=0 && ejey>=0);
			
			do {
				ejex2++;
				ejey++;
				
				System.out.println("Posición ["+ejex+"]["+ejey+"]");
				
			}while(ejex<=7 && ejey<=7);
	}
}