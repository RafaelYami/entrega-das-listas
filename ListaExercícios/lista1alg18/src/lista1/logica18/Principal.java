package lista1.logica18;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double raio;
		
		System.out.print("Digite o raio de um círculo: ");
		raio = sc.nextDouble();
		
		double perimetro = 2 * Math.PI * raio;
		double area = Math.PI * (raio * raio);
		
		System.out.printf("Perímetro: %.2f", perimetro);
		System.out.printf("\nÁrea: %.2f", area);
		
		sc.close();
	}

}
