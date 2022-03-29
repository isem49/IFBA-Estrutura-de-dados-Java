package exercicio03;

import java.util.Scanner;

/*Construa um programa que o usuário escolha qual operação (+,-,/,*) quer realizar entre
duas variáveis, o programa deve realizar o cálculo e mostrar o resultado ao usuário.*/

public class Principal {
	
	public static void main(String[] args) {
		
		double operador;
		double numeroEscolhido1;
		double numeroEscolhido2;
		Operacao op= new Operacao();
		
		
		Scanner input = new Scanner(System.in);
		System.out.println("Operações!!!");
		System.out.println();

		System.out.println("Multiplicação = 1");
		System.out.println("Adição = 2");
		System.out.println("Subtração = 3");
		System.out.println("Divisão = 4");
		System.out.println();

		System.out.print("Digite um numero para escolher a operação logica que você deseja executar: ");
		operador = input.nextDouble();
			
		System.out.println();
		System.out.println("Escolha dois numeros em seguida!!!");
		System.out.println();
		System.out.print("Escolha o primeiro numero: ");
		numeroEscolhido1 = input.nextDouble();
		System.out.println();
		System.out.print("Escolha o segundo numero: ");
		numeroEscolhido2 = input.nextDouble();
		System.out.println();
		
		if(operador == 1) {	
			System.out.println("Resultado: " + op.multiplicarNumero(numeroEscolhido1, numeroEscolhido2));
		}
		else if(operador == 2) {
			System.out.println("Resultado" + op.somarNumero(numeroEscolhido1, numeroEscolhido2));		
		}
		else if(operador == 3) {	
			System.out.println("Resultado: " + op.subtrairNumero(numeroEscolhido1, numeroEscolhido2));
		}
		else if(operador == 4) {
			System.out.println("Resultado" + op.dividirNumero(numeroEscolhido1, numeroEscolhido2));		
		}
		
			
	}
	
}
	
	
	
	
	
	

