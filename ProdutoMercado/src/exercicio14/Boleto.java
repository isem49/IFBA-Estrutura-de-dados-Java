package exercicio14;

import java.util.Date;

public class Boleto extends Pagamento{
	
	private Date dataVencimento;
	private Date dataPagamento;
	
	public Boleto() {
		super();
	}
	
	public Boleto(int id, String estado, double valor) {
		super(id, estado, valor);
	}
	
	public Date getDataVencimento() {
		return dataVencimento;
	}
	public void setDataVencimento(Date dataVencimento) {
		this.dataVencimento = dataVencimento;
	}
	public Date getDataPagamento() {
		return dataPagamento;
	}
	public void setDataPagamento(Date dataPagamento) {
		this.dataPagamento = dataPagamento;
	}
	

	
}
