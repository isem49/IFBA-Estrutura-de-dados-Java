package loop;

import java.util.Scanner;

public class Exemplo02 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Digite o Numero de parada: ");
		int parada = input.nextInt();
		
		System.out.println();
		
		for (int contador = 1 ; contador <= parada; contador = contador + 1 ) {		
			System.out.println( "valor: " + contador );	
		}
		
	}

}
