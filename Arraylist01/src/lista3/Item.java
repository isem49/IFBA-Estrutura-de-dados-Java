package lista3;

public class Item {
	private int id;
	private int quantidade;
	private double subtotal;
	private Produto produtos;
	private Pedido pedido;
	
	public Item() {
	}

	public Item(int id, int quantidade, double subtotal, Produto produtos, Pedido pedido) {
		this.id = id;
		this.quantidade = quantidade;
		this.subtotal = subtotal;
		this.produtos = produtos;
		this.pedido = pedido;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public double getSubtotal() {
		return subtotal;
	}

	public void setSubtotal(double subtotal) {
		this.subtotal = subtotal;
	}

	public Produto getProdutos() {
		return produtos;
	}

	public void setProdutos(Produto produtos) {
		this.produtos = produtos;
	}

	public Pedido getPedido() {
		return pedido;
	}

	public void setPedidos(Pedido pedido) {
		this.pedido = pedido;
	}

	

	
	
	
	
}
