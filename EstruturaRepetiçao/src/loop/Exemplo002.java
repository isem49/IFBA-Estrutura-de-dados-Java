package loop;

import java.util.Scanner;

public class Exemplo002 {
	public static void main(String[] args) {
				
		Scanner input = new Scanner(System.in);
		
		System.out.print("Digite uma frase: ");		
		String frase = input.nextLine();
				
		System.out.print("Digite a quantidade de vezes que você quer que a frase seja repetida: ");
		int parada = input.nextInt();
		
		System.out.println();
		
		int contador = 1;	
		while(contador <= parada) {
			System.out.println( frase );
			contador = contador + 1;	
		}
	}
}