package br.com.filmes.dao;

import java.sql.*;
import java.util.ArrayList;

import br.com.filmes.beans.Filme;
import br.com.filmes.cnn.ConnectionFactory;

public class FilmeDAO {

	public static ArrayList<Filme> listaFilmes() throws ClassNotFoundException, SQLException {
		Connection cnn = ConnectionFactory.getConnection();
		String query = "select * from Filme";
		ArrayList<Filme> arFilmes = new ArrayList();

		try {
			PreparedStatement pStm = cnn.prepareStatement(query);
			ResultSet rsFilmes = pStm.executeQuery();

			while (rsFilmes.next()) {
				Filme fil = new Filme(rsFilmes.getLong("id"), rsFilmes.getString("titulo"),
						rsFilmes.getInt("classificacao"), rsFilmes.getString("genero"));
				arFilmes.add(fil);
			}
			cnn.close();
			rsFilmes.close();
			return arFilmes;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public static int cadastrarFilme(Filme objFilme) {
		
		return 1;
	}

	public static Filme getFilmeById(int id) throws ClassNotFoundException, SQLException {
		Filme FilmeRetorno = new Filme();
		String query = "SELECT * FROM Filme WHERE id = ?";
		Connection cnn = ConnectionFactory.getConnection();
		
		try {
			PreparedStatement pStmt = cnn.prepareStatement(query);
			pStmt.setInt(1, id);
			
			ResultSet rsFilme = pStmt.executeQuery();
			while(rsFilme.next()) {
				FilmeRetorno.setId(id);
				FilmeRetorno.setTitulo(rsFilme.getString("titulo"));
				FilmeRetorno.setClassificacao(rsFilme.getInt("classificacao"));
				FilmeRetorno.setGenero(rsFilme.getString("genero"));
			}
			rsFilme.close();
			cnn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return FilmeRetorno;
	}

	public static int cadastraFilme(Filme FilmeSubmit) throws ClassNotFoundException, SQLException {
		String query = "INSERT INTO Filme(titulo, classificacao, genero) values (?, ?, ?)";
		Connection cnn = ConnectionFactory.getConnection();
		int linhasAfetadas = 0;
		
		try {
			PreparedStatement pStmt = cnn.prepareStatement(query);
			pStmt.setString(1, FilmeSubmit.getTitulo());
			pStmt.setInt(2, FilmeSubmit.getClassificacao());
			pStmt.setString(3, FilmeSubmit.getGenero());
			linhasAfetadas = pStmt.executeUpdate();
			cnn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return linhasAfetadas;
	}

	public static int updateFilme(Filme FilmeSubmit) throws ClassNotFoundException, SQLException {
		String query = "UPDATE Filme SET nome = ?, dt_nascimento = ? WHERE id= ?";
		Connection cnn = ConnectionFactory.getConnection();
		int linhasAfetadas = 0;
		
		try {
			PreparedStatement pStmt = cnn.prepareStatement(query);
			pStmt.setString(1, FilmeSubmit.getTitulo());
			pStmt.setInt(2, FilmeSubmit.getClassificacao());
			pStmt.setLong(3, FilmeSubmit.getId());
			linhasAfetadas = pStmt.executeUpdate();
			cnn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return linhasAfetadas;
	}

	public static int delFilme(int id) throws ClassNotFoundException, SQLException {
		String query = "DELETE FROM Filme WHERE id= ?";
		Connection cnn = ConnectionFactory.getConnection();
		int linhasAfetadas = 0;
		
		try {
			PreparedStatement pStmt = cnn.prepareStatement(query);
			pStmt.setInt(1, id);
			linhasAfetadas = pStmt.executeUpdate();
			cnn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return linhasAfetadas;
	}
}
