package linked;

import java.util.LinkedList;
import java.util.Queue;

import basica.Contato;

public class Ligada {

	Queue <Contato> f = new LinkedList<Contato>();
	
	public void inserir(Contato e) {
	
		f.add(e);
		
	}
	
	public void remover() {
		
		System.out.println(f.remove());
		
	}

	public void verificar() {
		
		System.out.println(f.size());
		
	}
	
	
	public void mostrar() {
		
		System.out.println(f.toString());
		
	}

}
