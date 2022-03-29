package exercicio15;

public class Assento {
	
	private int id;
	private String status;
	private int fileira;
	private String posicaoNaFileira;
	private Aeronave aeronave;
	
	public Assento() {
	}

	public Assento(int id, String status, int fileira, String posicaoNaFileira, Aeronave aeronave) {
		this.id = id;
		this.status = status;
		this.fileira = fileira;
		this.posicaoNaFileira = posicaoNaFileira;
		this.aeronave = aeronave;
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

	public int getFileira() {
		return fileira;
	}

	public void setFileira(int fileira) {
		this.fileira = fileira;
	}

	public String getPosicaoNaFileira() {
		return posicaoNaFileira;
	}

	public void setPosicaoNaFileira(String posicaoNaFileira) {
		this.posicaoNaFileira = posicaoNaFileira;
	}

	public Aeronave getAeronave() {
		return aeronave;
	}

	public void setAeronave(Aeronave aeronave) {
		this.aeronave = aeronave;
	}
	
	
	
	
	
	
}
