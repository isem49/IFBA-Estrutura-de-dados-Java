package lista;

import java.util.ArrayList;

public class CadastroProduto {

	public static void main(String[] args) {
		ArrayList<Produto> listaDeProdutos = new ArrayList<>();
		
		Produto p1 = new Produto();
		p1.setId(1);
		p1.setNome("SSD 1TB");
		p1.setDescricao("Um SSD Kingston A400");
		p1.setCodigoBarras("789");
		p1.setValor(300.0);	
		
		Produto p2 = new Produto();
		p2.setId(2);
		p2.setNome("SSD 2TB");
		p2.setDescricao("Um SSD Kingston A400");
		p2.setCodigoBarras("788");
		p2.setValor(400.0);
		
		Produto p3 = new Produto();
		p3.setId(3);
		p3.setNome("SSD 3TB");
		p3.setDescricao("Um SSD Kingston A400");
		p3.setCodigoBarras("787");
		p3.setValor(500.0);

		listaDeProdutos.add(p1);
		listaDeProdutos.add(p2);
		listaDeProdutos.add(p3);
		
		for( Produto p : listaDeProdutos ) {
			
			System.out.println("Produto: ");
			System.out.println("Id: " + p.getId());
			System.out.println("Nome: "  + p.getNome());
			System.out.println("Nome: "  + p.getDescricao());
			System.out.println("Nome: "  + p.getCodigoBarras());
			System.out.println("Nome: "  + p.getValor());
			System.out.println();

		
		}
		
	}
}
