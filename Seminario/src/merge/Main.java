package merge;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
			int[] vetor =  {4,50,71,1,3,38,2,9 };
			int[] aux = new int [vetor.length];
			
			mergeSort(vetor,aux,0, vetor.length-1);
			
			System.out.println(Arrays.toString(vetor));
	
		}

	private static void mergeSort(int[] vetor, int[] aux, int inicio, int fim) {
			if (inicio<fim) {
				int meio = (inicio+fim)/2;
				mergeSort(vetor, aux, inicio, meio);
				mergeSort(vetor, aux, meio+1, fim);
				intercalar(vetor,aux,inicio,meio,fim);
			}
			
		}

	private static void intercalar(int[] vetor, int[] aux, int inicio, int meio, int fim) {
			for (int i = inicio; i <= fim; i++) {
				aux[i] = vetor[i];		
			}
			
			int esq = inicio;
			int dir = meio+1;
			
		
			for(int i = inicio; i <= fim; i++) {
			
				if(esq > meio) {
					vetor[i] = aux[dir++];
				}
				
				else if( dir > fim) {
					vetor[i]= aux [esq++];		
				}
				
				else if(aux[esq] < aux[dir]) {
					vetor[i] = aux [esq++];
				}
				
				else {
					vetor[i] = aux[dir++];			
				}
		}
	}
}
