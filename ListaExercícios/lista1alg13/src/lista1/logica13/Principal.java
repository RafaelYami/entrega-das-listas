package lista1.logica13;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double n1;
		double n2;
		double n3;
		double n4;
		
		int p1 = 1;
		int p2 = 2;
		int p3 = 3;
		int p4 = 4;
		
		System.out.println("Digite quatro números: ");
		n1 = sc.nextDouble();
		n2 = sc.nextDouble();
		n3 = sc.nextDouble();
		n4 = sc.nextDouble();
		
		double mp = ((n1 * p1) + (n2 * p2) + (n3 * p3) + (n4 * p4) / p1 + p2 + p3 + p4);
		
		System.out.println("A média é: " + mp);
		
		sc.close();
	}

}
