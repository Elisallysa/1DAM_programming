package Tema4;

import java.util.Scanner;

public class ejercicio23 {

	/*
	 * Escribe un programa que calcule el precio final de un producto según su base
	 * imponible (precio antes de impuestos), el tipo de IVA aplicado (general,
	 * reducido o superreducido) y el código promocional. Los tipos de IVA general,
	 * reducido y superreducido son del 21%, 10% y 4% respectivamente. Los códigos
	 * promocionales pueden ser nopro, mitad, meno5 o 5porc que significan
	 * respectivamente que no se aplica promoción, el precio se reduce a la mitad,
	 * se descuentan 5 euros o se descuenta el 5%. El ejercicio se da por bueno si
	 * se muestran los valores correctos, aunque los números no estén tabulados.
	 */
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		System.out.println("Introduzca la base imponible: ");
		double bi = Double.parseDouble(s.nextLine());
		System.out.println("Introduzca el tipo de IVA (general, reducido o superreducido): ");
		String iva = s.nextLine();
		System.out.println("Introduzca el código promocional (nopro, mitad, meno5 o 5porc: ");
		String cod = s.nextLine();

		double ivag = bi * 0.21;
		double ivar = bi * 0.1;
		double ivas = bi * 0.04;
		double pivag = bi + (ivag);
		double pivar = bi + (ivar);
		double pivas = bi + (ivas);
		double precioIva = 0;

		System.out.println("Base imponible:\t\t" + bi);
		if (iva.equals("general")) {
			precioIva = bi * 0.21;
			System.out.println("IVA 21%\t\t\t" + precioIva);
			double totaliva = bi + precioIva;
			System.out.println("Precio con IVA\t\t" + totaliva);

		}
		if (iva.equals("reducido")) {
			precioIva = bi * 0.1;
			System.out.println("IVA 10%\t\t\t" + precioIva);
			double totaliva = bi + precioIva;
			System.out.println("Precio con IVA\t\t" + totaliva);
		}
		if (iva.equals("superreducido")) {
			precioIva = bi * 0.04;
			System.out.println("IVA 4%\t\t\t" + precioIva);
			double totaliva = bi + precioIva;
			System.out.println("Precio con IVA\t\t" + totaliva);
		}

		if (cod.equals("nopro")) {
			System.out.println("Cód. promo. (nopro)\t-00.00");
			System.out.println("TOTAL\t\t\t" + (bi + precioIva));
		}
		if (cod.equals("mitad")) {
			System.out.println("Cód. promo. (mitad)\t" + ((bi + precioIva) * 0.5));
			System.out.println("TOTAL\t\t\t" + (bi + precioIva) * 0.5);
		}
		if (cod.equals("meno5")) {
			System.out.println("Cód. promo. (meno5)\t"+"-5.00");
			System.out.println("TOTAL\t\t\t" + ((bi + precioIva) - 5));
		}
		if (cod.equals("5porc")) {
			System.out.println("Cód. promo. (5porc)\t" + ((bi + precioIva) * 0.05));
			System.out.println("TOTAL\t\t\t" + (bi + precioIva) * 0.95);
		}

		/*
		 * ); POR QUÉ NO FUNCIONA ESTO??
		 */

	}

}
