package lista1.logica7;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		
		try {
		
		int numero;
		int antecessor;
		int sucessor;
		
		System.out.print("Digite um número inteiro: ");
		numero = sc.nextInt();
		
		antecessor = numero - 1;
		sucessor = numero + 1;
		
		System.out.println("Você digitou: " + numero);
		System.out.println("Antecessor: " + antecessor);
		System.out.println("Sucessor: " + sucessor);
		
		}catch(InputMismatchException exception) {
			System.out.println("Este não é um número INTEIRO!");
		}
		
		sc.close();
		
	}

}
