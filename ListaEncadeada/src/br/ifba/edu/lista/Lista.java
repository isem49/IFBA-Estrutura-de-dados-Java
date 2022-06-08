package br.ifba.edu.lista;

import javax.swing.JOptionPane;

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
		} else {

			Celula nova = new Celula(obj);
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
	
	public Boolean verificarPos (int pos) {
		
		return pos >= 0 && pos < this.totalElementos;
	}

	public void adicionaPos(int pos, Object obj) {
		Celula aux = this.cabeca;

		if (pos == 0) {
			this.adicionaNoComeco(obj);
		} else if (pos == this.totalElementos) {

			this.adicionaNoF(obj);

		} else {
			
			if(!this.verificarPos(pos)) {
				JOptionPane.showMessageDialog(null,"A posição digitada é invalida",null,JOptionPane.ERROR_MESSAGE);
				throw new IllegalAccessError("A posiçao digitada é invalida");
				
			}
			
			for (int i = 0; i < pos - 1; i++) {
				aux = aux.getProxima();
			}

		}

		Celula nova = new Celula(aux.getProxima(), obj);
		aux.setProxima(nova);
		this.totalElementos++;

	}

	public void removeP() {
		Celula aux = this.cabeca;
		this.cabeca = this.cabeca.getProxima();
		
		aux.setProxima(null);
		totalElementos --;
		
	}
	
	
}
