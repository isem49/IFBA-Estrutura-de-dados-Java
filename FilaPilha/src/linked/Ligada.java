package linked;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

import basica.Contato;

public class Ligada {

	Queue<Contato> lista = new LinkedList<Contato>();

	public void inserir(Contato e) {

		lista.add(e);

	}

	public void remover() {

		System.out.println(lista.remove());

	}

	public void verificar() {

		System.out.println(lista.size());

	}

	public void inverter() {

		Stack<Contato> s = new Stack<Contato>();
		
		for(int cont = 0; cont <= lista.size(); cont++  ) {
			
			s.push(lista.remove());
			
		}
		
		for(int cont = 0; cont <= s.size(); cont++  ) {
			
			lista.add(s.pop());
			
		}
		
		
	}

	public void mostrar() {

		System.out.println(lista.toString());

	}

}
