package exercicio11;

import java.util.Random;
import java.util.Scanner;
	
	/*Utilizando a classe random, desenvolva um jogo, no qual um n�mero aleat�rio � gerado no
	intervalo de 0 a 99, depois solicite que o usu�rio adivinhe esse n�mero, e d� dicas ao usu�rio,
	quando o usu�rio digitar um n�mero menor que o n�mero gerado informe que � menor,
	quando usu�rio digitar um n�mero maior informe que o n�mero � maior, quando o usu�rio
	acertar exiba a mensagem �Parab�ns voc� acertou�. Exemplo de utiliza��o da classe
	random. Armazene as tentativas em um Array e depois apresente.*/

public class Jogo {

	public static void main(String[] args) {
		Scanner  i = new Scanner(System.in);
		Servico s = new Servico();
		Random r = new Random();
		int numero = r.nextInt(99);
		int verificar;
	

		for(int cont=0; cont<99; cont++) {	
			System.out.print("Digite um numero: ");
			verificar = i.nextInt();
						
			s.auxiliarV(verificar);
			
			s.verificarNumero(verificar, numero);
			if(verificar == numero) {
				break;
			}
			
		}
		s.imprimir();
		
	}

}
