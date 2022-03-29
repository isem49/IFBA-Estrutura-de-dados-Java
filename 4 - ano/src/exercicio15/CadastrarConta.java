package exercicio15;

import java.util.Arrays;
import java.util.Scanner;

public class CadastrarConta {
	Conta vetor[] = new Conta[3];	
	
		 Conta c = new Conta();
		 Scanner in = new Scanner(System.in);
		 
		
	
		
		public void procuraConta(){
			for(int cont = 0; cont < vetor.length; cont++ ) {
			
					System.out.println("Digite o nome da conta que vc quer procurar: ");	
					if(vetor[cont].getNome().equals(in.next())) {
						
							System.out.println();
							System.out.println("---------------------------------");
							System.out.println("Conta: ");
							System.out.println("nome da conta: " + vetor[cont].getNome());
							System.out.println("Valor da conta: " + vetor[cont].getValor());
							System.out.println("---------------------------------");		
							
					}				
			}				
		}
		
		public void adicionarConta(){
			for(int i = 0; i < vetor.length; i++ ) {
					Conta c = new Conta();
					System.out.print("Digite um nome: ");
					c.setNome(in.next());
					System.out.print("Digite o valor da conta: ");
					c.setValor(in.nextInt());
					vetor[i] = c;
					
			}		
					
		}
		
}
