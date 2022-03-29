package introducao;

import java.util.Scanner;

public class Questao02 {

	public static void main(String[] args) {
		
		float nota1;
		float nota2;
		float nota3;
		int qtdNotas = 3;
		String nomeAluno;
	
		Scanner input = new Scanner(System.in);
		
		System.out.print("Digite a nota 1: ");
		nota1 = input.nextFloat();
		
		System.out.print("Digite a nota 2: ");
		nota2 = input.nextFloat();
		
		System.out.print("Digite a nota 3: ");
		nota3 = input.nextFloat();
		
		input.nextLine();
		
		System.out.print("Digite o nome do aluno: ");
		nomeAluno = input.nextLine();
		
		float mediaNotasAluno;

		mediaNotasAluno = ( nota1 + nota2 + nota3 ) / qtdNotas;
 
		System.out.println("\nOlá " +nomeAluno + " Sua media foi " + mediaNotasAluno );

		
	}

}
