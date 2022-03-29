package exercicio14;

public class Endereco {
	
	private int id;
	private String cep;
	private String numero;
	private String rua;
	
	public Endereco() {
	}

	public Endereco(int id, String cep, String numero, String rua) {
		this.id = id;
		this.cep = cep;
		this.numero = numero;
		this.rua = rua;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getRua() {
		return rua;
	}

	public void setRua(String rua) {
		this.rua = rua;
	}
	
	
}
