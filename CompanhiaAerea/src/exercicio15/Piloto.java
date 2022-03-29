package exercicio15;

import java.util.ArrayList;

public class Piloto extends Pessoa {
	
	private String numeroLicencaVoo;
	private ArrayList<Voo> voos;
	
	public Piloto(){
		
	}
	
	public Piloto(int id, String nome, String sexo, String numeroLicencaVoo, ArrayList<Voo> voos) {
		super(id, nome, sexo);
		this.numeroLicencaVoo = numeroLicencaVoo;
		this.voos = voos;
	}

	public String getNumeroLicencaVoo() {
		return numeroLicencaVoo;
	}

	public void setNumeroLicencaVoo(String numeroLicencaVoo) {
		this.numeroLicencaVoo = numeroLicencaVoo;
	}

	public ArrayList<Voo> getVoos() {
		return voos;
	}

	public void setVoos(ArrayList<Voo> voos) {
		this.voos = voos;
	}
	
	
	
}

