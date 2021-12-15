package Tema4;

import java.util.Scanner;

public class ejercicio8 {
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		System.out.println("Introduzca la nota del examen 1:");
		Double examen1 = Double.parseDouble(s.nextLine());
		System.out.println("Nota del examen 2:");
		Double examen2 = Double.parseDouble(s.nextLine());
		System.out.println("Nota del examen 3:");
		Double examen3 = Double.parseDouble(s.nextLine());

		double notaMedia = (double) (examen1 + examen2 + examen3) / 3;

		if ((notaMedia >= 0) && (notaMedia < 5)) {
			System.out.println(notaMedia + " SUSPENSO");
			}
		
		
		if ((notaMedia >= 5) && (notaMedia < 6)) {
			System.out.println(notaMedia + " SUFICIENTE");
			}
		
		if ((notaMedia >= 6) && (notaMedia < 7)) {
			System.out.println(notaMedia + " BIEN");
			}
		
		if ((notaMedia >= 7) && (notaMedia < 9)) {
			System.out.println(notaMedia + " NOTABLE");
			}
		
		if ((notaMedia >= 9) && (notaMedia <= 10)) {
			System.out.println(notaMedia + " SOBRESALIENTE");
			}
		else {
			System.out.println("Introduzca notas del 0 al 10.");
		}
		
	 }
	}
