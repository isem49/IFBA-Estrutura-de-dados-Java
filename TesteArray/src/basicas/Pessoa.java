package basicas;

public class Pessoa {
	
	private String nome;
	private String rg;
	
	public Pessoa() {
	}

	public Pessoa(String nome, String rg) {
		this.nome = nome;
		this.rg = rg;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", rg=" + rg + "]";
	}
	
	
	
	
}
