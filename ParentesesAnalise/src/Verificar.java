import java.util.LinkedList;

public class Verificar {
	
	LinkedList<Character> lista = new LinkedList<Character>();

	int contador1;
	int contador2;
	
	
	public void verificar(String v) {
		
		int aux = 0;
		
		while (aux < v.length()) {
			
			lista.add(v.charAt(aux));
			aux++;
			
		}
		
		while (!lista.isEmpty()) {
			String letra = Character.toString(lista.removeLast());

			if (letra.equalsIgnoreCase("(")) {
				contador1++;
			}
			
			if (letra.equalsIgnoreCase(")")) {
				contador2++;
			}

		}
		
		if( contador1 == contador2)System.out.println( "Estão balanceados");
		else System.out.println("Estão Desbanlanceados");
			
		
		
	}
	
	
	
}
