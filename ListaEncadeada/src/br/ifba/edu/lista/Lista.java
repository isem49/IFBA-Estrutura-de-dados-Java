package br.ifba.edu.lista;

import javax.swing.JOptionPane;

import br.ifba.edu.basica.Celula;

public class Lista {

	private Celula cabeca;
	private Celula cauda;

	private int totalElementos = 0;
	
	
	//METODO PARA ADICIONAR UM ATRIBUTO NA PRIMEIRA POSIÇÃO
	public void adicionaNoComeco(Object obj) {
		
		Celula nova = new Celula(this.cabeca, obj);
		this.cabeca = nova;

		if (totalElementos == 0) {

			this.cauda = nova;

		}

		this.totalElementos++;

	}
	
	//METODO PARA ADICIONAR UM ATRIBUTO NA POSIÇÃO FINAL
	public void adicionaNoF(Object obj) {
		
		if (this.totalElementos == 0) {

			this.adicionaNoComeco(obj);
		}
		else {

			Celula nova = new Celula(obj);
			this.cauda.setProxima(nova);
			this.cauda = nova;
			this.totalElementos++;

		}
	}

	//METODO PARA IMPRIMIR
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

	//METODO PARA VERIFICAR SE A POSIÇÃO 
	public Boolean verificarPos(int pos) {

		return pos >= 0 && pos < this.totalElementos;
	}

	
	//METODO PARA ADICIONAR POR POSIÇÃO
	public void adicionaPos (int pos, Object obj) {			
		
		if (pos == 0) {
			
			this.adicionaNoComeco(obj);
			
		} 
		else if (pos == this.totalElementos) {
			
			this.adicionaNoF(obj);
			
		}
		else if (!this.verificarPos(pos)) {
			
			JOptionPane.showMessageDialog(null, "Posição Inválida", null, JOptionPane.ERROR_MESSAGE);
			throw new IllegalArgumentException("A posição digitada é inválida");
			
		}		
		else {		
			
			Celula aux = this.cabeca;
				
			for (int i = 0; i < pos - 1; i++) {			
				
				aux = aux.getProxima();			
			}		
			
			Celula nova = new Celula(aux.getProxima(), obj);
			aux.setProxima(nova);
			this.totalElementos++;
		}				
	}
	
	//METODO PARA REMOVER A PRIMEIRA POSIÇÃO
	public void removeDoComeco() {
		
		Celula aux = this.cabeca;
		this.cabeca = this.cabeca.getProxima();

		aux.setProxima(null);
		totalElementos--;

	}
	
	//METODO PARA REMOVER A ULTIMA POSIÇÃO
	public void removeF() {

		Celula aux = this.cauda;

		aux.setProxima(null);
		totalElementos--;

	}
	
	
	public void removePos (int pos) {			
		
		if (pos == 0) {
			
			this.removeDoComeco();
			
		} 
		else if (pos == this.totalElementos) {
			
			this.removeF();;
			
		}
		else if (!this.verificarPos(pos)) {
			
			JOptionPane.showMessageDialog(null, "Posição Inválida", null, JOptionPane.ERROR_MESSAGE);
			throw new IllegalArgumentException("A posição digitada é inválida");
			
		}		
		else {		
			
			Celula aux = this.cabeca;
			this.cabeca = this.cabeca.getProxima();

				
			for (int i = 0; i < pos - 1; i++) {		
				
				aux = aux.getProxima();			
				
			}		
			
			aux.setProxima(null);
			this.totalElementos--;
		}				
		
	}
	
}
