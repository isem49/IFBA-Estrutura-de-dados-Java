package exercicio18;

import java.util.Arrays;
import java.util.Scanner;

public class Servico {

	Contato vetor[] = new Contato[3];
	Contato c = new Contato();
	Scanner in = new Scanner(System.in);
	int aux = 0;
	int aux2;

	public void adicionarConta() {
		for (int i = 0; i < vetor.length; i++) {
			Contato c = new Contato();
			System.out.print("Digite um nome: ");
			c.setNome(in.next());
			System.out.print("Digite seu numero: ");
			c.setNumero(in.next());
			vetor[i] = c;
			aux = i + 1;
			System.out.println();

			if (i == vetor.length - 1) {
				aumentaVetor();
				aux2 = i;
				break;

			}

		}

	}

	public void addPos() {
		System.out.print("Deseja adicionar uma nova conta em uma posição? ");
		String addCN = in.next(); // addCN adiciona nova conta
		System.out.println();

		while (addCN.equalsIgnoreCase("Sim") || addCN.equalsIgnoreCase("S")) {
			Contato c = new Contato();
			System.out.print("Digite a posição que você quer colocar: ");
			int pos = in.nextInt();

			for (int cont = aux - 1; cont >= pos; cont--) {

				vetor[cont + 1] = vetor[cont];

			}

			aux = aux + 1;
			System.out.println();
			System.out.print("Digite um nome: ");
			c.setNome(in.next());
			System.out.print("Digite o valor da conta: ");
			c.setNumero(in.next());
			vetor[pos] = c;
			System.out.println();

			System.out.print("Deseja adicionar outra conta? ");
			addCN = in.next();
			System.out.println();

			aux2 = aux2 + 1;
			if (aux2 == vetor.length - 1)
				aumentaVetor();

		}
		System.out.println();
	}

	public void procuraConta() {
		System.out.print("Deseja procurar uma conta? ");
		String p = in.next();
		System.out.println();

		while (p.equalsIgnoreCase("Sim") || p.equalsIgnoreCase("S")) {
			System.out.print("Digite o nome da conta que você deseja procurar: ");
			String nome = in.next();
			int verificador = 0;

			for (int cont = 0; cont < aux; cont++) {
				if (nome.equals(vetor[cont].getNome())) {

					System.out.println();
					System.out.println("---------------------------------");
					System.out.println("Conta: ");
					System.out.println("nome : " + vetor[cont].getNome());
					System.out.println("numero: " + vetor[cont].getNumero());
					System.out.println("---------------------------------");
					System.out.println();
					verificador = 1;

				}

			}

			if (verificador != 1) {
				System.out.println();
				System.out.println("Não existe nenhuma conta com esse nome");
				System.out.println();

			}

			System.out.print("Deseja procurar outra conta? ");
			p = in.next();
			System.out.println("");

		}
	}

	public void listarConta() {

		System.out.println("Lista de contas: ");
		System.out.println(Arrays.toString(vetor));
		System.out.println();
	}

	public void aumentaVetor() {

		Contato newVetor[] = new Contato[this.vetor.length + 5];

		System.arraycopy(this.vetor, 0, newVetor, 0, this.vetor.length);

		this.vetor = newVetor;

	}
	
	public void diminuirVetor() {

		Contato newVetor[] = new Contato[aux];

		System.arraycopy(this.vetor, 0, newVetor, 0, aux);

		this.vetor = newVetor;

	}
	
	
	

	public void removePos() {
		System.out.print("Deseja remove uma posição? ");
		String confirmaR = in.next();
		System.out.println();

		while (confirmaR.equalsIgnoreCase("sim") || confirmaR.equalsIgnoreCase("s")) {
			System.out.print("Digite a posição que você quer remove: ");
			int pos = in.nextInt();

			System.out.println();

			for (int cont = pos; cont < vetor.length - 1; cont++) {

				vetor[pos] = vetor[pos + 1];
				pos++;

			}

			System.out.print("Deseja remover outra posição? ");
			confirmaR = in.next();
			System.out.println();

		}
		System.out.println();
		
		diminuirVetor();
		
	}

}