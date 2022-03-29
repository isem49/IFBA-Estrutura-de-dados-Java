package lista3;

import java.util.ArrayList;
import java.util.Date;

public class CadastroPedidoItemProduto {
	public static void main(String[] args) {
		ArrayList<Item> listaDeItens = new ArrayList<>();

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
		
		Item i1 = new Item();
		i1.setId(2);
		i1.setQuantidade(2);
		i1.setSubtotal(444.444);
		i1.setProdutos(p1);
		
		Item i2 = new Item();
		i2.setId(1);
		i2.setQuantidade(1);
		i2.setSubtotal(333.333);
		i2.setProdutos(p2);
		
		Item i3 = new Item();
		i3.setId(3);
		i3.setQuantidade(3);
		i3.setSubtotal(555.555);
		i3.setProdutos(p3);
		
		listaDeItens.add(i1);
		listaDeItens.add(i2);
		listaDeItens.add(i3);

		
		Pedido ped = new Pedido();
		ped.setId(1);
		ped.setValorFrete(30.00);
		ped.setValorCupom(10.00);
		ped.setValorDesconto(10.00);
		ped.setValorTotal(20.00);
		ped.setDate(new Date ());
		ped.setItens(listaDeItens);
		
		i1.setPedidos(ped);
		i2.setPedidos(ped);
		i3.setPedidos(ped);

		
		System.out.println("Pedido 1: ");
		System.out.println("Id: " + ped.getId());
		System.out.println("Valor do Frete: " + ped.getValorFrete());
		System.out.println("Valor do Cupom: " + ped.getValorCupom());
		System.out.println("Valor do Desconto: " + ped.getValorDesconto());
		System.out.println("Valor Total: " + ped.getValorTotal());
		System.out.println("Data: " + ped.getDate());
		System.out.println("");
			
		for ( Item i : ped.getItens()) {
			System.out.println("");
			System.out.println("Itens: " );
			System.out.println("id do Item: " + i.getId() );
			System.out.println("Quantidade do Item: " + i.getQuantidade() );
			System.out.println("SubTotal do Item: " + i.getSubtotal());
			System.out.println("");
			System.out.println("Produtos: ");
			System.out.println("Nome do Produto: " + i.getProdutos().getNome());
			System.out.println("id do Produto: " + i.getProdutos().getId());
			System.out.println("codigo de barras do produto: " + i.getProdutos().getCodigoBarras());
			System.out.println("Valor do produto: " + i.getProdutos().getValor());
			System.out.println("descricao do produto: " + i.getProdutos().getDescricao());
		}
		
		
		
		
	}
	
	
}
