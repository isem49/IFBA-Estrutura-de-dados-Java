package exercicio11;

import java.util.Arrays;

public class Servico {
	private int vetor[] = new int [99];
	private int aux;
	private int cont;
	
		public void auxiliarV(int a) {	
				this.vetor[this.aux] = a;
				this.aux += +1;
		}
		
		public void verificarNumero(int verificar, int numero){	
					if(verificar == numero) {		
						System.out.println("Acertou");
					}
					else if ( verificar > numero  ) System.out.println("O numero é menor");
					else  System.out.println ("O numero é maior");
				}
	
		public void imprimir() {
			while( cont != aux   ) {
					System.out.println("Numeros tentados: " + this.vetor[cont]);		
					cont += +1;	
			}
			
		}
	
		
	
}
