package lista1.logica21;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double base;
		double altura;
		
		System.out.println("---Área do triângulo---");
		
		System.out.print("\nDigite o tamanho da base: ");
		base = sc.nextDouble();
		System.out.print("Digite o tamanho da altura: ");
		altura = sc.nextDouble();
		
		double diagonal = base * altura / 2;
		
		System.out.printf("A diagonal do triângulo é: %.2f", diagonal);
		
		sc.close();
	}

}
