package Tema2;

public class ejercicio8 {
	public static void main(String[] args) {
		char nameInitial = 'E';
		String name = "Elisa";
		char lastnameInitial = 'R';
		String lastname = "Rodríguez";
		char lastname2Initial = 'V';
		String lastname2 = "Villa";
		char sex = 'F';
		String female = "F";
		char maritalstatus = 'S';
		String single = "S";

		// El problema que surge es intentar concatenar una serie de chars, ya que son
		// códigos ASCII y por lo tanto
		// Eclipse lo procesa como un número y pretende sumarlos (de ahí que quiera
		// cambiar de String a int)

		// Por eso he intentado hacer esto, durante mucho rato y de manera infructuosa:
		// lastnameInitial = lastname.charAt(0);
		// lastname2Initial = lastname2.charAt(0);
		// sex = female.charAt(0);
		// maritalstatus = single.charAt(0);

		// Al final, la solución más sencilla es introducir una cadena de caracteres sin
		// contenido entre las
		// variables o bien
		// introducirlo al principio del String.

		System.out.println(nameInitial + "" + lastnameInitial + lastname2Initial + sex + maritalstatus);

	}
}
