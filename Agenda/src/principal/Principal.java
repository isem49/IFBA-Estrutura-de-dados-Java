package principal;

import br.edu.ifba.agenda.basica.Categoria;
import br.edu.ifba.agenda.basica.Contato;
import br.edu.ifba.agenda.colecao.ColecaoCategoria;
import br.edu.ifba.agenda.colecao.ColecaoContato;

public class Principal {

	public static void main(String[] args) {
		
		ColecaoCategoria cj = new ColecaoCategoria();
		ColecaoContato cc = new ColecaoContato();
		
		
		Categoria ca = new Categoria();
		//cj.ListarCategoria().forEach(	System.out::println);
		//System.out.println(cj.ProcurarCategoriaNome("Ricardo"));
		
		
		Contato co = new Contato();
		co.setNome("teste");
		co.setEmail("teste@gmail.com");
		co.setFone("32132132321");
		co.setCelular("3213232");
		co.setCategoria(cj.ProcurarCategoriaId(3));
		
		cc.adicionarContato(co);
		
		cc.ListarContato().forEach(	System.out::println);
		

	

	}

}
