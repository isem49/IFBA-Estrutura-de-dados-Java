package Lista;

public class Celula {

	private Celula proxima;
	private Object objeto;
	
	public Celula() {
	}
	
	public Celula(Object objeto) {
		this.objeto = objeto;
	}
	
	public Celula(Celula proxima, Object objeto) {
		this.proxima = proxima;
		this.objeto = objeto;
	}

	public Celula getProxima() {
		return proxima;
	}

	public void setProxima(Celula proxima) {
		this.proxima = proxima;
	}

	public Object getObjeto() {
		return objeto;
	}

	public void setObjeto(Object objeto) {
		this.objeto = objeto;
	}
	
	
}
