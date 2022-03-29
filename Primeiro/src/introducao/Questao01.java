package introducao;

public class Questao01 {

	public static void main(String[] args) {
		
		float nota1;
		float nota2;
		float nota3;
		int qtdNotas;
		String nomeAluno;
		
		nota1 = 7;
		nota2 = 8.5f;
		nota3 = 6.5f;

		qtdNotas = 3;
				
		nomeAluno = "Junior";
		
		float mediaNotasAluno;
		
		
		mediaNotasAluno = ( nota1 + nota2 + nota3 ) / qtdNotas;
		
		System.out.println("Olá " +nomeAluno + " Sua media foi " + mediaNotasAluno );
		
			
	}

}
