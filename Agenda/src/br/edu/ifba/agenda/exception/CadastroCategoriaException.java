package br.edu.ifba.agenda.exception;

public class CadastroCategoriaException extends Exception {

	public CadastroCategoriaException(String nome) {
		super("A Categoria" + nome + " já existe");
		
		
	}
	
	
}
