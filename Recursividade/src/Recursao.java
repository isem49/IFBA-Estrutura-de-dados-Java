import java.util.LinkedList;

public class Recursao {
	
	int result;
	int aux;
	int aux2;

	
	LinkedList<Character> lista = new LinkedList<Character>();

	public int conversor(String n) {
		
		String numero = n;
		

		if(aux < numero.length()) {
			
			lista.add(numero.charAt(aux));
			aux++;
		
			conversor(numero);
			
		}

		while(!lista.isEmpty()){
			
			int a = Character.getNumericValue(lista.removeLast());
			
			result += (int) (a * Math.pow(2, aux2));
			aux2++;
			
		}
	
		return result;
		
		
	}
	
	
	
}
