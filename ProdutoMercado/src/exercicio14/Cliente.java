package exercicio14;

import java.util.ArrayList;

public class Cliente {
	
	private int id;
	private String nome;
	private String email;
	private String cpfCnpj;
	private Endereco endereco;
	private ArrayList<Telefone> telefones;
	
	public Cliente() {
	}

	public Cliente(int id, String nome, String email, String cpfCnpj, Endereco endereco,
			ArrayList<Telefone> telefones) {
		this.id = id;
		this.nome = nome;
		this.email = email;
		this.cpfCnpj = cpfCnpj;
		this.endereco = endereco;
		this.telefones = telefones;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCpfCnpj() {
		return cpfCnpj;
	}

	public void setCpfCnpj(String cpfCnpj) {
		this.cpfCnpj = cpfCnpj;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public ArrayList<Telefone> getTelefones() {
		return telefones;
	}

	public void setTelefones(ArrayList<Telefone> telefones) {
		this.telefones = telefones;
	}

	
	
	
	
}