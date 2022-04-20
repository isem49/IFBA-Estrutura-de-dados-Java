package clinica;

public class Principal {

	public static void main(String[] args) {
		
		 ColecaoPaciente c = new ColecaoPaciente();
		 
		 c.cadastrarPaciente();
		 c.cadastrarPacientePorPosicao();
		 c.procurarPacientePorNome();
		 c.procurarPacientePorPosicao();
		 c.removerPacientePorPosicao();
		 c.listarPaciente();
		 c.tamanho();
		
		
	}

}
