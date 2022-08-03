package lista;

import javax.swing.JOptionPane;

import basica.Celula;

public class Lista {

	private Celula cabeca;
	private Celula cauda;

	private int totalElementos = 0;

	// METODO PARA ADICIONAR UM ATRIBUTO NA PRIMEIRA POSI��O
	public void adicionaNoComeco(Object obj) {

		Celula nova = new Celula(null, this.cabeca, obj);
		this.cabeca = nova;

		if (totalElementos == 0) {
			this.cauda = nova;
		}

		this.totalElementos++;

	}

	// METODO PARA ADICIONAR UM ATRIBUTO NA POSI��O FINAL
	public void adicionaNoF(Object obj) {

		if (this.totalElementos == 0) {

			this.adicionaNoComeco(obj);
		} else {

			Celula nova = new Celula(obj);
			this.cauda.setProxima(nova);
			nova.setAnterior(cauda);
			this.cauda = nova;
			this.totalElementos++;

		}
	}

	// METODO PARA IMPRIMIR
	public String toString() {

		if (this.totalElementos == 0) {

			return "[]";
		}

		StringBuilder listaencadeada = new StringBuilder("[");
		Celula atual = this.cabeca;

		for (int i = 0; i < this.totalElementos - 1; i++) {

			listaencadeada.append(atual.getObjeto());
			listaencadeada.append(",");
			atual = atual.getProxima();
		}

		listaencadeada.append(atual.getObjeto());
		listaencadeada.append("]");

		return listaencadeada.toString();

	}

	// METODO PARA VERIFICAR SE A POSISÃO
	public Boolean verificarPos(int pos) {

		return pos >= 0 && pos < this.totalElementos;

	}

	// METODO PARA ADICIONAR POR POSISÃO
	public void adicionaPos(int pos, Object obj) {

		if (pos == 0) {

			this.adicionaNoComeco(obj);

		} else if (pos == this.totalElementos) {

			this.adicionaNoF(obj);

		} else if (!this.verificarPos(pos)) {

			JOptionPane.showMessageDialog(null, "Posisao Invalida", null, JOptionPane.ERROR_MESSAGE);
			throw new IllegalArgumentException("A posisao digitada é invalida");

		} else {

			Celula aux = this.cabeca;

			for (int i = 0; i < pos - 1; i++) {

				aux = aux.getProxima();
			}

			Celula nova = new Celula(obj);
			nova.setProxima(aux.getProxima());
			nova.setAnterior(aux);
			aux.getProxima().setAnterior(nova);
			aux.setProxima(nova);
			this.totalElementos++;

		}
	}

	// METODO PARA REMOVER A PRIMEIRA POSI��O
	public void removeDoComeco() {

		Celula aux = this.cabeca;
		this.cabeca = this.cabeca.getProxima();

		aux.setProxima(null);
		this.cabeca.setAnterior(null);
		totalElementos--;

	}

	// METODO PARA REMOVER A ULTIMA POSI��O
	public void removeF() {

		
		// tbm funcionou
		/*
		 
		 Celula aux = this.cabeca;

		for (int i = 0; i < this.totalElementos - 2; i++) {
			aux = aux.getProxima();
		}

		aux.setProxima(null);
		this.cauda = aux;
		this.cauda.setAnterior(aux);
		totalElementos--;
		
		*/
		
		this.cauda = cauda.getAnterior();
		this.cauda.setProxima(null);
		totalElementos--;
	}

	public void removePos(int pos) {

		if (pos == 0) {

			this.removeDoComeco();

		} else if (pos == this.totalElementos) {

			this.removeF();
			;

		} else if (!this.verificarPos(pos)) {

			JOptionPane.showMessageDialog(null, "Posisao Invalida", null, JOptionPane.ERROR_MESSAGE);
			throw new IllegalArgumentException("A posisao digitada e invalida");

		} else {

			Celula aux = this.cabeca;

			for (int i = 0; i < pos - 1; i++) {

				aux = aux.getProxima();

			}

			aux.setProxima(aux.getProxima().getProxima());
			aux.getProxima().getProxima().setAnterior(aux);
			this.totalElementos--;

		}

	}

	// imprimir Aula Igor
	public void imprimir() {
		Celula atual = this.cabeca;

		for (int i = 0; i < this.totalElementos; i++) {

			System.out.println(atual.getProxima());
			atual = atual.getProxima();

		}

	}
}