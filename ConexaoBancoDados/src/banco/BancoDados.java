package banco;

import java.sql.SQLException;

import controller.ConexaoMySql;

public class BancoDados {

	public static void main(String[] args) {
		try {
		ConexaoMySql conexao = new ConexaoMySql();
		conexao.createConnection();
		
		System.out.println("\nDupla ");
		conexao.selecionar("SELECT * FROM dupla");
		while (conexao.resultset.next()) {
		System.out.println("\nid: " + conexao.resultset.getInt("id"));
		System.out.println("nome: " + conexao.resultset.getString("nome"));
		}
		
		System.out.println("\nCidades ");
		conexao.selecionar("SELECT * FROM cidade");
		while (conexao.resultset.next()) {
		System.out.println("\nid: " + conexao.resultset.getInt("id"));
		System.out.println("nome: " + conexao.resultset.getString("nome"));
		System.out.println("estado: " +conexao.resultset.getString("estado"));
		}
		
		} catch (SQLException ex) {		
			System.out.println("Erro no SQL");
		}
		
		
		
		
	}

}
