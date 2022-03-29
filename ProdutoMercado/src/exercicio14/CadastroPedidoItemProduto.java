package exercicio14;

import java.util.ArrayList;
import java.util.Date;


public class CadastroPedidoItemProduto {

	public static void main(String[] args) {
		ArrayList<Item> listaDeItens = new ArrayList<>();
		ArrayList<Telefone> listaDeTelefones = new ArrayList<>();
		
		Produto p1 = new Produto();
		p1.setId(1);
		p1.setNome("SSD 1TB");
		p1.setCategoria("Informática");
		p1.setValor(500.0);
		p1.setQuantidade(1);
		p1.setDesconto(100.0);
		
		Produto p2 = new Produto();
		p2.setId(2);
		p2.setNome("SSD 2TB");
		p2.setCategoria("Informática");
		p2.setValor(1000.0);
		p2.setQuantidade(2);
		p2.setDesconto(200.0);
		
		Item i1 = new Item();
		i1.setId(2);
		i1.setQuantidade(2);
		i1.setProduto(p1);
		i1.setSubTotal(555.5);
		
		Item i2 = new Item();
		i2.setId(1);
		i2.setQuantidade(1);
		i2.setProduto(p2);
		i2.setSubTotal(555.5);

		listaDeItens.add(i1);
		listaDeItens.add(i2);
		
		Telefone t1 = new Telefone();
		t1.setDdd("+75");
		t1.setDdi("+55");
		t1.setId(1);
		t1.setOperadora("oi");
		t1.setNumero("98899-9999");
		
		listaDeTelefones.add(t1);
			
		Endereco e = new Endereco();
		e.setId(1);
		e.setCep("44444-44");
		e.setNumero("102");
		e.setRua("uma qualquer kkk");
		
		Cliente c = new Cliente();
		c.setCpfCnpj("555.555.555.55");
		c.setEmail("juniorlobo10000@gmail.com");
		c.setId(1);
		c.setNome("junior");
		c.setTelefones(listaDeTelefones);
		c.setEndereco(e);
		
		Boleto boleto = new Boleto();
		boleto.setId(1);
		boleto.setDataVencimento(new Date ());
		boleto.setDataPagamento(new Date ());
		boleto.setEstado("Pago");
		boleto.setValor(500.0);
		
		CartaoCredito cartao = new CartaoCredito();
		cartao.setId(1);
		cartao.setEstado("Pago");
		cartao.setValor(500.0);
		cartao.setParcelas(5);
		
		Dinheiro dinheiro = new Dinheiro();
		dinheiro.setId(1);
		dinheiro.setEstado("Pago");
		dinheiro.setValor(500.0);
		
		Pedido ped = new Pedido();
		ped.setId(1);
		ped.setData(new Date ());
		ped.setEnderecoEntrega(e);
		ped.setCliente(c);
		ped.setItens(listaDeItens);
		ped.setPagamento(dinheiro);
		
		System.out.println("Pedido 1: ");
		System.out.println("Id: " + ped.getId());
		System.out.println("data: " + ped.getData());
		System.out.println("");
		
		System.out.println("Id: " + ped.getCliente().getId());
		System.out.println("Nome: " + ped.getCliente().getNome());
		System.out.println("Email: " + ped.getCliente().getEmail());
		System.out.println("Cpf ou Cnpj: " + ped.getCliente().getCpfCnpj());
		System.out.println("");
		
		System.out.println("Endereço do Cliente: " );
		System.out.println("Id: " + ped.getCliente().getEndereco().getId());
		System.out.println("Rua: " + ped.getCliente().getEndereco().getRua());
		System.out.println("Numero: " + ped.getCliente().getEndereco().getNumero());
		System.out.println("Cep: " + ped.getCliente().getEndereco().getCep());
		System.out.println();
	
		System.out.println("Telefone do Cliente: " );
		System.out.println("Id: " + t1.getId());
		System.out.println("Ddi do Cliente: " + t1.getDdi());
		System.out.println("ddd do Cliente: " + t1.getDdd());
		System.out.println("Numero do Cliente: " + t1.getNumero());
		System.out.println("operadora do Cliente: " + t1.getOperadora());
		System.out.println("");

		System.out.println("Endereço: ");
		System.out.println("Id do Endereço: " + ped.getEnderecoEntrega().getId());
		System.out.println("Cep: " + ped.getEnderecoEntrega().getCep());
		System.out.println("Rua: " + ped.getEnderecoEntrega().getRua());
		System.out.println("Numero: " + ped.getEnderecoEntrega().getNumero());

		for ( Item i : ped.getItens()) {
			System.out.println("");
			System.out.println("Itens: " );
			System.out.println("id do Item: " + i.getId() );
			System.out.println("Quantidade do Item: " + i.getQuantidade() );
			System.out.println("SubTotal do Item: " + i.getSubTotal());
			System.out.println("");
			System.out.println("Produtos: ");
			System.out.println("Nome do Produto: " + i.getProduto().getNome());
			System.out.println("id do Produto: " + i.getProduto().getId());
			System.out.println("Valor do produto: " + i.getProduto().getValor());
			System.out.println("Categoria do Produto: " + i.getProduto().getCategoria());
			System.out.println("Desconto do Produto: " + i.getProduto().getDesconto());
			System.out.println("Quantidade do Produto: " + i.getProduto().getQuantidade());
			System.out.println("");

		}

		if(ped.getPagamento() instanceof Boleto){
			Boleto b = (Boleto) ped.getPagamento();
			System.out.println("Id do pagamento: " + b.getId());
			System.out.println("Valor do pagamento: " + b.getValor());
			System.out.println("Estado do pagamento: " + b.getEstado());
			System.out.println("Data do pagamento: " + b.getDataPagamento());
			System.out.println("Vencimento do pagamento: " + b.getDataVencimento());
		}
		else if(ped.getPagamento() instanceof Dinheiro) {
			Dinheiro d = (Dinheiro) ped.getPagamento();
			System.out.println("Id do pagamento: " + d.getId());
			System.out.println("Valor do pagamento: " + d.getValor());
			System.out.println("Estado do pagamento: " + d.getEstado());
		}
		else if(ped.getPagamento() instanceof CartaoCredito) {
			CartaoCredito car = (CartaoCredito) ped.getPagamento();
			System.out.println("Id do pagamento: " + car.getId());
			System.out.println("Valor do pagamento: " + car.getValor());
			System.out.println("Estado do pagamento: " + car.getEstado());
			System.out.println("Parcelas do pagamento: " + car.getParcelas());

		}
		
	}

}
