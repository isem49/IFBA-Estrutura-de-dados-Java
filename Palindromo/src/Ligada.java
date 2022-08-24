import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;


public class Ligada {
	
	Stack <String> f = new Stack<String>();
	StringBuilder s = new StringBuilder();
	
	public void inserir(String e) {
	
		String teste;
		f.add(e);
		int tamanho = e.length()-1;
		
		for(int cont = 0; cont < e.length(); cont++) {
			
			
			s.append(e.charAt(tamanho));
			tamanho = tamanho - 1;
	
			
		}
		
		teste = s.toString();
		System.out.println(teste);
		if  ( teste.equalsIgnoreCase(e)) {
			
			System.out.println("É um Palindromo");
			
		}
		
	}
	


	public void verificar() {
		
		System.out.println(f.size());
		
	}
	
	
	public void mostrar() {
		
		System.out.println(f.toString());
		
	}
	

}
