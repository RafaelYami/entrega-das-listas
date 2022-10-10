package lista1.logica23;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String nome;
		int idade;
		
		System.out.println("Digite seu nome e idade: ");
		nome = sc.nextLine();
		idade = sc.nextInt();
		
		System.out.println("\nNome: " + nome + "\nIdade: " + idade + " anos");
		
		sc.close();
	}

}
