package exercicio14;

public class CartaoCredito extends Pagamento {

	private int parcelas;

	public CartaoCredito() {
		super();
	}

	public CartaoCredito(int id, String estado, double valor) {
		super(id, estado, valor);
	}

	public int getParcelas() {
		return parcelas;
	}

	public void setParcelas(int parcelas) {
		this.parcelas = parcelas;
	}
	
	
	
		
}
