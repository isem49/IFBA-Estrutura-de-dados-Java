package exercicio15;

import java.util.Date;

public class ReservaDeVoo {
	
	private int id;
	private String status;
	private Date data;
	private Passageiro passageiro;
	private Voo voo;
	private Assento assento;
	
	public ReservaDeVoo() {
	}

	public ReservaDeVoo(int id, String status, Date data, Passageiro passageiro, Voo voo, Assento assento) {
		this.id = id;
		this.status = status;
		this.data = data;
		this.passageiro = passageiro;
		this.voo = voo;
		this.assento = assento;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public Passageiro getPassageiro() {
		return passageiro;
	}

	public void setPassageiro(Passageiro passageiro) {
		this.passageiro = passageiro;
	}

	public Voo getVoo() {
		return voo;
	}

	public void setVoo(Voo voo) {
		this.voo = voo;
	}

	public Assento getAssento() {
		return assento;
	}

	public void setAssento(Assento assento) {
		this.assento = assento;
	}

	

	
	
}
