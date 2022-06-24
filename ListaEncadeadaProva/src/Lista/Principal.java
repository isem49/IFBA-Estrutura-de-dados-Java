package Lista;

public class Principal {

	public static void main(String[] args) {
		
		ListaSimples lista = new ListaSimples();
		
		Funcionario f1 = new Funcionario();
		
		f1.setNome("Junior");
		f1.setRg("111.111.111-11");
		f1.setIdade(19);
		
		lista.adicionaNoComeco(f1);
		
		System.out.println(lista.toString());
		
		Funcionario f2 = new Funcionario();

		f2.setNome("ricardo");
		f2.setRg("111.111.111-11");
		f2.setIdade(19);
		
		lista.adicionaNoComeco(f2);
		
		System.out.println(lista.toString());
		
		
		

		
	}

}
