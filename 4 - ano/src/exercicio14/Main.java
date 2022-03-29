package exercicio14;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
	/*Implemente um programa que insira 10 números em um vetor, depois some esses
	números e retorne o resultado, para isso utilize uma classe que calcule o valor.*/
	
	public static void main(String[] args) {
		int vetor[] = new int[10];
		Scanner in = new Scanner(System.in);
		Servico s = new Servico();
		
		for(int i = 0; i < vetor.length; i++) {
				System.out.print("Digite um numero: ");
				vetor[i] = in.nextInt();
				s.soma(vetor[i]);
		}
		System.out.println();
		System.out.println("Numeros Utilizados: " + Arrays.toString(vetor));
		System.out.println();
		s.imprimir();
		

	}

}
