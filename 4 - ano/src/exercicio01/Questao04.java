package exercicio01;

import java.util.Scanner;

public class Questao04 {

	public static void main(String[] args) {
		int v;
		int s;
		int t;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Diga a distancia pecorrida (em metros): ");
		s = input.nextInt();
		System.out.print("Tempo para pecorrer a distancia (em segundos) : ");
		t = input.nextInt();
		
		v = s/t;
		
		System.out.print("Sua distancia é de: " + v + " m/s ");

	}

}
