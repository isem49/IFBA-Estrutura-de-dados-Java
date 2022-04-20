package exercicio17;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Servico s = new Servico();
		Scanner in = new Scanner(System.in);

		
		s.adicionarConta();
		s.addPos();
		s.listarConta();
		s.procuraConta();
		s.remPos();
		s.listarConta();
		
		
		
		

	}

}
