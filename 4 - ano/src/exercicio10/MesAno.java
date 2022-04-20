package exercicio10;

import java.util.Scanner;

public class MesAno {

	public static void main(String[] args) {
		
		int mes;
		
		Scanner input = new Scanner(System.in);
		System.out.print("Digite o numero do Mês: ");
		mes = input.nextInt();
		
		if (mes == 1) {
			System.out.println("Janeiro");
			
		}
		else if (mes == 2) {
				System.out.println("fevereiro");
		
		}
		else if (mes == 3) {
			System.out.println("março");
	
		}
		else if (mes == 4) {
			System.out.println("abril");
	
		}
		else if (mes == 5) {
			System.out.println("maio");
	
		}
		else if (mes == 6) {
			System.out.println("junho");
	
		}
		else if (mes == 7) {
			System.out.println("julho");
	
		}
		else if (mes == 8) {
			System.out.println("agosto");
	
		}
		else if (mes == 9) {
			System.out.println("setembro");
	
		}
		else if (mes == 10) {
			System.out.println("outubro");
	
		}
		else if (mes == 11) {
			System.out.println("novembro");
	
		}
		else if (mes == 12) {
			System.out.println("dezembro");
	
		}
		else {
			System.out.println("invalido");
			
		}
		
	}

}
