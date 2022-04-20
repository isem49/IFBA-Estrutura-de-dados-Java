package clinica;

public class Paciente {
	
	private String nome;
	private	String idade;
	private String rg;
	
	public Paciente() {
	}

	public Paciente(String nome, String cpf, String rg) {
		this.nome = nome;
		this.idade = idade;
		this.rg = rg;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getIdade() {
		return idade;
	}

	public void setIdade(String idade) {
		this.idade = idade;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	@Override
	public String toString() {
		return "Paciente [nome=" + nome + ", idade=" + idade + ", rg=" + rg + "]";
	}

	
	
	
	
}
