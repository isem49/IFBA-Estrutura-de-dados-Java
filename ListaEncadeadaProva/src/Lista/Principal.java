package Lista;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		ListaSimples l = new ListaSimples();
		
		System.out.println("< EMPRESA - RELA��O DE FUNCION�RIOS >");
		
		//ADICIONANDO PRIMEIROS FUNCIONARIOS
		System.out.println("\nInicie adicionando os tr�s primeiros funcion�rios:");
		
		for (int cont = 0; cont < 3; cont++) {
			Funcionario f = new Funcionario();
			
			System.out.print("\nDigite o nome do funcion�rio: ");
			f.setNome(input.next());
			System.out.print("Digite o RG do funcion�rio: ");
			f.setRg(input.next());
			System.out.print("Digite o CPF do funcion�rio: ");
			f.setCpf(input.next());
			System.out.print("Digite a idade do funcion�rio: ");
			f.setIdade(input.nextInt());
			
			l.adicionaNoF(f);
		} 
		
		System.out.println("\n" + l.toString());
		
		//ADICIONANDO NO INICIO
		System.out.println("\n- ADICIONAR NO INICIO -");
		Funcionario f2 = new Funcionario();
		
		System.out.print("\nDigite o nome do funcion�rio: ");
		f2.setNome(input.next());
		System.out.print("Digite o RG do funcion�rio: ");
		f2.setRg(input.next());
		System.out.print("Digite o CPF do funcion�rio: ");
		f2.setCpf(input.next());
		System.out.print("Digite a idade do funcion�rio: ");
		f2.setIdade(input.nextInt());
		
		l.adicionaNoComeco(f2);
		System.out.println(l.toString());
		
		//ADICIONANDO NO FIM
		System.out.println("\n- ADICIONAR NO FIM -");
		Funcionario f3 = new Funcionario();
		
		System.out.print("\nDigite o nome do funcion�rio: ");
		f3.setNome(input.next());
		System.out.print("Digite o RG do funcion�rio: ");
		f3.setRg(input.next());
		System.out.print("Digite o CPF do funcion�rio: ");
		f3.setCpf(input.next());
		System.out.print("Digite a idade do funcion�rio: ");
		f3.setIdade(input.nextInt());
		
		l.adicionaNoF(f3);
		System.out.println(l.toString());
		
		//ADICIONANDO POSI��O ESPEC�FICA
		System.out.println("\n- ADICIONAR EM POSI��O ESPEC�FICA -");
		Funcionario f4 = new Funcionario();
		
		System.out.print("Digite a posi��o que deseja adicionar: ");
		int pos = input.nextInt();
		
		System.out.print("\nDigite o nome do funcion�rio: ");
		f4.setNome(input.next());
		System.out.print("Digite o RG do funcion�rio: ");
		f4.setRg(input.next());
		System.out.print("Digite o CPF do funcion�rio: ");
		f4.setCpf(input.next());
		System.out.print("Digite a idade do funcion�rio: ");
		f4.setIdade(input.nextInt());
		
		l.adicionaPos(pos, f4);
		System.out.println(l.toString());		
		
		//REMOVENDO DO INICIO
		System.out.println("\n- REMOVER DO INICIO -");
		System.out.println("\nDeseja REMOVER o PRIMEIRO funcion�rio?");
		System.out.print("Digite SIM ou N�O -> ");
		String teste = input.next();
		
		if (teste.equalsIgnoreCase("sim")) {
			l.removeDoComeco();
		}
		
		System.out.println(l.toString());
		
		//REMOVENDO DO FIM
		System.out.println("\n- REMOVER DO FIM -");
		System.out.println("\nDeseja REMOVER o �LTIMO funcion�rio?");
		System.out.print("Digite SIM ou N�O -> ");
		String teste2 = input.next();
		
		if (teste2.equalsIgnoreCase("sim")) {
			l.removeF();
		}
		
		System.out.println(l.toString());
		
		//REMOVENDO POSI��O ESPEC�FICA
		System.out.println("\n- REMOVER POSI��O ESPEC�FICA -");
		
		System.out.print("Digite a POSI��O que deseja REMOVER: ");
		int pos2 = input.nextInt();
		
		l.removePos(pos2);
		System.out.println(l.toString());	
		
		input.close();
	}
		

}
