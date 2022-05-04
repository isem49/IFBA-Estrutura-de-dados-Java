package exercicio20;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Servico s = new Servico();
		Scanner in = new Scanner(System.in);

		//ADICIONA CONTATO
		System.out.println("Adicione um contatos ");
		System.out.println();
		for (int i = 0; i < 3; i++) {
			Contato c = new Contato();
			System.out.print("Digite um nome: ");
			c.setNome(in.next());
			System.out.print("Digite seu numero: ");
			c.setNumero(in.next());	
			System.out.println();
			
			s.cadastrar(c);	

		}
		
		//ADICIONA UM CONTATO EM UMA POSIÇÃO ESPECIFICA
		System.out.print("Digite a posição que deseja adicionar posição: ");
		int pos = in.nextInt();
		System.out.println();
		Contato c = new Contato();
		System.out.print("Digite um nome: ");
		c.setNome(in.next());
		System.out.print("Digite seu numero: ");
		c.setNumero(in.next());	
		System.out.println();
		s.cadastrarPos(pos, c);
		
		
		//REMOVE A ULTIMA POSIÇÃO
		s.remove();
		
		
		//REMOVE UMA POSIÇÃO
		System.out.print("Digite a posição que você quer remove: ");
		int pos2 = in.nextInt();
		s.removePos(pos2);
		
				
		//LISTA TODOS OS CONTATOS
		s.listarConta();
		
	
		
		
	}

}

