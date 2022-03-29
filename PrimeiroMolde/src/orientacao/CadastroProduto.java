package orientacao;

public class CadastroProduto {
	public static void main(String[] args) {
		Produto p1 = new Produto();
		p1.id = 1;
		p1.nome = "SSD 1TB";
		p1.descricao = "Um SSD Kingston A400";
		p1.valor = 300.00;
		p1.codigoBarras = "789";
		
		Produto p2 = new Produto();
		p2.id = 2;
		p2.nome = "Memoria Ram 4GB";
		p2.descricao = "Uma Memoria ddr3 de 4gb";
		p2.valor = 100.00;
		p2.codigoBarras = "790";
		
		Produto p3 = new Produto();
		p3.id = 3;
		p3.nome = "Memoria Ram 8gb";
		p3.descricao = "Uma memoria ddr4 de 8gb";
		p3.valor = 300.00;
		p3.codigoBarras = "789";
				
		System.out.println("Produto 1 ");
		System.out.println("id: " + p1.id);
		System.out.println("nome: " + p1.nome);
		System.out.println("descricao: " + p1.descricao);
		System.out.println("valor: " + p1.valor);
		System.out.println("codigo de Barras: " + p1.codigoBarras);
		System.out.println();
		
		System.out.println("Produto 2 ");
		System.out.println("id: " + p2.id);
		System.out.println("nome: " + p2.nome);
		System.out.println("descricao: " + p2.descricao);
		System.out.println("valor: " + p2.valor);
		System.out.println("codigo de Barras: " + p2.codigoBarras);
		System.out.println();
		
		System.out.println("Produto 3 ");
		System.out.println("id: " + p3.id);
		System.out.println("nome: " + p3.nome);
		System.out.println("descricao: " + p3.descricao);
		System.out.println("valor: " + p3.valor);
		System.out.println("codigo de Barras: " + p3.codigoBarras);	
	}
}
