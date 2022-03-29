package heranca;

public class Livro {
	
	private int id;
	private String nome;
	private String editora;
	private String autor;
	
	public Livro() {

	}

	public Livro(int id, String nome, String editora, String autor) {
		this.id = id;
		this.nome = nome;
		this.editora = editora;
		this.autor = autor;
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

	public String getEditora() {
		return editora;
	}

	public void setEditora(String editora) {
		this.editora = editora;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

}