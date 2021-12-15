package Tema4;

import java.util.Scanner;

/* Calcula la nota de un trimestre de la asignatura Programación. El programa
pedirá las dos notas que ha sacado el alumno en los dos primeros controles.
Si la media de los dos controles da un número mayor o igual a 5, el alumno
está aprobado y se mostrará la media. En caso de que la media sea un número
menor que 5, el alumno habrá tenido que hacer el examen de recuperación que
se califica como apto o no apto, por tanto se debe preguntar al usuario ¿Cuál
ha sido el resultado de la recuperación? (apto/no apto). Si el resultado
de la recuperación es apto, la nota será un 5; en caso contrario, se mantiene
la nota media anterior
*/

public class ejercicio21 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		System.out.println("PRIMER TRIMESTRE. Nota media de módulo Programación.\nNota del primer examen:");
		double n1 = Double.parseDouble(s.nextLine());
		System.out.println("Nota del segundo examen:");
		double n2 = Double.parseDouble(s.nextLine());

		double media = (n1 + n2) / 2;
		String recu;

		if (media >= 5 && media <= 10) {
			System.out.println("Tu nota media es: " + media);
		}

		if (media < 5) {
			System.out.println("¿Cuál ha sido el resultado del examen de recuperación, apto o no apto?");
			if ((recu = s.nextLine()).equals("apto")) {
				System.out.println("Tu nota media es: 5");
			} else {
				System.out.println("Tu nota media es: " + media);
			}
		}

	}
}
