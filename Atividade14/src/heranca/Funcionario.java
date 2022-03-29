package heranca;

public class Funcionario extends Pessoa {

	
	private double salario;
	private String funcao;
	
	public Funcionario() {
		
	}

	public Funcionario(int id, String nome, String cpf, String rg, double salario, String funcao) {
		super(id, nome, cpf, rg);
		this.salario = salario;
		this.funcao = funcao;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public String getFuncao() {
		return funcao;
	}

	public void setFuncao(String funcao) {
		this.funcao = funcao;
	}
	
}
