package exercicio12;

import java.util.Random;
import java.util.Scanner;


public class Principal {

	public static void main(String[] args) {
		
		Scanner  i = new Scanner(System.in);
		Servico s = new Servico();
		Random r = new Random();
		int numero1 = r.nextInt(2);
		int numero2 = r.nextInt(2);
		int numero3 = r.nextInt(2);
				
		s.receberNumero(numero1, numero2, numero3);
		s.acharGanhador();
		
	}

}
