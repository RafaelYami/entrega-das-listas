package lista1.logica12;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double n1;
		double n2;
		
		System.out.println("Digite dois números reais: ");
		n1 = sc.nextDouble();
		n2 = sc.nextDouble();
		
		double media = n1 + n2 / 2;
		
		System.out.println("Média: " + media);
		
		sc.close();
	}

}
