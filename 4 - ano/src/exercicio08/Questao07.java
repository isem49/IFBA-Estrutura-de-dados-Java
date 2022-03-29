package exercicio08;

import java.util.Scanner;

public class Questao07 {
	/*O valor pago por um Hotel para seus porteiros é de R$ 12,25 por hora de trabalho. Faça um
	programa que pergunte ao usuário quantas horas ele trabalhou e imprima na tela o valor
	do salário a ser recebido por ele.*/
	public static void main(String[] args) {
		
		double numeroEscolhido;
		double multiplicador = 0;
		
		Scanner input = new Scanner(System.in);
		Calculo calc = new Calculo();
		
		System.out.print("Fale a quantidade de horas que você deseja trabalhar: ");
		numeroEscolhido = input.nextDouble();
		
		System.out.println("Seu salario é: " + Calculo.multiplicarNumero(numeroEscolhido, multiplicador));
		
		if (calc.multiplicarNumero(numeroEscolhido, multiplicador) < 50 ) {
			System.out.println("Atenção, dirija-se à direção do Hotel!");
			
		}
		
	}

}
