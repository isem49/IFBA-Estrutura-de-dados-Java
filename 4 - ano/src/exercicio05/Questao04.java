package exercicio05;
	/*Escreva um programa que imprima na tela a soma dos números ímpares entre 0 e 30 e a
	multiplicação dos números pares entre 0 e 30.*/
public class Questao04 {

	public static void main(String[] args) {
		
		int soma = 0;
		double multiplicacao = 1;
		int contador = 1;
		
		while (contador <= 30) {
			
			if(contador%2 == 1) {
				soma = soma + contador;
			}
			else if(contador%2 == 0 && contador != 0) {		
				multiplicacao = multiplicacao * contador;	
			}
			
			contador = contador + 1;
			
		}
		
		System.out.println("Soma de numeros impares: " + soma);
		System.out.println("Multiplicação de numeros pares: " + multiplicacao);
		
	}

}
