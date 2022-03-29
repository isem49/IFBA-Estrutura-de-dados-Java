package heranca;

import java.util.Date;


public class Cadastro {

	public static void main(String[] args) {
		
		Livro p1 = new Livro(1, "Java: Como Programar", "Pearson Universidades", "Paul Deitel, Harvey Deitel");
		
		Aluno p2 = new Aluno(2, "Junior", "555.555.555-42", "55555", "201810070030");
		
		Funcionario p3 = new Funcionario(3, "Ricardo", "444.444.444-44", "44444", 500, "atender");
		
		Emprestimo p4 = new Emprestimo(4, new Date(), new Date(), p1, p2, p3);
		
		System.out.println("Id: " + p4.getLivro().getId());
		System.out.println("nome: " + p4.getLivro().getNome());
		System.out.println("Editora " + p4.getLivro().getEditora());
		System.out.println("Autor " + p4.getLivro().getAutor());
		System.out.println();
		
		System.out.println("id: " + p4.getAluno().getId());
		System.out.println("Nome: " + p4.getAluno().getNome());
		System.out.println("Cpf: " + p4.getAluno().getCpf());
		System.out.println("Rg: " + p4.getAluno().getRg());
		System.out.println("Matricula: " + p4.getAluno().getMatricula());
		System.out.println();

		System.out.println("id: " + p4.getFuncionario().getId());
		System.out.println("Nome: " + p4.getFuncionario().getNome());
		System.out.println("Cpf: " + p4.getFuncionario().getCpf());
		System.out.println("Rg: " + p4.getFuncionario().getRg());
		System.out.println("Salario: " + p4.getFuncionario().getSalario());
		System.out.println("Funcao: " + p4.getFuncionario().getFuncao());
		System.out.println();


	}

}
