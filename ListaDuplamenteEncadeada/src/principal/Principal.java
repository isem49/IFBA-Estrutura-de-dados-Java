package principal;

import javax.swing.JOptionPane;

import lista.Lista;

public class Principal {

	public static void main(String[] args) {

Lista lista = new Lista();
		
		
//adicionando valores
		lista.adicionaNoComeco("Igor");
		lista.adicionaNoComeco("Maria");
		lista.adicionaNoComeco("Fulano");
		lista.adicionaNoComeco("Sicrano");
		lista.adicionaNoComeco("Beltrano");
		lista.adicionaNoComeco("José");
		lista.adicionaNoComeco("Camila");
		lista.adicionaNoComeco("Helena");
		
		//imprimindo valores pela primeira vez
		System.out.println(lista.toString());
		
		//IMPRIMINDO VALORES DEPOIS DE ADICIONAR NO FINAL
		System.out.println();
		System.out.println(lista.toString());
		
		//adicionando por Posição
		lista.adicionaPos(2, "teste");
		System.out.println();
		System.out.println(lista.toString());
		
	
	
		
		
	}

}
