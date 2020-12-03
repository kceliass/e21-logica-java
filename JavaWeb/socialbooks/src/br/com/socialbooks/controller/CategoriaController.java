package br.com.socialbooks.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/categoria")
public class CategoriaController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		if(session.getAttribute("usuarioLogado") != null && "1".equals(session.getAttribute("usuarioLogado"))) {
			String action = (request.getParameter("action") != null) ? request.getParameter("action") : "list";
			switch (action) {
				case "list":
					listAction(request,response, session);
				case "cad":
					cadAction(request,response, session);
					break;
				case "edit":
					editAction(request,response, session);
					break;
				case "del":
					delAction(request,response, session);
					break;
		
				default:
					notFoundAction(request,response);
					break;
			}
	}

	private void listAction(HttpServletRequest request, HttpServletResponse response, HttpSession session) {
		// TODO Auto-generated method stub
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}
