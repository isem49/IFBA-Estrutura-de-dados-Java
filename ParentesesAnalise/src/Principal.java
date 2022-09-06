
public class Principal {

	public static void main(String[] args) {
		
		Verificar v = new Verificar();
		
		System.out.println("===== Balanceamento de parenteses =====");
		System.out.println();
		v.verificar("(5+5)+(5+5)*5");
		
	}

}
