package br.com.socialbooks.model;

import java.util.List;

import br.com.socialbooks.beans.Categoria;
import br.com.socialbooks.dao.CategoriaDAO;

public class CategoriaModel {
	
	public static List<Categoria> getListCategorias() {
		return CategoriaDAO.getListCategorias();
	}
}
