package main;

import basicas.Pessoa;
import vetores.*;


public class Teste {

	public static void main(String[] args) {
		
		ArrayIFBA<Pessoa> lista = new ArrayIFBA<Pessoa>();
		
		Pessoa p1 = new Pessoa("junior","1111");
		Pessoa p2 = new Pessoa("cícero","2222");
		Pessoa p3 = new Pessoa("ricardo","3333");

		lista.adicionar(p1);
		lista.adicionar(p2);
		lista.adicionar(p3);
		
		System.out.println(lista.toString());
	
		Pessoa p4 = new Pessoa("farias","4444");
		
		lista.adicionaPosicao(1, p4);
		
		System.out.println(lista.toString());
		
		lista.remove(2);
		
		System.out.println(lista.toString());
		
	}

}
