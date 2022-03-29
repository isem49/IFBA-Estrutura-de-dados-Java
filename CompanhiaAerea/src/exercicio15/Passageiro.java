package exercicio15;

import java.util.ArrayList;
import java.util.Date;

public class Passageiro extends Pessoa {
	
	private Date dataNascimento;
	private ArrayList<Telefone> telefones;
	private ArrayList<ReservaDeVoo> voos;
	
	public Passageiro() {
		super();
	}

	public Passageiro(int id, String nome, String sexo, Date dataNascimento, ArrayList<Telefone> telefones,
			ArrayList<ReservaDeVoo> voos) {
		super(id, nome, sexo);
		this.dataNascimento = dataNascimento;
		this.telefones = telefones;
		this.voos = voos;
	}

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public ArrayList<Telefone> getTelefones() {
		return telefones;
	}

	public void setTelefones(ArrayList<Telefone> telefones) {
		this.telefones = telefones;
	}

	public ArrayList<ReservaDeVoo> getVoos() {
		return voos;
	}

	public void setVoos(ArrayList<ReservaDeVoo> voos) {
		this.voos = voos;
	}
	
	

	
	
}
