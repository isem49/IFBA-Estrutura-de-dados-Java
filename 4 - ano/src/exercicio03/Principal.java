package exercicio03;

import java.util.Scanner;

/*Construa um programa que o usu�rio escolha qual opera��o (+,-,/,*) quer realizar entre
duas vari�veis, o programa deve realizar o c�lculo e mostrar o resultado ao usu�rio.*/

public class Principal {
	
	public static void main(String[] args) {
		
		double operador;
		double numeroEscolhido1;
		double numeroEscolhido2;
		Operacao op= new Operacao();
		
		
		Scanner input = new Scanner(System.in);
		System.out.println("Opera��es!!!");
		System.out.println();

		System.out.println("Multiplica��o = 1");
		System.out.println("Adi��o = 2");
		System.out.println("Subtra��o = 3");
		System.out.println("Divis�o = 4");
		System.out.println();

		System.out.print("Digite um numero para escolher a opera��o logica que voc� deseja executar: ");
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
	
	
	
	
	
	

