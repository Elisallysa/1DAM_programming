package Tema4;

import java.util.Scanner;

public class ejercicio24 {
	/*
	 * Escribe un programa que genere la nómina (bien desglosada) de un empleado
	 * según las siguientes condiciones: • Se pregunta el cargo del empleado (1 -
	 * Prog. junior, 2 - Prog. senior, 3 - Jefe de proyecto), los días que ha estado
	 * de viaje visitando clientes durante el mes y su estado civil (1 - Soltero, 2
	 * - Casado). • El sueldo base según el cargo es de 950, 1200 y 1600 euros según
	 * si se trata de un prog. junior, un prog. senior o un jefe de proyecto
	 * respectivamente. • Por cada día de viaje visitando clientes se pagan 30 euros
	 * extra en concepto de dietas. Al sueldo neto hay que restarle el IRPF, que
	 * será de un 25% en caso de estar soltero y un 20% en caso de estar casado.
	 */
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		double sueldoBase = 0;

		System.out.println(
				"NÓMINA DESGLOSADA\nPor favor introduzca el número 1 si desempeña un cargo de programador junior, 2 de programador senior y 3 de jefe de proyecto.");
		int cargo = Integer.parseInt(s.nextLine());

		System.out.println("Número de días de viaje visitando clientes:");
		int dias = Integer.parseInt(s.nextLine());
		double dietas = dias * 30;

		System.out.println("Escriba si su estado civil es casado o soltero");
		String estCiv = s.nextLine();

		switch (cargo) {
		case 1:
			sueldoBase = 950;
			break;
		case 2:
			sueldoBase = 1200;
			break;
		case 3:
			sueldoBase = 1600;
			break;
		default:
			System.out.println("Por favor, introduzca 1, 2 o 3 según corresponda a su cargo.");
		}

		double irpf = 0;

		switch (estCiv) {
		case "soltero":
			irpf = 0.25;
			break;
		case "casado":
			irpf = 0.2;
			break;
		default:
			System.out.println("Por favor, escriba 'casado' o 'soltero'.");
		}

		double sueldoBruto = sueldoBase + dietas;

		System.out.println("|-------------------------------|");
		System.out.println("| Sueldo base\t\t" + sueldoBase + " |");
		System.out.println("| Dietas (" + dias + " viajes)\t" + dietas + " |");
		System.out.println("|-------------------------------|");
		System.out.println("| Sueldo bruto\t\t" + (sueldoBruto) + " |");
		System.out.println("| Retención IRPF (" + irpf + "%)\t" + sueldoBruto * irpf+" |");
		System.out.println("|-------------------------------|");
		System.out.println("| Sueldo neto\t\t" + sueldoBruto * (1 - irpf)+" |");
		System.out.println("|-------------------------------|");

		s.close();
		
	}

}
