package exercicio;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		CadastrarConta cc = new CadastrarConta();
		Scanner in = new Scanner(System.in);

		cc.adicionarConta();
		cc.addPos();
		cc.listarConta();
		cc.procuraConta();
		

	}

}