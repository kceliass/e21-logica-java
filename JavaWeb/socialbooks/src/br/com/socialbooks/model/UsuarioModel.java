package br.com.socialbooks.model;

import br.com.socialbooks.beans.Usuario;
import br.com.socialbooks.dao.UsuarioDAO;

public class UsuarioModel {

	public static Usuario getLogin(String login, String senha) {
		String senhaEncriptada = senha;
		return UsuarioDAO.getLogin(login, senhaEncriptada);
	}

}
