package principal;

import basica.Contato;
import linked.Ligada;

public class main {

	public static void main(String[] args) {
			
		Ligada lista = new Ligada();
		Contato c0 = new Contato("Fulano","1234567");
		Contato c1 = new Contato("Sicrano","09832131");
		Contato c2 = new Contato("Cicero","13214567");
		

		
		lista.inserir(c0);
		lista.inserir(c1);
		lista.inserir(c2);

		lista.mostrar();
		
		lista.inverter();
		lista.mostrar();

		
	}

}
