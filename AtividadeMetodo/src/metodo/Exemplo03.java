package metodo;

import java.util.Scanner;

public class Exemplo03 {
	public static void main(String[] args) {		
		String frase;
		Scanner input = new Scanner(System.in);

		System.out.print("Digite uma frase: ");
		frase = input.nextLine();
		
		repetir(frase);		
	}

	public static void repetir(String frase) {
		int contador = 1;	
		while(contador <= 10000) {
			System.out.println(frase);
			contador = contador + 1;
		}	
	}
}