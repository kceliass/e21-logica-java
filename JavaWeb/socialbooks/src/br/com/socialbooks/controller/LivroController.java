package br.com.socialbooks.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.socialbooks.beans.Livro;
import br.com.socialbooks.model.LivroModel;

@WebServlet("/livro")
public class LivroController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String action = request.getParameter("action");
		
		switch (action) {
		case "list":
			listAction(request,response);
			break;
		case "cad":
			cadAction(request,response);
			break;
		case "ver":
			verAction(request,response);
			break;
		case "edit":
			editAction(request,response);
			break;
		case "del":
			delAction(request,response);
			break;

		default:
			notFoundAction(request,response);
			break;
		}
	}

	private void notFoundAction(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		
	}

	private void delAction(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		
	}

	private void editAction(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		
	}

	private void verAction(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		
	}

	private void listAction(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<Livro> listaLivros = LivroModel.getListLivros();
		
		request.setAttribute("listaLivros", listaLivros);
		request.setAttribute("listSize", listaLivros.size());
		RequestDispatcher rd = request.getRequestDispatcher("listLivros.jsp");
		rd.forward(request, response);
	}

	private void cadAction(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher rd = request.getRequestDispatcher("cadLivros.jsp");
		rd.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// FAZER O POST IGUAL O DO NOTASCONTROLLER
		doGet(request, response);
	}

}
