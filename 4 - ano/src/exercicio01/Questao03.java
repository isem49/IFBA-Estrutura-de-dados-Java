package exercicio01;

import java.util.Scanner;

public class Questao03 {

	public static void main(String[] args) {
		 int nota01;
		 int nota02;
		 int nota03;
		 float media;
		 
		 Scanner input = new Scanner(System.in);
			
		 System.out.print("Digite a primeira nota: ");
		 nota01 = input.nextInt();
		 System.out.print("Digite a segunda nota: ");
		 nota02 = input.nextInt();
		 System.out.print("Digite a  nota: ");
		 nota03 = input.nextInt();
		
		 media = (nota01 + nota02 + nota03) / 3;
		 System.out.println();
		 
		 if ( media >= 7) {
			System.out.println("aprovado");
		 }
		 else if( media >= 5 && media < 7) {
				System.out.println("Recuperação");
		 } 
		 else if( media < 5) {
				System.out.println("reprovado");
		 } 
		 
		 
	}

}
