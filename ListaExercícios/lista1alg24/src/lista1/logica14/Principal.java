package lista1.logica14;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double grausC;
		
		System.out.print("Graus Celsius: ");
		grausC = sc.nextDouble();
		
		double grausF = (grausC*9/5) + 32;
		
		System.out.printf("\nConversão para Fahrenheit: %.1f", grausF);
		
		sc.close();
	}

}
