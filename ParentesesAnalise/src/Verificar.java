import java.util.LinkedList;

public class Verificar {

	LinkedList<Character> lista = new LinkedList<Character>();

	int contador1;
	int contador2;
	int aux;

	public void verificar(String v) {

		if (aux < v.length()) {

			lista.add(v.charAt(aux));
			aux++;
			verificar(v);

		}

		if (!lista.isEmpty()) {
			String l = Character.toString(lista.removeLast());

			if (l.equals("(")) {
				contador1++;
			}

			if (l.equals(")")) {
				contador2++;
			}

		} else {

			if (contador1 == contador2) {

				System.out.println("Estão balanceados");

			} else {

				System.out.println("Estão Desbanlanceados");

			}

		}

	}

}
