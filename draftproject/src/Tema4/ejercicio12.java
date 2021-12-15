package Tema4;

import java.util.Scanner;

public class ejercicio12 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int puntos = 0;
		
		System.out.println("Cuestionario DAM:\n1.\t¿Qué nombre recibe una fila en una BD?");
		String r1 = (s.nextLine());

		if (r1.equals("registro") && r1.equals("Registro"))  {
			System.out.println("¡La respuesta es correcta!");
			puntos++;
		} else {
			System.out.println("Lo siento, la respuesta es incorrecta.");
		}

		System.out.println("2.\t¿Cuál es el tamaño en bytes de una variable booleana?");
		String r2 = (s.nextLine());

		if (r2.equals("1")) {
			System.out.println("¡La respuesta es correcta!");
			puntos++;
		} else {
			System.out.println("Lo siento, la respuesta es incorrecta.");
		}
		System.out.println("3.\t¿Qué extensión tiene una hoja de estilos de una página web?");
		String r3 = (s.nextLine());

		if (r3.equals(".css" )&& r1.equals("css")) {
			System.out.println("¡La respuesta es correcta!");
			puntos++;
		} else {
			System.out.println("Lo siento, la respuesta es incorrecta.");
		}
		System.out.println(
				"4.\t¿Cómo se denomina la metodología de desarrollo de software basada en la colaboración entre el equipo y la maximización de beneficios?");
		String r4 = (s.nextLine());

		if (r4.equals("scrum") && r1.equals("SCRUM") && r1.equals("Scrum")) {
			System.out.println("¡La respuesta es correcta!");
			puntos++;
		} else {
			System.out.println("Lo siento, la respuesta es incorrecta.");
		}

		System.out.println(
				"5.\tSi no existe obligación de escoger un trabajo concreto, podemos decir que el trabajo es...");
		String r5 = (s.nextLine());

		if (r5.equals("voluntario") && r1.equals("Voluntario")) {
			System.out.println("¡La respuesta es correcta!");
			puntos++;	
		} else {
			System.out.println("Lo siento, la respuesta es incorrecta.");
		}
		System.out.println(
				"6.\t¿Qué tipo de memoria, además de los registros y la memoria RAM está englobada en la memoria principal?");
		String r6 = (s.nextLine());

		if (r6.equals("caché") && r1.equals("cache")) {
			System.out.println("¡La respuesta es correcta!");
			puntos++;
		} else {
			System.out.println("Lo siento, la respuesta es incorrecta.");
		}
		System.out.println("7.\t¿Cuál es la primera fase del ciclo de vida del software?");
		String r7 = (s.nextLine());

		if (r7.equals("análisis") && r1.equals("analisis")) {
			System.out.println("¡La respuesta es correcta!");
			puntos++;
		} else {
			System.out.println("Lo siento, la respuesta es incorrecta.");
		}
		System.out.println("8.\t¿Qué etiqueta llevan los encabezados de una tabla (añade las comillas oblicuas)?");
		String r8 = (s.nextLine());

		if (r8.equals("<th>")) {
			System.out.println("¡La respuesta es correcta!");
			puntos++;
		} else {
			System.out.println("Lo siento, la respuesta es incorrecta.");
		}
		System.out.println("9.\tUn driver se considera software de sistemas. V o F.");
		String r9 = (s.nextLine());

		if (r9.equals("V") && r1.equals("v")) {
			System.out.println("¡La respuesta es correcta!");
			puntos++;
		} else {
			System.out.println("Lo siento, la respuesta es incorrecta.");
		}
		System.out.println("10.\t¿Qué empresa diseñó la plataforma Java?");
		String r10 = (s.nextLine());

		if (r10.equals("Oracle") && r1.equals("ORACLE") && r1.equals("oracle")) {
			System.out.println("¡La respuesta es correcta!");
			puntos++;
		} else {
			System.out.println("Lo siento, la respuesta es incorrecta.");
		}
		
		System.out.println("Tu puntuación total: "+puntos+"/10.");
	}
}
