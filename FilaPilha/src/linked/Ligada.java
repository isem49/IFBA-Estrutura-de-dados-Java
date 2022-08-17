package linked;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

import basica.Contato;

public class Ligada {

	Queue<Contato> lista = new LinkedList<Contato>();
	private int totalElmentos;

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
		
		
		while (lista.size() !=  0 ) {
			s.push(lista.remove()); 
		}
		
		
		while (s.size() != 0 ) {
			lista.add(s.pop()); 
		}
		
		
	}

	public void mostrar() {

		System.out.println(lista.toString());

	}

}
