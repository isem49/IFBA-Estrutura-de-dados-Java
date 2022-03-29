package exercicio14;


public class Pagamento {
	
	private int id;
	private String estado;
	private double valor;
	
	public Pagamento() {
	}

	public Pagamento(int id, String estado, double valor) {
		this.id = id;
		this.estado = estado;
		this.valor = valor;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}
	
	
	
	
}
