package br.edu.ifba.agenda.basica;

public class Contato {
	
	private int id;
	private String nome;
	private String email;
	private String fone;
	private String celular;
	
	private Categoria categoria;

	public Contato(String nome, String email, String fone, String celular, Categoria categoria) {
		this.nome = nome;
		this.email = email;
		this.fone = fone;
		this.celular = celular;
		this.categoria = categoria;
	}

	public Contato() {
		
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

	public String getFone() {
		return fone;
	}

	public void setFone(String fone) {
		this.fone = fone;
	}

	public String getCelular() {
		return celular;
	}

	public void setCelular(String celular) {
		this.celular = celular;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	@Override
	public String toString() {
		return "Contato [id=" + id + ", nome=" + nome + ", email=" + email + ", fone=" + fone + ", celular=" + celular
				+ ", categoria=" + categoria.getNome() + "]";
	}
	
	
	

}
