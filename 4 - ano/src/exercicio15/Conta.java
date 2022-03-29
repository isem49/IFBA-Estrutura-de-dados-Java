package exercicio15;

public class Conta {
	private String nome;
	private int valor;
	
	public Conta() {
	}

	public Conta(String nome, int valor) {
		this.nome = nome;
		this.valor = valor;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}
	
}

