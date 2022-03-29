package construtor;

public class CadastroProduto {
	public static void main(String[] args) {	
		
		Produto p0 = new Produto();
		
		Produto p1 = new Produto(1, " SSD 1TB" , "Um SSD Kingston A400", "789", 300.0);
				
		Produto p2 = new Produto(2, " SSD 2TB" , "Um SSD Kingston A500", "789", 400.0);
		
		Produto p3 = new Produto(3, " SSD 3TB" , "Um SSD Kingston A600", "789", 500.0);
		
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
