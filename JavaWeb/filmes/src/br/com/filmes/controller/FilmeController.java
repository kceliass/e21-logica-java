package br.com.filmes.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.filmes.beans.Filme;
import br.com.filmes.model.FilmeModel;

@WebServlet("/filme")
public class FilmeController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private FilmeModel filmeModel = new FilmeModel();
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String action = "" + request.getParameter("action");
		switch (action) {
		case "listFilmes":
			listFilmes(request, response);
			break;
		case "cadFilme":
			cadFilme(request, response);
			break;
		case "editFilme":
			editFilme(request, response);
			break;
		case "delFilme":
			delFilme(request, response);
			break;
		default:
			break;
		}
	}
	
	private void listFilmes(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		request.setAttribute("listFilmes", filmeModel.getListaFilmes());
		RequestDispatcher rd = request.getRequestDispatcher("listFilmesAction.jsp");
        rd.forward(request, response);
	}
	
	private void cadFilme(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher rd = request.getRequestDispatcher("cadFilmeAction.jsp");
        rd.forward(request, response);
	}

	private void editFilme(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int id = Integer.parseInt(request.getParameter("id"));
		request.setAttribute("filme", filmeModel.getFilme(id));
		RequestDispatcher rd = request.getRequestDispatcher("editPessoaAction.jsp");
        rd.forward(request, response);
	}
	
	private void delFilme(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int id = Integer.parseInt(request.getParameter("id"));
		
		if(filmeModel.delFilme(id) > 0) {
			response.getWriter().print("OK");
		} else {
			response.getWriter().print("ERRO");
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		String acao = request.getParameter("acao");
		
		switch (acao) {
		case "novoFilme":
			cadNovoFilme(request, response);
			break;
		case "editFilme":
			editFilmeAction(request, response);
			break;
		default:
			break;
		}
	}

	private void cadNovoFilme(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String titulo = request.getParameter("titulo");
		String classificacao = request.getParameter("classificacao");
		String genero = request.getParameter("genero");
		boolean topFilme = ("" + request.getParameter("topfilme")).equalsIgnoreCase("true") ? true : false;
		Filme filme = new Filme(titulo, classificacao, genero, topFilme);
		
		int linhasAfetadas = filmeModel.cadFilme(filme);
		
		if(linhasAfetadas > 0) {
			request.setAttribute("redirect", true);
			request.setAttribute("listFilmes", filmeModel.getListaFilmes());
			RequestDispatcher listFilmes = request.getRequestDispatcher("listFilmesAction.jsp");
			listFilmes.forward(request, response);
		}
	}

	
	private void editFilmeAction(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int id = Integer.parseInt(request.getParameter("id"));
		String titulo = request.getParameter("titulo");
		String classificacao = request.getParameter("classificacao");
		String genero = request.getParameter("genero");
		boolean topFilme = ("" + request.getParameter("topfilme")).equalsIgnoreCase("true") ? true : false;
		Filme filme = new Filme(id, titulo, classificacao, genero, topFilme);
		
		int linhasAfetadas = filmeModel.editFilme(filme);
		
		if(linhasAfetadas > 0) {
			request.setAttribute("redirect", true);
			request.setAttribute("filme", filmeModel.getFilme(id));
			request.setAttribute("topFilmes", filmeModel.getTopFilmes());
			RequestDispatcher listFilmes = request.getRequestDispatcher("verFilmeAction.jsp");
			listFilmes.forward(request, response);
			}
	}
}
