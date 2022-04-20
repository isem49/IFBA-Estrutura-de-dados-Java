package exercicio12;

public class Servico {
		private int vetor[] = new int[3];
		
		private int auxiliar;
		
		public void receberNumero(int numero1, int numero2, int numero3) {
			this.vetor[0] = numero1;
			this.vetor[1] = numero2;
			this.vetor[2] = numero3;
		}
		
		
		public void acharGanhador() {
			if(vetor[0] == 0 && vetor[1] == 1 && vetor[2] == 1 ) System.out.println("jogador A venceu");
			else if (vetor[0] == 1 && vetor[1] == 0 && vetor[2] == 0 ) System.out.println("jogador A venceu");
			else if (vetor[0] == 0 && vetor[1] == 1 && vetor[2] == 0 ) System.out.println("jogador B venceu");
			else if (vetor[0] == 1 && vetor[1] == 0 && vetor[2] == 1 ) System.out.println("jogador B venceu");
			else if (vetor[0] == 0 && vetor[1] == 0 && vetor[2] == 1 ) System.out.println("jogador C venceu");
			else if (vetor[0] == 1 && vetor[1] == 1 && vetor[2] == 0 ) System.out.println("jogador C venceu");
			else System.out.println("Nenhum vencedor");
		}
	
}
