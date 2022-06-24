package Lista;

public class Funcionario {

	private String nome;
	private String rg;
	private String cpf;
	private int idade;
	
	public Funcionario() {
		
	}

	public Funcionario(String nome, String rg, String cpf, int idade) {
		this.nome = nome;
		this.rg = rg;
		this.cpf = cpf;
		this.idade = idade;
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

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	@Override
	public String toString() {
		return "Funcionario [nome=" + nome + ", rg=" + rg + ", cpf=" + cpf + ", idade=" + idade + "]";
	}

	
	
	
}
