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

	public void adicionarPos(int pos, Contato c) {

		if (!this.verificarPos(pos)) {

			System.out.println("Posição inválida");

		} else if (lista.isEmpty()) {

			this.adicionarNoInicio(c);

		} else {

			lista.add(pos, c);

		}

	}

	public void remove() {

		if (lista.isEmpty()) {

			System.out.println("Lista está vazia");

		} else {

			System.out.println("Elemento removido: " + lista.removeFirst()); 


		}

	}

	public void removeF() {

		if (lista.isEmpty()) {

			System.out.println("Lista está vazia");

		} else {

			System.out.println("Elemento removido: " + lista.removeLast()); 

		}

	}

	public void removePos(int pos) {

		if (!this.verificarPos(pos)) {

			System.out.println("Posição inválida");

		} else if (lista.isEmpty()) {

			System.out.println("Lista está vazia");

		} else {

			lista.remove(pos);

		}

	}
	
	public void imprimir() {
		
		
		System.out.println(lista.toString());
		
	}

	public boolean verificarPos(int pos) {

		return pos >= 0 || pos < lista.size();

	}
	

}
