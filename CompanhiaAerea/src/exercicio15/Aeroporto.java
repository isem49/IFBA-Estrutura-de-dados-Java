package exercicio15;

import java.util.ArrayList;

public class Aeroporto {
	
	private int id;
	private String nome;
	private String cidade;
	private ArrayList<Voo> voos;
	
	public Aeroporto() {
	}

	public Aeroporto(int id, String nome, String cidade, ArrayList<Voo> voos) {
		this.id = id;
		this.nome = nome;
		this.cidade = cidade;
		this.voos = voos;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public ArrayList<Voo> getVoos() {
		return voos;
	}

	public void setVoos(ArrayList<Voo> voos) {
		this.voos = voos;
	}
	
	
	
	
	
}
