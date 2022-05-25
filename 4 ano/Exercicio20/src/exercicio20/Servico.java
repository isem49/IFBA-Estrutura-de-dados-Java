package exercicio20;

import java.util.Arrays;
import java.util.Scanner;

public class Servico {

	Contato vetor[] = new Contato[3];
	Scanner in = new Scanner(System.in);
	int aux = 0;

	public void adicionarConta(Contato c) {

		vetor[aux] = c;
		aux++;

		if (aux == vetor.length) {
			aumentaVetor();
		}

	}

	
	public void addPos(int pos, Contato c) {
		
		for (int cont = aux - 1; cont >= pos; cont--) {
			vetor[cont + 1] = vetor[cont];
		}

		vetor[pos] = c;
		aux++;
	}
	
		

	public void procuraConta(String nome) {
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

	public void removePos(int pos) {
		

		for (int cont = pos; cont < vetor.length - 1; cont++) {
			
			vetor[pos] = vetor[pos + 1];
			pos++;
	

		}

		aux--;
		
	}
	
	public void tamanhoVetor() {
		
		System.out.println("Numeros de contatos: " + aux);
		
	}
	
	

}