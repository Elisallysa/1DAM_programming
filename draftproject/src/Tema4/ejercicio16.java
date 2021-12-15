package Tema4;

import java.util.Scanner;

public class ejercicio16 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int puntos = 0;

		System.out.println("¿Sospechas que tu pareja te es infiel?\nDescúbrelo con este test. Responde con V o F:");
		System.out.println("1. Tu pareja parece estar más inquieta de lo normal sin ningún motivo aparente.");
		String respuesta = (s.nextLine());
		if (respuesta.equals("V")) {
			puntos++;
		}
		System.out.println("2. Ha aumentado sus gastos de vestuario");
		String respuesta2 = (s.nextLine());
		if (respuesta2.equals("V")) {
			puntos++;
		}
		System.out.println("3. Ha perdido el interés que mostraba anteriormente por ti");
		String respuesta3 = (s.nextLine());
		if (respuesta3.equals("V")) {
			puntos++;
		}
		System.out.println(
				"4. Ahora se afeita y se asea con más frecuencia (si es hombre) o ahora se arregla el pelo y se asea con más frecuencia (si es mujer)");
		String respuesta4 = (s.nextLine());
		if (respuesta4.equals("V")) {
			puntos++;
		}
		System.out.println("5. No te deja que mires la agenda de su teléfono móvil");
		String respuesta5 = (s.nextLine());
		if (respuesta5.equals("V")) {
			puntos++;
		}
		System.out.println("6. A veces tiene llamadas que dice no querer contestar cuando estás tú delante");
		String respuesta6 = (s.nextLine());
		if (respuesta6.equals("V")) {
			puntos++;
		}
		System.out.println("7. Últimamente se preocupa más en cuidar la línea y/o estar bronceado/a");
		String respuesta7 = (s.nextLine());
		if (respuesta7.equals("V")) {
			puntos++;
		}
		System.out.println("8. Muchos días viene tarde después de trabajar porque dice tener mucho más trabajo");
		String respuesta8 = (s.nextLine());
		if (respuesta8.equals("V")) {
			puntos++;
		}
		System.out.println("9. Has notado que últimamente se perfuma más");
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

		System.out.println("Puntuación: " + total);
		if (total >= 0 && total <= 10) {
			System.out.println("¡Enhorabuena! tu pareja parece ser totalmente fiel.");
		}
		if (total >= 11 && total <= 22) {
			System.out.println(
					"Quizás exista el peligro de otra persona en su vida o en su mente, aunque seguramente será algo sin importancia. No bajes la guardia.");
		}
		if (total >= 23 && total <= 30) {
			System.out.println(
					"Tu pareja tiene todos los ingredientes para estar viviendo un romance con otra persona. Te aconsejamos que indagues un poco más y averigües que es lo que está pasando por su cabeza.");
		}

	}
}
