package Tema4;

import java.util.Scanner;

/* Calcula la nota de un trimestre de la asignatura Programaci�n. El programa
pedir� las dos notas que ha sacado el alumno en los dos primeros controles.
Si la media de los dos controles da un n�mero mayor o igual a 5, el alumno
est� aprobado y se mostrar� la media. En caso de que la media sea un n�mero
menor que 5, el alumno habr� tenido que hacer el examen de recuperaci�n que
se califica como apto o no apto, por tanto se debe preguntar al usuario �Cu�l
ha sido el resultado de la recuperaci�n? (apto/no apto). Si el resultado
de la recuperaci�n es apto, la nota ser� un 5; en caso contrario, se mantiene
la nota media anterior
*/

public class ejercicio21 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		System.out.println("PRIMER TRIMESTRE. Nota media de m�dulo Programaci�n.\nNota del primer examen:");
		double n1 = Double.parseDouble(s.nextLine());
		System.out.println("Nota del segundo examen:");
		double n2 = Double.parseDouble(s.nextLine());

		double media = (n1 + n2) / 2;
		String recu;

		if (media >= 5 && media <= 10) {
			System.out.println("Tu nota media es: " + media);
		}

		if (media < 5) {
			System.out.println("�Cu�l ha sido el resultado del examen de recuperaci�n, apto o no apto?");
			if ((recu = s.nextLine()).equals("apto")) {
				System.out.println("Tu nota media es: 5");
			} else {
				System.out.println("Tu nota media es: " + media);
			}
		}

	}
}
