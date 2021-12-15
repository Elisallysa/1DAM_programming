package tareas_programacion;

import java.util.Scanner;

public class Tarea_pruebanivel {

	/*
	 * Se pide crear un programa en Java que implemente un desafío matemático que
	 * nosotros resumiremos y acotaremos. Se trata de una conjetura que establece
	 * que sea el número natural que sea, siguiendo un par de pasos se puede llegar
	 * SIEMPRE a 1. Dicho de otra forma, empieces por donde empieces, siempre
	 * llegarás a 1. Es muy sencillo, dado un número n cualquiera mayor a 0, se
	 * llegará a 1 con los siguientes pasos:
	 */

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int aux = 0;

		System.out.println("Introduce un número entero del 1 al 100:");
		int primerNum = Integer.parseInt(s.nextLine());

		while (primerNum <= 0 || primerNum > 100) {
			System.out.println(
					"Tú, sucio mono que aporrea un teclado, he dicho un puto número entero del 1 al 100.\nQue no vuelva a ocurrir:");
			primerNum = Integer.parseInt(s.nextLine());

		}

		aux = primerNum;

		while (aux > 1) {
			if (aux % 2 == 0) {
				aux = aux / 2;
			} else {
				aux = (aux * 3) + 1;
			}
		}

		// Si siempre imprime por pantalla el número uno, eso significa que se demuestra
		// la conjetura.
		System.out.println(aux);

		s.close();

	}

}
