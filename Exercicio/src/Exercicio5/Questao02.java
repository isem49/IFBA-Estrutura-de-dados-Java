package Exercicio5;

import java.util.Scanner;

public class Questao02 {

	public static void main(String[] args) {
		
		String seuNome;
		int anoNascimento;
		int idade;
		
		Scanner input = new Scanner(System.in);

		
		System.out.print("Digite seu nome: ");
		seuNome= input.nextLine();
		
		System.out.print("digite o ano que vc nasceu: ");
		anoNascimento = input.nextInt();

		
		idade = 2021 - anoNascimento;
		
		
		System.out.println("\nOlá " + seuNome + " sua idade é: " + idade );
		

		
	}

}
