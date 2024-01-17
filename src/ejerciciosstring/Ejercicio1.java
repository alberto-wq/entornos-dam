package ejerciciosstring;

import java.util.Scanner;

public class Ejercicio1 {

	public static boolean esVocal( char car) {
		boolean esVocal=false;

		return esVocal;
	}

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		String cadena="";
		int numVocales=0;

		System.out.println("Por favor introduce la cadena de texto");
		cadena=sc.nextLine();
		for(int i=0; i<cadena.length();i++) {
			if (esVocal(cadena.charAt(i)))
				numVocales++;
		}

		System.out.println("El número de vocales es: " + numVocales);
		
		System.out.println("Estamos en método esVocal");
		
		boolean esVocal;
		if (true) esVocal = true;








	}

}
