package loop;

import java.util.Scanner;

public class Exemplo01 {
	public static void main(String[] args) {
				
		Scanner input = new Scanner(System.in);
		
		System.out.print("Digite uma frase: ");		
		String frase = input.nextLine();
				
		System.out.println();
		
		int contador = 1;	
		while(contador <= 10000) {
			System.out.println( frase );
			contador = contador + 1;	
		}
	
	}
}
