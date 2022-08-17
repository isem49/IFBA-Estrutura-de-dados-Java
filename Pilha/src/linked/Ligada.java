package linked;

import java.util.LinkedList;




import basica.Contato;

public class Ligada {
	
	LinkedList<Contato> lista = new LinkedList<>();

	public void adicionarNoInicio(Contato c) {

		lista.addFirst(c);

	}

	public void adicionarFim(Contato c) {

		if (lista.isEmpty()) {

			this.adicionarNoInicio(c);

		} else {

			lista.addLast(c);

		}

	}

	public void removeF() {

		if (lista.isEmpty()) {

			System.out.println("Lista est� vazia");

		} else {

			System.out.println("Elemento removido: " + lista.removeLast());

		}

	}


	public void verificar() {
		
		
			System.out.println("A lista possui " + lista.size() + " elementos");
		
	}

	public void imprimir() {

		System.out.println(lista.toString());

	}

	

}
