package metodo;

import java.util.Scanner;

public class Exemplo01 {
	public static void main(String[] args) {	
		int anoDeNascimento;
		Scanner input = new Scanner(System.in);
		
		System.out.print("Digite o ano que voce nasceu: ");
		anoDeNascimento = input.nextInt();
		
		calcIdade(anoDeNascimento);	
	}
	
	public static void calcIdade(int anoDeNascimento) {
		int idade = 2021 - anoDeNascimento;
		System.out.print("Sua idade e: " + idade);
	}	
}