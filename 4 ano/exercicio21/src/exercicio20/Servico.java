package exercicio20;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Servico {

	ArrayList<Contato> servico = new ArrayList<Contato>();
	Scanner in = new Scanner(System.in);
	int aux = 0;

	public void cadastrar(Contato c) {
		
		servico.add(c);

	}

	
	public void cadastrarPos(int pos, Contato c) {
		
	
		servico.add(pos, c);

		
	}
	
	public void remove() {	
		servico.remove(	servico.size()-1);
	}
	

	public void removePos(int pos) {	
		servico.remove(pos);
	}

	public void listarConta() {
		System.out.println(servico);

	}

	
	

}