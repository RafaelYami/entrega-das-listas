package lista1.logica11;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		
		double n1;
		
		System.out.print("Digite um número real: ");
		n1 = sc.nextDouble();
		
		double tp = n1 / 3;
		
		System.out.print("A terça parte deste número é: " + tp);
		
		
		sc.close();


	}

}
