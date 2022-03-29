package construtor;

public class Produto {

	private int id;
	private String nome;
	private String descricao;
	private String codigoBarras;
	private double valor;
	
	
	public Produto() {
		
	}
	
	public Produto(int id, String nome, String descricao, String codigoBarras, double valor) {
		this.id = id;
		this.nome = nome;
		this.descricao = descricao;
		this.codigoBarras = codigoBarras;
		this.valor = valor;
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
	
	public String getDescricao() {
		return descricao;
	}
	
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public String getCodigoBarras() {
		return codigoBarras;
	}
	
	public void setCodigoBarras(String codigoBarras) {
		this.codigoBarras = codigoBarras;
	}
	
	public double getValor() {
		return valor;
	}
	
	public void setValor(double valor) {
		this.valor = valor;
	}
	
}


 

