package br.ifba.edu.principal;

import javax.swing.JOptionPane;

import br.ifba.edu.lista.Lista;

public class Principal {

	public static void main(String[] args) {

		Lista lista = new Lista();

		lista.adicionaNoComeco("Igor");
		lista.adicionaNoComeco("Maria");
		lista.adicionaNoComeco("Fulano");
		lista.adicionaNoComeco("Sicrano");
		lista.adicionaNoComeco("Beltrano");
		lista.adicionaNoComeco("José");
		lista.adicionaNoComeco("Camila");
		lista.adicionaNoComeco("Helena");

		System.out.println(lista.toString());

		lista.adicionaNoF("junior");
		lista.adicionaNoF("ricardo");

		System.out.println();
		System.out.println(lista.toString());

		lista.adicionaPos(0, "teste");
		System.out.println();
		System.out.println(lista.toString());
		
		System.out.println();
		lista.removeP();
		
		JOptionPane.showMessageDialog(null, lista.toString());
		
		

	}

}
