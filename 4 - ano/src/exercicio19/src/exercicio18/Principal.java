package exercicio18;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Servico s = new Servico();
		Scanner in = new Scanner(System.in);

		
		s.adicionarConta();
		s.procuraConta();
		s.listarConta();
		s.addPos();
		s.listarConta();
		s.procuraConta();
		s.removePos();
		s.listarConta();
	
	}

}