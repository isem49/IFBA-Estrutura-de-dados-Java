package exercicio14;


public class Item {
	
	private int id;
	private Produto produto;
	private Pedido pedido;
	private int quantidade;
	private double subTotal;
	
	public Item() {
	}

	public Item(int id, Produto produto, Pedido pedido, int quantidade, double subTotal) {
		this.id = id;
		this.produto = produto;
		this.pedido = pedido;
		this.quantidade = quantidade;
		this.subTotal = subTotal;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	public Pedido getPedido() {
		return pedido;
	}

	public void setPedido(Pedido pedido) {
		this.pedido = pedido;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public double getSubTotal() {
		return subTotal;
	}

	public void setSubTotal(double subTotal) {
		this.subTotal = subTotal;
	}
}
