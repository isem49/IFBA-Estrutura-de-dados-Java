package heranca;

public class Aluno extends Pessoa {
	
	private String matricula;

	public Aluno() {
		
	}

	public Aluno(int id, String nome, String cpf, String rg, String matricula) {
		super(id, nome, cpf, rg);
		this.matricula = matricula;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	
	
	

}
