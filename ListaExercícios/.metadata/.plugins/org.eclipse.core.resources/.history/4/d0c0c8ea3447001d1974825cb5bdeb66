package lista1.logica22;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double lado;
		
		System.out.println("---Área de um losango---");
		
		System.out.print("\nDigite o tamanho do lado do losango: ");
		lado = sc.nextDouble();
		
		double diagonalMaior = (lado*lado) + (lado*lado) - 2 * lado * lado * Math.cos(120);
		double diagonalMenor = (lado*lado) + (lado*lado) - 2 * lado * lado * Math.cos(60);
		
		double area = (diagonalMaior * diagonalMenor) / 2;
		
		System.out.printf("A área do losango é: %.2f", area);
		
		sc.close();
	}

}
