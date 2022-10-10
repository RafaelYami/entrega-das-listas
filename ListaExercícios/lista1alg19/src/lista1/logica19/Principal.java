package lista1.logica19;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double lado;
		
		System.out.print("Digite o lado do quadrado: ");
		lado = sc.nextDouble();
		
		double perimetro = lado * 4;
		double area = lado * lado;
		double diagonal = lado * (Math.sqrt(2));
		
		System.out.printf("Perímetro: %.2f", perimetro);
		System.out.printf("\nÁrea: %.2f", area);
		System.out.printf("\nDiagonal: %.2f", diagonal);
		
		sc.close();
	}

}
