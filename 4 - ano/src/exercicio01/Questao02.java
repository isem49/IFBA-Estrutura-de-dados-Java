package exercicio01;

import java.util.Scanner;

public class Questao02 {

	public static void main(String[] args) {
		
		int anoNascimento;
		int anoAtual;
		int calcIdade;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Digite o seu ano de nascimento: ");
		anoNascimento = input.nextInt();
		System.out.print("Digite o ano atual: ");
		anoAtual = input.nextInt();
		
		calcIdade = anoAtual - anoNascimento;
		
		System.out.print("Sua idade é: " + calcIdade);
		
		
		
	}

}
