package lista1.logica15;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double salarioMinimo = 1212;
		double quilowatt;
		double valorQuilowatt = salarioMinimo / 7 / 100;
		
		System.out.printf("Valor em reais de cada quilowatt: R$%.2f", valorQuilowatt);
		
		System.out.print("\n\nDigite quantos quilowatts foram gastos na residência: ");
		quilowatt = sc.nextDouble();
		
		double valorASerPago = valorQuilowatt * quilowatt * 0.9;
		
		System.out.printf("Valor a ser pago: R$%.2f", valorASerPago);
		
		sc.close();
	}

}
