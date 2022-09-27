package br.edu.br.ifba.agenda.cadastros;

import br.edu.ifba.agenda.basica.Categoria;
import br.edu.ifba.agenda.colecao.ColecaoCategoria;
import br.edu.ifba.agenda.exception.CadastroCategoriaException;

public class CadastroCategoria {
	
	ColecaoCategoria col = new ColecaoCategoria();
	
	public void adicionarCategoria(Categoria c) throws CadastroCategoriaException  {
		
		if(col.ProcurarCategoriaNome(c.getNome()) != null ) {
			
			CadastroCategoriaException ex = new CadastroCategoriaException(c.getNome());
			throw(ex);
			
		}
		
		
		this.col.adicionarCategoria(c);
		
	}
	
}
