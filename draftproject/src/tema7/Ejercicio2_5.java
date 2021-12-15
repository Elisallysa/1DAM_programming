package tema7;

public class Ejercicio2_5 {

	public static void main(String[] args) {
		/*
		 * Realiza un programa que rellene un array de 6 filas por 10 columnas con
		 * n�meros enteros positivos comprendidos entre 0 y 1000 (ambos incluidos). A
		 * continuaci�n, el programa deber� dar la posici�n tanto del m�ximo como del
		 * m�nimo.
		 */

		int[][] m = new int[6][10];
		int j = 0;



		for (int i = 0; i < m.length; i++) {
			for (j = 0; j < m[i].length; j++) {
				m[i][j] = (int) (Math.random() * 1001);
				
				if (j != 9) {
					System.out.print(m[i][j] + " ");
				}
				if (j == 9) {
					System.out.println(m[i][j]);
				}

			}
			
		}
		System.out.println("");	
		
		int mayor = 0;
		int menor = m[0][0];
		int M1=0;
		int M2=0;
		int m1=0;
		int m2=0;
		
		
		
			for (int i = 0; i < m.length; i++) {
				for (j = 0; j < m[i].length; j++) {
					if (m[i][j] > mayor) {
						mayor = m[i][j];
						M1 = i;
						M2 = j;
					}
					if (m[i][j] < menor) {
						menor = m[i][j];
						m1 = i;
						m2 = j;
					}
	
				}
			}
		
				System.out.println("El mayor n�mero es el: " + m[M1][M2]);
				System.out.println("Se encuentra en la posici�n [" + M1 + "][" + M2 + "]");
				System.out.println("El menor n�mero es el: " + m[m1][m2]);
				System.out.println("Se encuentra en la posici�n [" + m1 + "][" + m2 + "]");

		}
	}


