package condicionais;

import java.util.Scanner;

public class Exemplo01 {

	public static void main(String[] args) {
		
		String nomeProduto;
		double quantidade;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Diga o nome do produto: ");
		nomeProduto = input.nextLine();
		System.out.print("Diga a quantidade: ");
		quantidade = input.nextDouble();
		
		if ( quantidade <= 10) {		
			System.out.println( "O estoque de " + nomeProduto + " esta baixo " );	
			
		}
		else if ( quantidade > 10 && quantidade <= 20  ) {	
			System.out.println( "O estoque de " + nomeProduto + " esta normal " );	
			
		}
		else if ( quantidade > 20  ) {				
			System.out.println( "O estoque de " + nomeProduto + " excelente " );
			
		}
					
	}

}
