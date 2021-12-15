package poo;

import java.util.Scanner;

import poo.cuentaBancaria;

public class Main_cuentaBancaria {
	static cuentaBancaria miCuenta = new cuentaBancaria(1234, "12345679H");
	static cuentaBancaria tuCuenta = new cuentaBancaria(9876, "98765432L");
	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {

		boolean acceso = menuPrincipal();
		if (acceso) {
			int opcion = 0;
			do {
				opcion = mostrarMenuCajero();
				logicaCajero(opcion);
			} while (opcion != 5);
		}

//		COMPROBACIONES:

//		System.out.println(miCuenta.comprobarPin(1234));
//		System.out.println(miCuenta);
//		System.out.println(miCuenta.comprobarPin(2547));
//		System.out.println(miCuenta.getIBAN());
//		
//		//Ingreso en mi cuenta
//		miCuenta.ingreso(30);
//		System.out.println(miCuenta);
//		
//		//Retirada en mi cuenta
//		miCuenta.retirada(20);
//		System.out.println(miCuenta);
//		miCuenta.retirada(30);
//		System.out.println(miCuenta);
//		System.out.println(miCuenta.comprobarPin(2547));
//		miCuenta.ingreso(30);
//		
//		//Transferencia
//		miCuenta.transferencia(tuCuenta, 10);
//		System.out.println(miCuenta);
//		System.out.println(tuCuenta);

	}

	public static boolean menuPrincipal() {

		// Menú principal donde se piden los datos

		String dni, pin; // Para leer por teclado
		System.out.println("BIENVENIDO A LA CAIJA");
		System.out.println("Introduce tu DNI: ");
		dni = s.nextLine();

		if (miCuenta.getDniPropietario().equalsIgnoreCase(dni)) {
			boolean accesoPermitido = false;
			do {
				if (!miCuenta.isBloqueada()) {

					System.out.println("Introduce tu PIN: ");
					pin = s.nextLine();
					accesoPermitido = miCuenta.comprobarPin(Integer.parseInt(pin));
					if (accesoPermitido) { // Menú del cajero
						System.out.println("Acceso permitido");
					} else {
						System.out.println("PIN ERRÓNEO");
					}
				}
			} while (!accesoPermitido && !miCuenta.isBloqueada());

			if (miCuenta.isBloqueada())
				System.out.println("Has bloqueado la cuenta.");

		}
		return false;
	}

	public static int mostrarMenuCajero() {
		int opc = 0;

		do {
			System.out.println(
					"1. Ingreso\n2. Retirada\n3. Transferencia a otra cuenta\n4.Mostrar datos de cuenta.\n5.Salir");
			opc = Integer.parseInt(s.nextLine());
		} while (opc < 1 || opc > 5);

		return opc;
	}

	public static void logicaCajero(int opcion) {
		int cantidad = 0;
		switch (opcion) {

		case 1:
			System.out.println("¿Cuánto quiere ingresar?");
			cantidad = Integer.parseInt(s.nextLine());
			miCuenta.ingreso(cantidad);
			break;
		case 2:
			System.out.println("¿Cuánto quieres sacar?");
			cantidad = Integer.parseInt(s.nextLine());
			miCuenta.retirada(cantidad);
			break;
		case 3:
			System.out.println("¿Cuánto quieres transferir?");
			cantidad = Integer.parseInt(s.nextLine());
			miCuenta.transferencia(tuCuenta, cantidad);
			break;
		case 4:
			System.out.println(miCuenta);
			break;
		case 5:
			System.out.println("Adiós.");
		}
	}

}
