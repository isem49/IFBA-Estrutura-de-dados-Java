
public class Recursao {
	
	int total;
	
	public int contar(int n) {
		
		if(n==0) {
			
			return 0;
			
		}
		
		System.out.println("Pilha ---> " + n);
		System.out.println();
		
		total = n + contar(n-1);
		
		System.out.println("Desmontagem da pilha ---> " + total);
		System.out.println();
		
		return total;
		
	}
	
	
	
}
