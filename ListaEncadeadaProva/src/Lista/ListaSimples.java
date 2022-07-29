package Lista;

import javax.swing.JOptionPane;

public class ListaSimples {

	private Celula cabeca;
	private Celula cauda;

	private int totalElementos = 0;

	// ADICIONAR NO COMEÇO
	public void adicionaNoComeco(Object obj) {

		Celula nova = new Celula(this.cabeca, obj);
		this.cabeca = nova;

		if (totalElementos == 0) {
			this.cauda = nova;
		}

		this.totalElementos++;
	}

	// ADICIONAR NO FIM
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

	// VERIFICAR POSIÇÃO:
	public boolean verificar(int pos) {
		
		return pos >= 0 && pos < this.totalElementos;
		
	}

	// ADICIONAR POR POSIÇÃO
	public void adicionaPos(int pos, Object obj) {
		
		if (pos == 0) {
			
			this.adicionaNoComeco(obj);
			
		} 
		else if (pos == this.totalElementos) {
			
			this.adicionaNoF(obj);
			
		} 
		else if (!this.verificar(pos)) {
			
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

	public void removeDoComeco() {
		
		Celula aux = this.cabeca;
		this.cabeca = this.cabeca.getProxima();
		aux.setProxima(null);
		this.totalElementos--;
		
	}

	public void removeF() {
	
		Celula aux = this.cabeca;

		for (int i = 0; i < this.totalElementos - 1; i++) {
			aux = aux.getProxima();
		}
		this.cauda = aux;
		
	}

	public void removePos(int pos) {
		if (pos == 0) {
			
			this.removeDoComeco();
			
		} 
		else if (pos == this.totalElementos) {
			
			this.removeF();
			
		} 
		else if (!this.verificar(pos)) {
			
			JOptionPane.showMessageDialog(null, "Posição Inválida", null, JOptionPane.ERROR_MESSAGE);
			throw new IllegalArgumentException("A posição digitada é inválida");
			
		} 
		else {
			
			Celula aux = this.cabeca;

			for (int i = 0; i < pos - 1; i++) {
				
				aux = aux.getProxima();
				
			}

			aux.setProxima(aux.getProxima().getProxima());
			aux.getProxima();
			this.totalElementos--;
		}
	}
	
	//Imprimir
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
