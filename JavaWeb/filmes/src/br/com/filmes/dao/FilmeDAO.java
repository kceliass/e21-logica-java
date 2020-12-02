package br.com.filmes.dao;

import java.io.Serializable;
import java.sql.*;
import java.util.ArrayList;
import java.util.Calendar;

import br.com.filmes.beans.*;
import br.com.filmes.cnn.ConnectionFactory;

public class FilmeDAO implements Serializable{
	private static final long serialVersionUID = 1L;
	private static Connection cnn = ConnectionFactory.getConnection();
	
	public static ArrayList<Filme> getListaFilmes() {
		ArrayList<Filme> listaFilmes = new ArrayList<Filme>();
		Connection cnn = ConnectionFactory.getConnection();
		String query = "SELECT * FROM notas";
		
		try {
			PreparedStatement pStm = cnn.prepareStatement(query);
			ResultSet rsFilmes = pStm.executeQuery();
			
			while(rsFilmes.next()) {
				Filme filme = new Filme(rsFilmes.getInt("id"),rsFilmes.getString("titulo"),
										rsFilmes.getString("classificacao"), rsFilmes.getString("genero"), rsFilmes.getBoolean("top_filme"));
				
				listaFilmes.add(filme);
			}
			
			if (listaFilmes.size() < 1) {
				listaFilmes = null;
			}
			
			rsFilmes.close();
			cnn.close();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return listaFilmes;
	}
	
	public static ArrayList<Filme> getTopFilmes() {
		ArrayList<Filme> topFilmes = new ArrayList<Filme>();
		
		try {
			String query = "SELECT * FROM FILME WHERE TOP_FILME = TRUE";
			PreparedStatement pSmt = cnn.prepareStatement(query);
			ResultSet rsFilmes = pSmt.executeQuery();
			
			while(rsFilmes.next()) {
				Filme filme = new Filme(rsFilmes.getInt("id"), rsFilmes.getString("titulo"), rsFilmes.getString("classificacao"), 
										rsFilmes.getString("genero"), rsFilmes.getBoolean("top_filme"));
				
				topFilmes.add(filme);
			}
			
			rsFilmes.close();
			cnn.close();
			
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (NullPointerException e) {
			topFilmes = null;
		}
		
		return topFilmes;
	}
	
	public static int cadFilme(Filme filme) {
		String query = "INSERT INTO FILME(titulo, classificacao, genero, top_filme) "
					 + "VALUE(?, ?, ?, ?, " + filme.getTopFilme() + ");";
		Connection cnn = ConnectionFactory.getConnection();
		int linhasAfetadas = 0;
		try {
			PreparedStatement pSmt = cnn.prepareStatement(query);
			pSmt.setString(1, filme.getTitulo());
			pSmt.setString(2, filme.getClassificacao());
			pSmt.setString(3, filme.getGenero());
			
			linhasAfetadas = pSmt.executeUpdate();
			pSmt.close();
			
		} catch(SQLException e) {
			e.printStackTrace();
		}
		
		return linhasAfetadas;
	}
	
	public static int delFilme(int id) {
		int linhasAfetadas = 0;
		
		try {
			String query = "DELETE FROM filmes WHERE id = " + id + ";";
			Connection cnn = ConnectionFactory.getConnection();
			PreparedStatement pSmt = cnn.prepareStatement(query);
			linhasAfetadas = pSmt.executeUpdate();
			pSmt.close();
			
			PreparedStatement textExistemFilmes = cnn.prepareStatement("SELECT * FROM filmes;");
			ResultSet rsFilmes = textExistemFilmes.executeQuery();
			
			if(rsFilmes.next()) {
				String anoAtual= ("" + Calendar.getInstance().get(Calendar.YEAR)).substring(2, 4);
				String resetID = "ALTER TABLE filmes AUTO_INCREMENT = " + anoAtual + "0001" + ";";
				
				PreparedStatement resetaID = cnn.prepareStatement(resetID);
				resetaID.executeUpdate();
				resetaID.close();
			}
			pSmt.close();
			cnn.close();
			textExistemFilmes.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return linhasAfetadas;
	}
	
	public static int editFilme(Filme filme) {
		String query = "UPDATE filmes SET titulo = ?, classificacao = ?, "
					 + "genero = ?, top_filme = ? WHERE id = " + filme.getId() + ";";
		Connection cnn = ConnectionFactory.getConnection();
		int linhasAfetadas = 0;
		try {
			PreparedStatement pSmt = cnn.prepareStatement(query);
			pSmt.setString(1, filme.getTitulo());
			pSmt.setString(2, filme.getClassificacao());
			pSmt.setString(3, filme.getGenero());
			pSmt.setBoolean(4, filme.getTopFilme());
			
			linhasAfetadas = pSmt.executeUpdate();
			pSmt.close();
			cnn.close();
			
		} catch(SQLException e) {
			e.printStackTrace();
		}
		
		return linhasAfetadas;
	}
	
	public static Filme getFilme(int id) {
		Filme filme = new Filme();
		String query = "SELECT * FROM FILME WHERE ID = " + id + ";";
		
		try {
			PreparedStatement pSmt = cnn.prepareStatement(query);
			ResultSet rsFilmes = pSmt.executeQuery();
			
			if(rsFilmes.next()) {
				filme.setId(id);
				filme.setTitulo(rsFilmes.getString("titulo"));
				filme.setGenero(rsFilmes.getString("genero"));
				filme.setClassificacao(rsFilmes.getString("classificacao"));
				filme.setTopFilme(rsFilmes.getBoolean("top_filme"));
			}
			
			pSmt.close();
			
		} catch(SQLException e) {
			e.printStackTrace();
		}
		
		return filme;
	}
	
}
