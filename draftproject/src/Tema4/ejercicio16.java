package Tema4;

import java.util.Scanner;

public class ejercicio16 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int puntos = 0;

		System.out.println("�Sospechas que tu pareja te es infiel?\nDesc�brelo con este test. Responde con V o F:");
		System.out.println("1. Tu pareja parece estar m�s inquieta de lo normal sin ning�n motivo aparente.");
		String respuesta = (s.nextLine());
		if (respuesta.equals("V")) {
			puntos++;
		}
		System.out.println("2. Ha aumentado sus gastos de vestuario");
		String respuesta2 = (s.nextLine());
		if (respuesta2.equals("V")) {
			puntos++;
		}
		System.out.println("3. Ha perdido el inter�s que mostraba anteriormente por ti");
		String respuesta3 = (s.nextLine());
		if (respuesta3.equals("V")) {
			puntos++;
		}
		System.out.println(
				"4. Ahora se afeita y se asea con m�s frecuencia (si es hombre) o ahora se arregla el pelo y se asea con m�s frecuencia (si es mujer)");
		String respuesta4 = (s.nextLine());
		if (respuesta4.equals("V")) {
			puntos++;
		}
		System.out.println("5. No te deja que mires la agenda de su tel�fono m�vil");
		String respuesta5 = (s.nextLine());
		if (respuesta5.equals("V")) {
			puntos++;
		}
		System.out.println("6. A veces tiene llamadas que dice no querer contestar cuando est�s t� delante");
		String respuesta6 = (s.nextLine());
		if (respuesta6.equals("V")) {
			puntos++;
		}
		System.out.println("7. �ltimamente se preocupa m�s en cuidar la l�nea y/o estar bronceado/a");
		String respuesta7 = (s.nextLine());
		if (respuesta7.equals("V")) {
			puntos++;
		}
		System.out.println("8. Muchos d�as viene tarde despu�s de trabajar porque dice tener mucho m�s trabajo");
		String respuesta8 = (s.nextLine());
		if (respuesta8.equals("V")) {
			puntos++;
		}
		System.out.println("9. Has notado que �ltimamente se perfuma m�s");
		String respuesta9 = (s.nextLine());
		if (respuesta9.equals("V")) {
			puntos++;
		}
		System.out.println("10. Se confunde y te dice que ha estado en sitios donde no ha ido contigo");
		String respuesta10 = (s.nextLine());
		if (respuesta10.equals("V")) {
			puntos++;
		}

		int total = puntos * 3;

		System.out.println("Puntuaci�n: " + total);
		if (total >= 0 && total <= 10) {
			System.out.println("�Enhorabuena! tu pareja parece ser totalmente fiel.");
		}
		if (total >= 11 && total <= 22) {
			System.out.println(
					"Quiz�s exista el peligro de otra persona en su vida o en su mente, aunque seguramente ser� algo sin importancia. No bajes la guardia.");
		}
		if (total >= 23 && total <= 30) {
			System.out.println(
					"Tu pareja tiene todos los ingredientes para estar viviendo un romance con otra persona. Te aconsejamos que indagues un poco m�s y averig�es que es lo que est� pasando por su cabeza.");
		}

	}
}
