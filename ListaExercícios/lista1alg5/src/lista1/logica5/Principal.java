package lista1.logica5;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		try {
		
		int numero;
		
		System.out.print("Digite um número inteiro: ");
		numero = sc.nextInt();
		
		System.out.println("Você digitou: " + numero);
		
		}catch(InputMismatchException exception) {
			System.out.println("Este não é um número INTEIRO!");
		}
		
		sc.close();
	}

}
