package exercicio17;

import java.util.Arrays;
import java.util.Scanner;


public class Servico {
	
	Contato vetor[] = new Contato[3];
	Contato c = new Contato();
	Scanner in = new Scanner(System.in);
	int aux = 0;
	
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

			
			if(i == vetor.length-1) {
				aumentaVetor();
				break;
				
			} 
			
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
		c.setNumero(in.next());
		vetor[pos] = c;

	}
	
	
	public void procuraConta() {

		System.out.println();
		System.out.print("Digite o nome que você quer procurar: ");
		String nome = in.next();

		for (int cont = 0; cont < aux; cont++) {
			if (nome.equals(vetor[cont].getNome())) {

				System.out.println();
				System.out.println("---------------------------------");
				System.out.println("Conta: ");
				System.out.println("nome : " + vetor[cont].getNome());
				System.out.println("numero: " + vetor[cont].getNumero());
				System.out.println("---------------------------------");

			}

		}
	}
	
	public void listarConta() {	
		System.out.println();
		System.out.println(Arrays.toString(vetor));

	}
	
	public void aumentaVetor() {

		Contato newVetor[] = new Contato[this.vetor.length + 5];

		System.arraycopy(this.vetor, 0, newVetor, 0, this.vetor.length);

		this.vetor = newVetor;

	}
	
	
	
}
