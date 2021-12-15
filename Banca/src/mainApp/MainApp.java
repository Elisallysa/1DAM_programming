package mainApp;

import models.Persona;

import java.util.Scanner;

import java.util.*;

import models.CuentaCorriente;

public class MainApp {
	/*
	 * static Persona persona1 = new Persona("Johnny", "Mentero", "12345678A", 0);
	 * static Persona persona2 = new Persona("María", "Unpajote", "98765432Z", 0);
	 * static Persona persona3 = new Persona("Dolores", "De Barriga", "19283746B",
	 * 0); static Persona persona4 = new Persona("Valeria", "Ana", "22223746B", 0);
	 * static Persona persona5 = new Persona("Armando", "Jaleo", "11111111U", 0);
	 * static Persona persona6 = new Persona("Mari", "Loli", "22222222D", 0);
	 * 
	 * static CuentaCorriente cuenta1 = new CuentaCorriente("1300468746591325", 0,
	 * persona1); static CuentaCorriente cuenta2 = new
	 * CuentaCorriente("2600468746591325", 0, persona2); static CuentaCorriente
	 * cuenta3 = new CuentaCorriente("2600468746591325", 0, persona3); static
	 * CuentaCorriente cuenta5 = new CuentaCorriente("2222222222222222", 0,
	 * persona5); static CuentaCorriente cuenta6 = new
	 * CuentaCorriente("1111111111111111", 0, persona6);
	 */

public static void main(String[] args) {

	Scanner s = new Scanner (System.in);
	
	System.out.println("MENÚ DE PROGRAMA\na. Añadir persona\nb. Elegir persona\n\t1. Cobrar sueldo\n\t2. Sacar pasta\n\t3. Subir sueldo\n\t4. Mostrar detalles de la persona\nc. Borrar persona\nd. Salir");
	
	int i = 0;
	int j;
	int k = 0;
	Persona seleccionada = null;
	double amount = 0;
	
	ArrayList <Persona> listaPersonas = new ArrayList <Persona> ();
	ArrayList <CuentaCorriente> listaCuentas = new ArrayList <CuentaCorriente> ();
	
	
	String opc = "";
	
	do {
		System.out.println("Por favor introduzca la letra que corresponda:");
		opc = s.nextLine();
	
		switch(opc) {
		case "a":
			
			
			//Añadir persona
			System.out.println("Introduzca el nombre:");
			String nombre = s.nextLine();
			System.out.println("Introduzca el apellido:");
			String apellido = s.nextLine();
			System.out.println("Introduzca el DNI:");
			String dni = s.nextLine();
			//Crear persona y añadir a Array:
			listaPersonas.add(new Persona(nombre, apellido, dni, 0, null));
			listaPersonas.get(i).setCuenta(new CuentaCorriente(i,0));
			i++;
		
			
		/*
		 * 	for (Persona p : listaPersonas) {
		 * CuentaCorriente cuenta = new CuentaCorriente (i++, 0);
			 p.setCuenta(new CuentaCorriente(i,0));
			listaCuentas.add(new CuentaCorriente(i,0));
		}
		 */
			
		
			break;
		case "b":
			//Elegir persona
			j = 1;
			for (Persona p: listaPersonas) {
				System.out.println(j+". "+p);
				j++;
			}
			System.out.println("Por favor, elija a una persona introduciendo su número en la lista:");
			int indiceLista = Integer.parseInt(s.nextLine());
			do {
				if (indiceLista <= listaPersonas.size()) {
				seleccionada = listaPersonas.get(indiceLista-1);
				System.out.println(seleccionada);
			} else {
				System.out.println("Esa persona no está en la lista.");
			}
			} while (indiceLista > listaPersonas.size()-1);
			
			System.out.println("¿Qué desea hacer ahora?");
			System.out.println("1. Cobrar sueldo\n\t2. Sacar pasta\n\t3. Subir sueldo\n\t4. Mostrar detalles de la persona");
			
			do {
				System.out.println("Introduce la opción 1 - 4:");
				opc = s.nextLine();
				
				switch (opc) {
				case "1":
					// Cobrar sueldo
					seleccionada.cobrarSueldo();
					
					break;
				case "2":
					//Sacar pasta
					do {
					System.out.println("¿Qué cantidad quieres retirar?");
					amount = Integer.parseInt(s.nextLine());
					if (amount<seleccionada.cuenta.getSaldo()) {
						
					seleccionada.sacarPasta(amount);
					}else {
						System.out.println("Solo puedes retirar máximo "+seleccionada.cuenta.getSaldo()+" €");
					}
					}while (amount<=seleccionada.cuenta.getSaldo());
					
					break;
				case "3":
					//Subir sueldo
					System.out.println("Introduzca el nuevo sueldo:");
					int nuevoSueldo = Integer.parseInt(s.nextLine());
					seleccionada.setSueldo(nuevoSueldo);
				
					break;
				case "4":
					// Mostrar detalles
					System.out.println(seleccionada);
					
				}
				
				
			} while (!opc.equals("1")||!opc.equals("2")||!opc.equals("3")||!opc.equals("4"));
			
			break;
		case "c":
			//Borrar persona
			break;
		case "d":
			//Salir
			
		}
	
	} while (opc.equalsIgnoreCase("a") || opc.equalsIgnoreCase("b") || opc.equalsIgnoreCase("c"));
	
	
	
	
		/*
		 * Persona persona1 = new Persona ("Ana", "Gómez", "123A", 0, null);
		 * CuentaCorriente cuenta1 = new CuentaCorriente ("11111", 0); CuentaCorriente
		 * cuenta2 = new CuentaCorriente("2600468746591325", 0);
		 * 
		 * persona1.setCuenta(cuenta1);
		 * 
		 * System.out.println(persona1);
		 * 
		 * Persona persona2 = new Persona("María", "Unpajote", "98765432Z", 0, null);
		 * persona2.setCuenta(cuenta2);
		 * 
		 * persona2.cobrarSueldo(1820.80); System.out.println(persona2);
		 * 
		 * persona2.sacarPasta(150.65); System.out.println(persona2);
		 * 
		 * persona2.subirSueldo(1900.25); System.out.println(persona2);
		 * 
		 * persona2.cobrarSueldo(1900.25); System.out.println(persona2);
		 * 
		 */

		/*
		 * persona1.setSueldo(2030.80);
		 * 
		 * ASIGNANDO LAS CUENTAS: persona1.setCuenta(cuenta1);
		 * persona2.setCuenta(cuenta2); persona3.setCuenta(cuenta3);
		 * persona5.setCuenta(cuenta5); persona6.setCuenta(cuenta6);
		 */

		/*
		 * System.out.println(persona1); System.out.println(persona2);
		 * System.out.println(persona3); System.out.println(persona5);
		 * System.out.println(persona6);
		 */

//		PARA PROBAR LO DE CLONAR:

//		System.out.println(persona5);
//		System.out.println(persona6);

//		System.out.println("Asigno LA DIRECCIÓN DE MEMORIA de persona 1 a persona 2:");
//		persona1 = persona2.clone();
//		
//		System.out.println(persona1);
//		System.out.println(persona2);
//		
//		System.out.println("Cambio el sueldo de persona 2:");
//		persona2.setSueldo(4000.50);
//		
//		System.out.println("Estos son los datos de persona 1:");
//		System.out.println(persona1);
	}
}
