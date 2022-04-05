package exercicio;

import java.util.Arrays;
import java.util.Scanner;

public class CadastrarConta {

	Conta vetor[] = new Conta[10];
	Conta c = new Conta();
	Scanner in = new Scanner(System.in);
	int aux = 0;

	public void procuraConta() {

		System.out.println();
		System.out.print("Digite o nome que você quer procurar: ");
		String nome = in.next();

		for (int cont = 0; cont < aux; cont++) {
			if (nome.equals(vetor[cont].getNome())) {

				System.out.println();
				System.out.println("---------------------------------");
				System.out.println("Conta: ");
				System.out.println("nome da conta: " + vetor[cont].getNome());
				System.out.println("Valor da conta: " + vetor[cont].getValor());
				System.out.println("---------------------------------");

			}
			
		}
	}

	public void listarConta() {

		System.out.println("Contas Cadastradas: ");
		for (int cont = 0; cont <= 3; cont++) {

			System.out.println();
			System.out.println("---------------------------------");
			System.out.println("Conta: ");
			System.out.println("Nome: " + vetor[cont].getNome());
			System.out.println("Valor: " + vetor[cont].getValor());
			System.out.println("---------------------------------");

		}

	}

	public void addPos() {

		System.out.println("Digite a posição que você quer colocar: ");
		int pos = in.nextInt();

		for (int cont = aux - 1; cont >= pos; cont--) {

			vetor[cont + 1] = vetor[cont];

		}

		System.out.print("Digite um nome: ");
		c.setNome(in.next());
		System.out.print("Digite o valor da conta: ");
		c.setValor(in.nextInt());
		vetor[pos] = c;

	}

	public void adicionarConta() {
		for (int i = 0; i < 3; i++) {

			Conta c = new Conta();
			System.out.print("Digite um nome: ");
			c.setNome(in.next());
			System.out.print("Digite o valor da conta: ");
			c.setValor(in.nextInt());
			vetor[i] = c;
			aux = i+1;
		}

	}

}