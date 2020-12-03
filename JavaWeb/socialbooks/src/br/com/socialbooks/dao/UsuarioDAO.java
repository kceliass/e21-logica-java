package br.com.socialbooks.dao;

import br.com.socialbooks.beans.Usuario;

public class UsuarioDAO {

	public static Usuario getLogin(String login, String senha) {
		String query = "SELECT * FROM usuario WHERE login = ? and senha = ?";
		
		Usuario usuario = new Usuario(login, senha);
		usuario.setNome("Kauan Elias");
		return usuario;
		
	}

}
