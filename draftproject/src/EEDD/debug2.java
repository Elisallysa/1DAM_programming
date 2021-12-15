package EEDD;

import java.util.Scanner;

public class debug2 {

	public static void main(String[] args) {
	Scanner s = new Scanner (System.in);
	
	System.out.println("¿Cuál es la capital de Reino Unido?");
	String respuesta = s.nextLine();
	if (respuesta.equals("Londres")) {
		System.out.println("La respuesta es correcta");
	} else {
		System.out.println("Lo siento, la respuesta es incorrecta.");
	}
	s.close();
	}

}
