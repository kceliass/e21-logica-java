package br.com.socialbooks.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import br.com.socialbooks.beans.Usuario;
import br.com.socialbooks.model.UsuarioModel;

@WebServlet("/login")
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.sendRedirect("/socialbook/");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String action = request.getParameter("action");
		
		if("login".equals(action)) {
			loginAction(request,response);
		} else {
			logoutAction(request, response);
		}
	}

	private void logoutAction(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		session.setAttribute("usuarioLogado", null);
		session.setAttribute("nome", null);
		session.setAttribute("login", null);
		response.sendRedirect("/socialbooks/");
	}

	private void loginAction(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String login = request.getParameter("login");
		String senha = request.getParameter("senha");
		HttpSession session = request.getSession();
		
		Usuario usuario = UsuarioModel.getLogin(login, senha);
		
		if(usuario != null) {
			session.setAttribute("usuarioLogado", "1");
			session.setAttribute("nome", usuario.getNome());
			session.setAttribute("login", usuario.getLogin());
			response.sendRedirect("livros");
		} else {
			session.setAttribute("erroMsg", "Login ou Senha Incorretos");
			response.sendRedirect("/socialbooks/");
		}
	}

}