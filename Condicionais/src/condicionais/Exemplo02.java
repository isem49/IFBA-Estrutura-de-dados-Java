package condicionais;

import java.util.Scanner;

public class Exemplo02 {

	public static void main(String[] args) {
		
		double classAtend;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Classifique o atendimento como de 1 a 5 estrelas: ");
		classAtend = input.nextDouble();
		
		if ( classAtend == 1 ) {		
			System.out.println("voc� classificou com p�ssimo o nosso atendimento, obrigado!");
		}if ( classAtend == 2 ) {			
			System.out.println("voc� classificou como ruim o nosso atendimento, obrigado!");
		}if ( classAtend == 3 ) {			
			System.out.println("voc� classificou como bom o nosso atendimento, obrigado!.");
		}if ( classAtend == 4 ) {		
			System.out.println("oc� classificou como muito bom o nosso atendimento, obrigado! ");
		}if ( classAtend == 5 ) {		
			System.out.println("voc� classificou como �timo o nosso atendimento, obrigado!");
		}			
	}
}
