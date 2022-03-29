package casting;

import java.text.DecimalFormat;

public class Exemplo03 {

	public static void main(String[] args) {
		 
		double valorDouble = 10.12345689;
		
		DecimalFormat conversor = new DecimalFormat("#.##");
		
		System.out.println(conversor.format(valorDouble));

	}

}
