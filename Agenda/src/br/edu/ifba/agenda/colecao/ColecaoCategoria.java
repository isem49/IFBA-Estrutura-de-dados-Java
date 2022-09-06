package br.edu.ifba.agenda.colecao;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.edu.ifba.agenda.basica.Categoria;

public class ColecaoCategoria {

	public void adicionarCategoria(Categoria c) {
		try {
			PreparedStatement stmt = Conexao.getConnection().prepareStatement("insert into Categoria (nome) values (?)");
			stmt.setString(1, c.getNome());
			stmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void UpdateCategoria(Categoria c) {
		try {
			PreparedStatement stmt = Conexao.getConnection().prepareStatement("Update Categoria set nome = ? where id = ? ");
			stmt.setString(1, c.getNome());
			stmt.setInt(2, c.getId());

			stmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	
	public void DeletarCategoria(Categoria c) {
		try {
			PreparedStatement stmt = Conexao.getConnection().prepareStatement("DELETE FROM Categoria where id = ?");
			stmt.setInt(1, c.getId());
			stmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	
	

	
}
