package clinica;

import java.util.Arrays;
import java.util.Scanner;

public class ColecaoPaciente {

	Paciente vetor[] = new Paciente[3];
	Paciente c = new Paciente();
	Scanner in = new Scanner(System.in);
	int aux = 0;
	int aux2;

	public void cadastrarPaciente() {
		for (int i = 0; i < vetor.length; i++) {
			Paciente c = new Paciente();
			System.out.print("Digite um nome: ");
			c.setNome(in.next());
			System.out.print("Digite seu rg: ");
			c.setRg(in.next());
			System.out.print("Digite seu idade: ");
			c.setIdade(in.next());
			vetor[i] = c;
			aux = i + 1;
			System.out.println();

			if (i == vetor.length - 1) {
				aumentaArray();
				aux2 = i;
				break;

			}

		}

	}

	public void listarPaciente() {
		System.out.println("Lista de Paciente: ");
		System.out.println(Arrays.toString(vetor));
		System.out.println();

	}

	public void cadastrarPacientePorPosicao() {
		System.out.println();
		System.out.print("Digite a posição que você quer colocar: ");
		int pos = in.nextInt();

		for (int cont = aux - 1; cont >= pos; cont--) {

			vetor[cont + 1] = vetor[cont];

		}

		System.out.print("Digite um nome: ");
		c.setNome(in.next());
		System.out.print("Digite o Rg: ");
		c.setRg(in.next());
		System.out.print("Digite o Idade: ");
		c.setIdade(in.next());
		vetor[pos] = c;
		
	}

	public void removerPacientePorPosicao() {

		System.out.print("Digite a posição que você quer remove: ");
		int pos = in.nextInt();

		System.out.println();

		for (int cont = pos; cont < vetor.length - 1; cont++) {

			vetor[pos] = vetor[pos + 1];
			pos++;

		}

	}

	public void procurarPacientePorPosicao() {


		System.out.print("Digite o nome da posicão que deseja procurar: ");
		int posi = in.nextInt();

				System.out.println();
				System.out.println("---------------------------------");
				System.out.println("Paciente: ");
				System.out.println("nome : " + vetor[posi].getNome());
				System.out.println("Idade: " + vetor[posi].getIdade());
				System.out.println("Rg: " + vetor[posi].getRg());
				System.out.println("---------------------------------");
				System.out.println();

		
	}

	public void procurarPacientePorNome() {

		System.out.print("Digite o nome do Paciente que você deseja procurar: ");
		String nome = in.next();

		for (int cont = 0; cont < aux; cont++) {
			if (nome.equals(vetor[cont].getNome())) {

				System.out.println();
				System.out.println("---------------------------------");
				System.out.println("Conta: ");
				System.out.println("nome : " + vetor[cont].getNome());
				System.out.println("Idade: " + vetor[cont].getIdade());
				System.out.println("Rg: " + vetor[cont].getRg());
				System.out.println("---------------------------------");
				System.out.println();

			}

		}

	}

	public void tamanho() {
		
		int tamanho = aux;
		System.out.println("Possuem:" + tamanho + " pacientes");
		
	}

	public void aumentaArray() {

		Paciente newVetor[] = new Paciente[this.vetor.length + 5];

		System.arraycopy(this.vetor, 0, newVetor, 0, this.vetor.length);

		this.vetor = newVetor;

	}

}
