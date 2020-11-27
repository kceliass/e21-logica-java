package br.com.filmes.model;

import java.io.Serializable;
import java.sql.SQLException;
import java.util.ArrayList;

import br.com.filmes.beans.Filme;
import br.com.filmes.dao.FilmeDAO;

public class FilmeModel implements Serializable {
	private static final long serialVersionUID = 1L;
	
	public static ArrayList<Filme> listaFilmes() throws ClassNotFoundException, SQLException {
			return FilmeDAO.listaFilmes();
	}

	public static Filme getFilmeById(int id) throws ClassNotFoundException, SQLException {
		return FilmeDAO.getFilmeById(id);
	}

	public static int cadastraFilme(Filme FilmeSubmit) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		return FilmeDAO.cadastraFilme(FilmeSubmit);
	}

	public static int updateFilme(Filme FilmeSubmit) throws ClassNotFoundException, SQLException {
		return FilmeDAO.updateFilme(FilmeSubmit);
	}

	public static int delFilme(int id) throws ClassNotFoundException, SQLException {
		return FilmeDAO.delFilme(id);
	}
}
