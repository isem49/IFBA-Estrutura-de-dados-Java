package metodo;

import java.util.Scanner;

public class TesteMetodo {

	public static void main(String[] args) {
		int dataNascimento, anoAtual;
		Scanner input = new Scanner(System.in);
		
		System.out.print("Diga seu ano de nascimento: ");
		dataNascimento = input.nextInt();
		
		System.out.print("Diga o ano atual: ");
		anoAtual = input.nextInt();
		
		int idade = MatematicaUtil.calcularIdade(anoAtual,dataNascimento );
		System.out.println("Sua idade e: " + idade);
	}

}
