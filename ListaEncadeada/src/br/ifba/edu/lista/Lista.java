package br.ifba.edu.lista;

import br.ifba.edu.basica.Celula;

public class Lista {

	private Celula cabeca;
	private Celula cauda;

	private int totalElementos = 0;

	public void adicionaNoComeco(Object obj) {
		Celula nova = new Celula(this.cabeca, obj);
		this.cabeca = nova;

		if (totalElementos == 0) {

			this.cauda = nova;

		}

		this.totalElementos++;

	}

	public void adicionaNoF(Object obj) {
		if (this.totalElementos == 0) {

			this.adicionaNoComeco(obj);
		} 
		else {

			Celula nova = new Celula(this.cauda, obj);
			this.cauda.setProxima(nova);
			this.cauda = nova;
			this.totalElementos++;

		}
	}

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

}
