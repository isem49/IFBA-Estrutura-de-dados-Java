package linked;

import java.util.LinkedList;
import java.util.Stack;

import basica.Contato;

public class Ligada {

	Stack<Contato> f = new Stack<Contato>();
	
	public void inserir(Contato e) {
	
		f.push(e);
		
	}
	
	public void remover() {
		
		System.out.println(f.pop());
		
	}

	public void verificar() {
		
		System.out.println(f.size());
		
	}
	
	
	public void mostrar() {
		
		System.out.println(f.toString());
		
	}

}
