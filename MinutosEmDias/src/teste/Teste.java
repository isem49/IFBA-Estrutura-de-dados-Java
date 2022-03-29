package teste;

import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {
		int minutosGerais ;
		double horas, dias, minutos;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite a quantidade de minutos: ");
		minutosGerais = input.nextInt();
		
		dias = ((minutosGerais/60) / 24);
		horas = dias / 24;
		minutos = horas / 60;
		
	
		System.out.println(dias);
		System.out.println(horas);
		System.out.println(minutos);

		
		
	}

}
