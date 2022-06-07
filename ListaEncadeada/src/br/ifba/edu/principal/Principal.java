package br.ifba.edu.principal;

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
		
		lista.adicionaNoF("Igor");
		lista.adicionaNoF("Maria");
		lista.adicionaNoF("Fulano");
		lista.adicionaNoF("Sicrano");
		lista.adicionaNoF("Beltrano");
		lista.adicionaNoF("José");
		lista.adicionaNoF("Camila");
		lista.adicionaNoF("Helena");
		
		System.out.println(lista.toString());

		
	}

}
