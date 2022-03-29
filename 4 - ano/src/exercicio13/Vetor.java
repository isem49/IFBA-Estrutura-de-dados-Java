package exercicio13;

import java.util.Arrays;
import java.util.Scanner;

public class Vetor {

	public static void main(String[] args) {
		String vetor[] = new String[10];
		Scanner in = new Scanner(System.in);
		
			for(int i = 0; i < vetor.length; i++) {
					System.out.print("Digite um nome: ");
					vetor[i] = in.next();
			}
			
			Arrays.sort(vetor);
			System.out.println(Arrays.toString(vetor));

	}

}
