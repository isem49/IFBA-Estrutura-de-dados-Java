package metodo;

import java.util.Scanner;

public class Exemplo04 {

	public static void main(String[] args) {
		double altura;
		double peso;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Digite seu peso: ");
		peso = input.nextDouble();
		System.out.print("Digite sua altura: ");
		altura = input.nextDouble();
		
		calcIMC(peso,altura);	
	}

	public static void calcIMC(double peso, double altura) {	
		double imc = peso / (altura*altura);
		if (imc < 18.5 ) {
			
			System.out.print("Seu IMC e: " + imc + " seu peso esta abaixo do ideal");
			
		}if (imc > 35 ) {
			
			System.out.print("Seu IMC e: " + imc + " seu peso esta acima do ideal");
			
		}if (imc >= 18.5 && imc <= 35   ) {
			
			System.out.print("Seu IMC e: " + imc + " você está no peso ideal");
		}
			
	}
}
