package model;


public class CadastroProduto {
		public static void main(String[] args) {
			Produto p1 = new Produto();
			p1.setId(1);
			p1.setNome("SSD 1TB");
			p1.setDescricao("Um SSD Kingston A400");
			p1.setValor(300.00);
			p1.setCodigoBarras("789"); 
			
			Produto p2 = new Produto();
			p2.setId(2);
			p2.setNome("Memoria Ram 4GB"); 
			p2.setDescricao("Uma Memoria ddr3 de 4gb"); 
			p2.setValor(100.00);
			p2.setCodigoBarras("790"); 
			
			Produto p3 = new Produto();
			p3.setId(3); 
			p3.setNome("Memoria Ram 8gb"); 
			p3.setDescricao("Uma memoria ddr4 de 8gb"); 
			p3.setValor(300.00); 
			p3.setCodigoBarras("789"); 
					
			System.out.println("Produto 1 ");
			System.out.println("id: " + p1.getId());
			System.out.println("nome: " + p1.getNome());
			System.out.println("descricao: " + p1.getDescricao());
			System.out.println("valor: " + p1.getValor());
			System.out.println("codigo de Barras: " + p1.getCodigoBarras());
			System.out.println();
			
			System.out.println("Produto 2 ");
			System.out.println("id: " + p2.getId());
			System.out.println("nome: " + p2.getNome());
			System.out.println("descricao: " + p2.getDescricao());
			System.out.println("valor: " + p2.getValor());
			System.out.println("codigo de Barras: " + p2.getCodigoBarras());
			System.out.println();
			
			System.out.println("Produto 3 ");
			System.out.println("id: " + p3.getId());
			System.out.println("nome: " + p3.getNome());
			System.out.println("descricao: " + p3.getDescricao());
			System.out.println("valor: " + p3.getValor());
			System.out.println("codigo de Barras: " + p3.getCodigoBarras());
			System.out.println();
	}

}
