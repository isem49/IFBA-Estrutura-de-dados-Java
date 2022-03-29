package exercicio15;

import java.util.ArrayList;

public class Aeronave {
	
	private int id;
	private String modelo;
	private ArrayList<Voo> voos;
	private ArrayList<Assento> assentos;
	
	public Aeronave() {
	}

	public Aeronave(int id, String modelo, ArrayList<Voo> voos, ArrayList<Assento> assentos) {
		this.id = id;
		this.modelo = modelo;
		this.voos = voos;
		this.assentos = assentos;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public ArrayList<Voo> getVoos() {
		return voos;
	}

	public void setVoos(ArrayList<Voo> voos) {
		this.voos = voos;
	}

	public ArrayList<Assento> getAssentos() {
		return assentos;
	}

	public void setAssentos(ArrayList<Assento> assentos) {
		this.assentos = assentos;
	}

	
	
	
}
