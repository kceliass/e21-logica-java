package br.com.socialbooks.dao;

import java.util.ArrayList;
import java.util.List;

import br.com.socialbooks.beans.Categoria;

public class CategoriaDAO {

	public static List<Categoria> getListCategorias() {
		List<Categoria> listaCategoria = new ArrayList<Categoria>();
		
		listaCategoria.add(new Categoria(1, "Biografia"));
		listaCategoria.add(new Categoria(2, "Ficção Científica"));
		listaCategoria.add(new Categoria(3, "Conto"));
		
		return listaCategoria;
	}
}
