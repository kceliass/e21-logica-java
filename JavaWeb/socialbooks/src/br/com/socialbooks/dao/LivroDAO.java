package br.com.socialbooks.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.socialbooks.beans.Livro;
import br.com.socialbooks.cnn.ConnectionFactory;

public class LivroDAO {

	public static List<Livro> getListLivros() {
		List<Livro> listaRetorno = new ArrayList<Livro>();
		Connection cnn = ConnectionFactory.getConnection();
		String query = "SELECT * FROM livros";
		
		try {
			PreparedStatement pStm = cnn.prepareStatement(query);
			ResultSet rsLivros = pStm.executeQuery();
			while(rsLivros.next()) {
				Livro livro = new Livro(rsLivros.getInt("id"), 
										rsLivros.getString("titulo"), 
										rsLivros.getString("autor"));
				
				listaRetorno.add(livro);
			}
			rsLivros.close();
			cnn.close();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return listaRetorno;
	}

	public static int cadLivro(Livro livro) {
		Connection cnn = ConnectionFactory.getConnection();
		String sql = "INSERT INTO livros(titulo, autor) VALUES"
				   + "(?, ?)";
		int retorno = 0;
		try {
			PreparedStatement pStm = cnn.prepareStatement(sql);
			pStm.setString(1, livro.getTitulo());
			pStm.setString(1, livro.getAutor());
			
			retorno = pStm.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return retorno;
	}

	public static int editLivro(Livro livro) {
		return 0;
	}

	public static Livro getLivroById(int id) {
		return null;
	}

	public static int delLivro(int id) {
		return 0;
	}

}
