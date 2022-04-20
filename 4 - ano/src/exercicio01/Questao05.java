package exercicio01;

import java.util.Scanner;

public class Questao05 {

	public static void main(String[] args) {
		
		double valorCompra;
		double prestacoes;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Digite o valor da compra: ");
		valorCompra = input.nextDouble();
		
		prestacoes = valorCompra / 5;
		
		System.out.println("%f " + prestacoes );
		
	}

}
