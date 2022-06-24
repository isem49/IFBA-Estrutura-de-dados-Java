package Lista;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		ListaSimples l = new ListaSimples();
		
		System.out.println("< EMPRESA - RELAÇÃO DE FUNCIONÁRIOS >");
		
		//ADICIONANDO PRIMEIROS FUNCIONARIOS
		System.out.println("\nInicie adicionando os três primeiros funcionários:");
		
		for (int cont = 0; cont < 3; cont++) {
			Funcionario f = new Funcionario();
			
			System.out.print("\nDigite o nome do funcionário: ");
			f.setNome(input.next());
			System.out.print("Digite o RG do funcionário: ");
			f.setRg(input.next());
			System.out.print("Digite o CPF do funcionário: ");
			f.setCpf(input.next());
			System.out.print("Digite a idade do funcionário: ");
			f.setIdade(input.nextInt());
			
			l.adicionaNoF(f);
		} 
		
		System.out.println("\n" + l.toString());
		
		//ADICIONANDO NO INICIO
		System.out.println("\n- ADICIONAR NO INICIO -");
		Funcionario f2 = new Funcionario();
		
		System.out.print("\nDigite o nome do funcionário: ");
		f2.setNome(input.next());
		System.out.print("Digite o RG do funcionário: ");
		f2.setRg(input.next());
		System.out.print("Digite o CPF do funcionário: ");
		f2.setCpf(input.next());
		System.out.print("Digite a idade do funcionário: ");
		f2.setIdade(input.nextInt());
		
		l.adicionaNoComeco(f2);
		System.out.println(l.toString());
		
		//ADICIONANDO NO FIM
		System.out.println("\n- ADICIONAR NO FIM -");
		Funcionario f3 = new Funcionario();
		
		System.out.print("\nDigite o nome do funcionário: ");
		f3.setNome(input.next());
		System.out.print("Digite o RG do funcionário: ");
		f3.setRg(input.next());
		System.out.print("Digite o CPF do funcionário: ");
		f3.setCpf(input.next());
		System.out.print("Digite a idade do funcionário: ");
		f3.setIdade(input.nextInt());
		
		l.adicionaNoF(f3);
		System.out.println(l.toString());
		
		//ADICIONANDO POSIÇÃO ESPECÍFICA
		System.out.println("\n- ADICIONAR EM POSIÇÃO ESPECÍFICA -");
		Funcionario f4 = new Funcionario();
		
		System.out.print("Digite a posição que deseja adicionar: ");
		int pos = input.nextInt();
		
		System.out.print("\nDigite o nome do funcionário: ");
		f4.setNome(input.next());
		System.out.print("Digite o RG do funcionário: ");
		f4.setRg(input.next());
		System.out.print("Digite o CPF do funcionário: ");
		f4.setCpf(input.next());
		System.out.print("Digite a idade do funcionário: ");
		f4.setIdade(input.nextInt());
		
		l.adicionaPos(pos, f4);
		System.out.println(l.toString());		
		
		//REMOVENDO DO INICIO
		System.out.println("\n- REMOVER DO INICIO -");
		System.out.println("\nDeseja REMOVER o PRIMEIRO funcionário?");
		System.out.print("Digite SIM ou NÃO -> ");
		String teste = input.next();
		
		if (teste.equalsIgnoreCase("sim")) {
			l.removeDoComeco();
		}
		
		System.out.println(l.toString());
		
		//REMOVENDO DO FIM
		System.out.println("\n- REMOVER DO FIM -");
		System.out.println("\nDeseja REMOVER o ÚLTIMO funcionário?");
		System.out.print("Digite SIM ou NÃO -> ");
		String teste2 = input.next();
		
		if (teste2.equalsIgnoreCase("sim")) {
			l.removeF();
		}
		
		System.out.println(l.toString());
		
		//REMOVENDO POSIÇÃO ESPECÍFICA
		System.out.println("\n- REMOVER POSIÇÃO ESPECÍFICA -");
		
		System.out.print("Digite a POSIÇÃO que deseja REMOVER: ");
		int pos2 = input.nextInt();
		
		l.removePos(pos2);
		System.out.println(l.toString());	
		
		input.close();
	}
		

}
