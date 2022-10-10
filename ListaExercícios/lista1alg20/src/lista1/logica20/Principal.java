package lista1.logica20;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double a;
		double b;
		double c;
		
		System.out.println("---Calculo da diagonal de um paralelepípedo---");
		
		System.out.println("\nDigite o tamanho dos 3 lados do paralelepípedo: ");
		a = sc.nextDouble();
		b = sc.nextDouble();
		c = sc.nextDouble();
		
		double diagonal = (a*a) + (b*b) + (c*c);
		
		System.out.printf("Diagonal: %.2f", diagonal);
		
		sc.close();
	}

}
