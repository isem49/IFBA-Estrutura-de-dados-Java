package exercicio14;

public class Produto {

	private int id;
	private String nome;
	private double valor;
	private double desconto;
	private String categoria;
	private int quantidade;
	
	public Produto() {
	}

	public Produto(int id, String nome, double valor, double desconto, String categoria, int quantidade) {
		this.id = id;
		this.nome = nome;
		this.valor = valor;
		this.desconto = desconto;
		this.categoria = categoria;
		this.quantidade = quantidade;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public double getDesconto() {
		return desconto;
	}

	public void setDesconto(double desconto) {
		this.desconto = desconto;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
}
