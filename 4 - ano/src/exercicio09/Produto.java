package exercicio09;

import java.util.Scanner;

/*Faça um programa que receba o preço de custo e o preço de venda de um produto, e
mostre como resultado se houve lucro ou prejuízo, para ser considerado lucro o preço do
produto deve ser no mínimo 50% mais caro do que o preço de custo.*/
public class Produto {

	public static void main(String[] args) {
		double preco;
		double custo;
	
		Scanner input = new Scanner(System.in);
		System.out.print("Digite o preço do produto: ");
		preco = input.nextDouble();
		System.out.print("Digite o custo do produto: ");
		custo = input.nextDouble();
	
		if(preco > custo + (custo/2)) {
			
			System.out.println("Lucro");
			
		}
		else {
			System.out.println("Prejuizo");
		}
		
		
	}

}
