package exercicio09;

import java.util.Scanner;

/*Fa�a um programa que receba o pre�o de custo e o pre�o de venda de um produto, e
mostre como resultado se houve lucro ou preju�zo, para ser considerado lucro o pre�o do
produto deve ser no m�nimo 50% mais caro do que o pre�o de custo.*/
public class Produto {

	public static void main(String[] args) {
		double preco;
		double custo;
	
		Scanner input = new Scanner(System.in);
		System.out.print("Digite o pre�o do produto: ");
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
