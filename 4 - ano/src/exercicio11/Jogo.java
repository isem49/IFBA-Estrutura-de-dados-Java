package exercicio11;

import java.util.Random;
import java.util.Scanner;
	
	/*Utilizando a classe random, desenvolva um jogo, no qual um número aleatório é gerado no
	intervalo de 0 a 99, depois solicite que o usuário adivinhe esse número, e dê dicas ao usuário,
	quando o usuário digitar um número menor que o número gerado informe que é menor,
	quando usuário digitar um número maior informe que o número é maior, quando o usuário
	acertar exiba a mensagem “Parabéns você acertou”. Exemplo de utilização da classe
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
