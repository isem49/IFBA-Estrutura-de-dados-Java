package br.edu.ifba.agenda.colecao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.mysql.cj.protocol.Resultset;

import br.edu.ifba.agenda.basica.Categoria;

public class ColecaoCategoria {

	public void adicionarCategoria(Categoria c) {
		try {
			PreparedStatement stmt = Conexao.getConnection()
					.prepareStatement("insert into Categoria (nome) values (?)");
			stmt.setString(1, c.getNome());
			stmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void UpdateCategoria(Categoria c) {
		try {
			PreparedStatement stmt = Conexao.getConnection()
					.prepareStatement("Update Categoria set nome = ? where id = ? ");
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

	public List<Categoria> ListarCategoria() {

		List<Categoria> categorias = new ArrayList<Categoria>();

		try {

			PreparedStatement stmt = Conexao.getConnection().prepareStatement("Select * from Categoria");
			ResultSet rs = stmt.executeQuery();

			while (rs.next()) {

				Categoria c = new Categoria();
				c.setId(rs.getInt("id"));
				c.setNome(rs.getString("Nome"));
				categorias.add(c);

			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return categorias;

	}
	
	public Categoria ProcurarCategoriaId(int id) {

		try {

			PreparedStatement stmt = Conexao.getConnection().prepareStatement("Select * from Categoria where id = ?");
			stmt.setInt(1, id);
			ResultSet rs = stmt.executeQuery();
		
			
			if(rs.next()) {
				
				Categoria c = new Categoria();
				c.setId(rs.getInt("id"));
				c.setNome(rs.getString("Nome"));
				return c;
				
			}
			

		} catch (SQLException e) {
			
			e.printStackTrace();
			
		}
		
		return null;

		

	}
	
	public Categoria ProcurarCategoriaNome(String nome) {

		try {

			PreparedStatement stmt = Conexao.getConnection().prepareStatement("Select * from Categoria where nome = ?");
			stmt.setString(1, nome);
			ResultSet rs = stmt.executeQuery();
		
			
			if(rs.next()) {
				
				Categoria c = new Categoria();
				c.setId(rs.getInt("id"));
				c.setNome(rs.getString("Nome"));
				return c;
				
			}
			

		} catch (SQLException e) {
			
			e.printStackTrace();
			
		}
		
		return null;

		

	}
	

}
