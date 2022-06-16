package br.ifba.edu.principal;

import javax.swing.JOptionPane;

import br.ifba.edu.lista.Lista;

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
		
		//Adicionar no final
		lista.adicionaNoF("junior");
		lista.adicionaNoF("ricardo");
		
		//IMPRIMINDO VALORES DEPOIS DE ADICIONAR NO FINAL
		System.out.println();
		System.out.println(lista.toString());
		
		//adicionando por Posição
		lista.adicionaPos(0, "teste");
		System.out.println();
		System.out.println(lista.toString());
		
		//Removendo o primeiro 
		System.out.println();
		lista.removeDoComeco();
		System.out.println(lista.toString());

		//interface grafica
		//JOptionPane.showMessageDialog(null, lista.toString());
		
		//Remove a ultima posição
		System.out.println();
		lista.removeF();
		System.out.println(lista.toString());

		//interface grafica
		//JOptionPane.showMessageDialog(null, lista.toString());
		
		//remove Pos
		System.out.println();
		lista.removePos(0);
		System.out.println(lista.toString());
	
		
		
		
	}

}
