package EEDD;

import java.util.Scanner;

public class debug3 {
public static void main(String[] args) {
	System.out.println("Por favor, vya aintroduciendo n�meros y pulsando INTRO.");
	System.out.println("Para terminar, introduzca un n�mero negativo.");
	int numeroIntroducido =0;
	int cuentaNumeros = 0;
	int suma = 0;
	
	Scanner s = new Scanner (System.in);
	
	while (numeroIntroducido >=0) {
		numeroIntroducido = Integer.parseInt(s.nextLine());
		cuentaNumeros++;
		suma+= numeroIntroducido;
	}
	System.out.println("Has introducido "+ (cuentaNumeros-1)+" n�meros positivos.");
	System.out.println("La suma total de ellos es "+ (suma - numeroIntroducido));
	s.close();
}


}
