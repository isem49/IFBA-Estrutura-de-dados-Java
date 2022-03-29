package lista3;

import java.util.ArrayList;
import java.util.Date;

public class Pedido {
	private int id;
	private double valorFrete;
	private double valorDesconto;
	private double valorCupom;
	private double valorTotal;
	private Date date;
	private ArrayList<Item> itens;
	
	
	public Pedido() {
	}

	public Pedido(int id, double valorFrete, double valorDesconto, double valorCupom, double valorTotal, Date date,
			ArrayList<Item> itens) {
		this.id = id;
		this.valorFrete = valorFrete;
		this.valorDesconto = valorDesconto;
		this.valorCupom = valorCupom;
		this.valorTotal = valorTotal;
		this.date = date;
		this.itens = itens;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getValorFrete() {
		return valorFrete;
	}

	public void setValorFrete(double valorFrete) {
		this.valorFrete = valorFrete;
	}

	public double getValorDesconto() {
		return valorDesconto;
	}

	public void setValorDesconto(double valorDesconto) {
		this.valorDesconto = valorDesconto;
	}

	public double getValorCupom() {
		return valorCupom;
	}

	public void setValorCupom(double valorCupom) {
		this.valorCupom = valorCupom;
	}

	public double getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(double valorTotal) {
		this.valorTotal = valorTotal;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public ArrayList<Item> getItens() {
		return itens;
	}

	public void setItens(ArrayList<Item> itens) {
		this.itens = itens;
	}
	
	
	
}
