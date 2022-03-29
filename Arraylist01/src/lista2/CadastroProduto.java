package lista2;

import java.util.ArrayList;
import java.util.Date;


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
		
		Pedido ped = new Pedido();
		ped.setId(1);
		ped.setValorFrete(30.00);
		ped.setValorCupom(10.00);
		ped.setValorDesconto(10.00);
		ped.setValorTotal(20.00);
		ped.setDate(new Date ());
		ped.setProdutos(listaDeProdutos);
		
		System.out.println("Pedido 1: ");
		System.out.println("Id: " + ped.getId());
		System.out.println("Valor do Frete: " + ped.getValorFrete());
		System.out.println("Valor do Cupom: " + ped.getValorCupom());
		System.out.println("Valor do Desconto: " + ped.getValorDesconto());
		System.out.println("Valor Total: " + ped.getValorTotal());
		System.out.println("Data: " + ped.getDate());
		System.out.println("");

		
		for( Produto p : ped.getProdutos()  ) {
			System.out.println("Produto: ");
			System.out.println("Id: " + p.getId());
			System.out.println("Nome: "  + p.getNome());
			System.out.println("Descricao: "  + p.getDescricao());
			System.out.println("Codigo de Barras: "  + p.getCodigoBarras());
			System.out.println("Valor: "  + p.getValor());
			System.out.println();

		
		}
		
	}
}
