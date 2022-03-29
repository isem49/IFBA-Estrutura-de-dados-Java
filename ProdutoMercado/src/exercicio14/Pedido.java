package exercicio14;

import java.util.ArrayList;
import java.util.Date;

public class Pedido {
	
	private int id;
	private Date data;
	private ArrayList<Item> itens;
	private Endereco enderecoEntrega;
	private Cliente cliente;
	private Pagamento pagamento;
	
	public Pedido() {
	}

	public Pedido(int id, Date data, ArrayList<Item> itens, Endereco enderecoEntrega, Cliente cliente,
			Pagamento pagamento) {
		this.id = id;
		this.data = data;
		this.itens = itens;
		this.enderecoEntrega = enderecoEntrega;
		this.cliente = cliente;
		this.pagamento = pagamento;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public ArrayList<Item> getItens() {
		return itens;
	}

	public void setItens(ArrayList<Item> itens) {
		this.itens = itens;
	}

	public Endereco getEnderecoEntrega() {
		return enderecoEntrega;
	}

	public void setEnderecoEntrega(Endereco enderecoEntrega) {
		this.enderecoEntrega = enderecoEntrega;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Pagamento getPagamento() {
		return pagamento;
	}

	public void setPagamento(Pagamento pagamento) {
		this.pagamento = pagamento;
	}	
}