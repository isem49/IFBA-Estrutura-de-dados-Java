package principal;

import br.edu.ifba.agenda.basica.Categoria;
import br.edu.ifba.agenda.colecao.ColecaoCategoria;

public class Principal {

	public static void main(String[] args) {
		
		
		Categoria c = new Categoria(7);
		ColecaoCategoria cJ = new ColecaoCategoria();
		
		
		cJ.DeletarCategoria(c);
		

	}

}
