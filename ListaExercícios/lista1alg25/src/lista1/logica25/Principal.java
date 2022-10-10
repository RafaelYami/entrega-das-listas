package lista1.logica25;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double raio;
		double altura;
		
		System.out.println("---Volume de uma lata de óleo---");
		
		System.out.print("\nDigite o raio da lata: ");
		raio = sc.nextDouble();
		System.out.print("\nDigite a altura da lata: ");
		altura = sc.nextDouble();
		
		double volume = 3.14159 * (raio*raio) * altura;
		
		System.out.printf("Volume da lata: %.2f", volume);
		
		sc.close();
	}

}
