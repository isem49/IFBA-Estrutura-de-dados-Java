package metodo;

import java.util.Scanner;

public class Exemplo02 {
	public static void main(String[] args) {	
		int anoDeNascimento;
		Scanner input = new Scanner(System.in);
		
		System.out.print("Digite o ano que voce nasceu: ");
		anoDeNascimento = input.nextInt();
		
		calcIdade (anoDeNascimento);
		int idade = calcIdade (anoDeNascimento);

		System.out.println("Sua idade e: " + idade);
	}
	
	public static int calcIdade(int idade) {
		return (2021 - idade);
		
	}	

}
