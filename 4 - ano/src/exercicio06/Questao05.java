package exercicio06;

import java.util.Scanner;

public class Questao05 {

	public static void main(String[] args) {
		
		float n;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Digite um numero: ");
		n = input.nextFloat();
		
		if( n%2 == 0 ) {	
			System.out.println("O Numero escolhido é par");	
		}
		else if ( n%2 == 1) {
			System.out.println("O numero escolhido é impar");
		}
		
		if ( n != 1 && n/n == 1 && n%2 != 0 && n%3 != 0 || n ==2 || n == 3 ){
			
			System.out.println("é um numero primo");

			
		}
		

	}

}
