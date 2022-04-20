package vetor;

import java.util.Scanner;

public class Vetor {

	public static void main(String[] args) {
			int a;
			int multiplicador = 1;
			int parada;
		
			parada = 10;
			
			Scanner input = new Scanner(System.in);
			Servico ser = new Servico();

			
			
			
			while( multiplicador <= 10) {
				
			System.out.print("Digite um numero: ");	
			a= input.nextInt();
			System.out.println();
			
	
			if (a % 2 == 0) System.out.println( "Este numero é par: " + a + "\n");

	
			multiplicador = multiplicador + 1;
			
			
			
			}
			
		
			
			
	}
}
