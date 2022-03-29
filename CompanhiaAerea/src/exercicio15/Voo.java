package exercicio15;

import java.util.ArrayList;
import java.util.Date;

public class Voo {
	
	private int id;
	private Date dataVoo;
	private String status;
	private ArrayList<ReservaDeVoo> reservaDeVoos;
	private Aeronave aeronave;
	private Aeroporto origem;
	private ArrayList<Aeroporto> escalas;
	private Aeroporto destino;
	private Piloto piloto;
	private Piloto copiloto;
	
	public Voo() {
	}

	public Voo(int id, Date dataVoo, String status, ArrayList<ReservaDeVoo> reservaDeVoos, Aeronave aeronave,
			Aeroporto origem, ArrayList<Aeroporto> escalas, Aeroporto destino, Piloto piloto, Piloto copiloto) {
		this.id = id;
		this.dataVoo = dataVoo;
		this.status = status;
		this.reservaDeVoos = reservaDeVoos;
		this.aeronave = aeronave;
		this.origem = origem;
		this.escalas = escalas;
		this.destino = destino;
		this.piloto = piloto;
		this.copiloto = copiloto;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getDataVoo() {
		return dataVoo;
	}

	public void setDataVoo(Date dataVoo) {
		this.dataVoo = dataVoo;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public ArrayList<ReservaDeVoo> getReservaDeVoos() {
		return reservaDeVoos;
	}

	public void setReservaDeVoos(ArrayList<ReservaDeVoo> reservaDeVoos) {
		this.reservaDeVoos = reservaDeVoos;
	}

	public Aeronave getAeronave() {
		return aeronave;
	}

	public void setAeronave(Aeronave aeronave) {
		this.aeronave = aeronave;
	}

	public Aeroporto getOrigem() {
		return origem;
	}

	public void setOrigem(Aeroporto origem) {
		this.origem = origem;
	}

	public ArrayList<Aeroporto> getEscalas() {
		return escalas;
	}

	public void setEscalas(ArrayList<Aeroporto> escalas) {
		this.escalas = escalas;
	}

	public Aeroporto getDestino() {
		return destino;
	}

	public void setDestino(Aeroporto destino) {
		this.destino = destino;
	}

	public Piloto getPiloto() {
		return piloto;
	}

	public void setPiloto(Piloto piloto) {
		this.piloto = piloto;
	}

	public Piloto getCopiloto() {
		return copiloto;
	}

	public void setCopiloto(Piloto copiloto) {
		this.copiloto = copiloto;
	}
	
	
	

	
}
