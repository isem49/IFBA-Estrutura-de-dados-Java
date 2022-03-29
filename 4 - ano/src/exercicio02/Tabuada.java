package exercicio02;

import java.util.Scanner;

public class Tabuada {
	
	public static void main(String[] args) {
		
		int numeroEscolhido;
		int multiplicador = 1;
		int parada;
		
		parada = 9;
		
		Scanner input = new Scanner(System.in);
		Repetidor rep = new Repetidor();
		
		System.out.print("Digite o numero cujo deseje ver a tabuada: ");
		numeroEscolhido = input.nextInt();

		while( multiplicador <= 9) {
			
			System.out.println(rep.multiplicarNumero(numeroEscolhido, multiplicador));
			multiplicador = multiplicador + 1;
			
		}
		
	}

}
