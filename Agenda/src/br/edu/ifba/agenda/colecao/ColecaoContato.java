package br.edu.ifba.agenda.colecao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.edu.ifba.agenda.basica.Categoria;
import br.edu.ifba.agenda.basica.Contato;


public class ColecaoContato {
	
	public void adicionarContato(Contato c) {
		try {
			PreparedStatement stmt = Conexao.getConnection()
					.prepareStatement("insert into Contato (nome, email, fone, celular, id_categoria) values (?,?,?,?,?)");
			stmt.setString(1, c.getNome());
			stmt.setString(2, c.getEmail());
			stmt.setString(3, c.getFone());
			stmt.setString(4, c.getCelular());
			stmt.setInt(5, c.getCategoria().getId());


			stmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void UpdateContato(Contato c) {
		try {
			PreparedStatement stmt = Conexao.getConnection()
					.prepareStatement("Update Contato set nome = ? where id = ? ");
			stmt.setString(1, c.getNome());
			stmt.setInt(2, c.getId());

			stmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void DeletarContato(Contato c) {
		try {
			PreparedStatement stmt = Conexao.getConnection().prepareStatement("DELETE FROM Contato where id = ?");
			stmt.setInt(1, c.getId());
			stmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public List<Contato> ListarContato() {
		
		ColecaoCategoria cc = new ColecaoCategoria();

		List<Contato> contatos = new ArrayList<Contato>();

		try {

			PreparedStatement stmt = Conexao.getConnection().prepareStatement("Select * from Contato");
			ResultSet rs = stmt.executeQuery();

			while (rs.next()) {

				Contato c = new Contato();
				
				c.setId(rs.getInt("id"));
				c.setNome(rs.getString("Nome"));
				c.setEmail(rs.getString("Email"));
				c.setFone(rs.getString("Fone"));
				c.setCelular(rs.getString("Celular"));
				c.setCategoria(cc.ProcurarCategoriaId(rs.getInt("id_categoria")));
				contatos.add(c);

			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return contatos;

	}
	
	public Contato ProcurarContatoId(int id) {

		try {

			PreparedStatement stmt = Conexao.getConnection().prepareStatement("Select * from Contato where id = ?");
			stmt.setInt(1, id);
			ResultSet rs = stmt.executeQuery();
		
			
			if(rs.next()) {
				
				Contato c = new Contato();
				c.setId(rs.getInt("id"));
				c.setNome(rs.getString("Nome"));
				return c;
				
			}
			

		} catch (SQLException e) {
			
			e.printStackTrace();
			
		}
		
		return null;

		

	}
	
	public Contato ProcurarContatoNome(String nome) {

		try {

			PreparedStatement stmt = Conexao.getConnection().prepareStatement("Select * from Contato where nome = ?");
			stmt.setString(1, nome);
			ResultSet rs = stmt.executeQuery();
		
			
			if(rs.next()) {
				
				Contato c = new Contato();
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
