package lista1.logica10;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		
		try {
		
		int n1;
		int n2;
		
		System.out.print("Digite dois números inteiros: ");
		n1 = sc.nextInt();
		n2 = sc.nextInt();
		
		int produto = n1 * n2;
		
		System.out.println("Produto: " + produto);
		
		}catch(InputMismatchException exception) {
			System.out.println("Este não é um número INTEIRO!");
		}
		
		sc.close();

	}

}
