package exercicio04;
/*Imprima os primeiros números da série de Fibonacci até passar de 100. A série de
Fibonacci é a seguinte: 0, 1, 1, 2, 3, 5, 8, 13, 21, etc... Para calculá-la, o primeiro elemento
vale 0, o segundo vale 1, daí por diante, o n-ésimo elemento vale o (n-1)-ésimo elemento
somado ao (n-2)-ésimo elemento (ex: 8 = 5 + 3).*/

public class Fibonacci {

	public static void main(String[] args) {
		
		double n = 0;
		double auxiliar = 0;
		double auxiliar2;
		
		while( n <= 100   ) {		
			
			if( n < 2) {
				System.out.println("Série de Fibonacci: " +  n);
				n = n + 1;
					if(n == 1 ) {
						System.out.println("Série de Fibonacci: " + n);		
					}
				auxiliar = n;	
			}		
			else if( n >= 2 ) {		
				auxiliar2 = auxiliar;
				
					if(n == 2) {
						System.out.println("Série de Fibonacci: " + n);		
						auxiliar = 1;
						n = auxiliar + n;
						System.out.println("Série de Fibonacci: " + n);		
					}
						
				auxiliar = n;
				n = auxiliar2 + n;
				System.out.println("Série de Fibonacci: " + n);		
			}	
		}
	}
}
