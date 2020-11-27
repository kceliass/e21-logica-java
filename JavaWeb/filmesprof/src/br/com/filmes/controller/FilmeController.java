package br.com.filmes.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.filmes.beans.Filme;
import br.com.filmes.model.FilmeModel;

/**
 * Servlet implementation class FilmeController
 */
@WebServlet("/Filme")
public class FilmeController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private FilmeModel filmeModel = new FilmeModel();

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		switch (request.getParameter("action")) {
		case "listFilmes":
			listaFilmesAction(request, response);
			break;
		case "cadFilme":
			cadFilmeAction(request, response);
			break;
		case "verFilme":
			verFilmeAction(request, response);
			break;
		case "editFilme":
			editFilmeAction(request, response);
			break;
		case "delFilme":
			delFilmeAction(request, response);
			break;

		default:
			break;
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String nome = request.getParameter("nome");
		String dataNascimento = request.getParameter("dataNascimento");
		String sexo = request.getParameter("sexo");
		Integer id = Integer.parseInt(request.getParameter("id"));
		int retorno = 0;
		Filme FilmeSubmit = new Filme();
		FilmeSubmit.setTitulo(titulo);
		FilmeSubmit.setClassificacao(dataNascimento);
		FilmeSubmit.set(sexo.charAt(0));
		
		if(id != null) {
			FilmeSubmit.setId(id);
			retorno = FilmeModel.updateFilme(FilmeSubmit);
		} else {		
			retorno = FilmeModel.cadastraFilme(FilmeSubmit);
		}
		
		PrintWriter out = response.getWriter();
		if(retorno > 0) {		
			out.println("<body>");
			out.println("<b>Filme " + nome + " Alterada com Sucesso!</b>");
			out.println("<a href='Filme?action=listFilmes'>Voltar</a>");
			out.println("</body>");
		} else {
			out.println("<body>");
			out.println("<b>Ocorreu um erro, não foi possível cadastrar a Filme!</b>");
			out.println("<a href='Filme?action=listFilmes'>Voltar</a>");
			out.println("</body>");
		}
	}
	
	protected void listaFilmesAction(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// Buscar dados do banco
		List<Filme> objListaFilme = new ArrayList<Filme>();
		objListaFilme = FilmeModel.listaFilmes();
		
		request.setAttribute("listaFilmes", objListaFilme);
		RequestDispatcher rd = request.getRequestDispatcher("listaFilmesAction.jsp");
        rd.forward(request, response);
	}
	
	protected void cadFilmeAction(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		RequestDispatcher rd = request.getRequestDispatcher("cadFilmeAction.jsp");
        rd.forward(request, response);
	}

	private void verFilmeAction(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int id = Integer.parseInt(request.getParameter("id"));
		Filme Filme = FilmeModel.getFilmeById(id);
		
		request.setAttribute("objFilme", Filme);
		RequestDispatcher rd = request.getRequestDispatcher("verFilmeAction.jsp");
        rd.forward(request, response);
		
	}

	private void delFilmeAction(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int id = Integer.parseInt(request.getParameter("id"));
		
		if(FilmeModel.delFilme(id) > 0) {
			response.getWriter().print("OK");
		} else {
			response.getWriter().print("ERRO");
		}
		
	}

	private void editFilmeAction(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int id = Integer.parseInt(request.getParameter("id"));
		Filme Filme = FilmeModel.getFilmeById(id);
		
		request.setAttribute("objFilme", Filme);
		RequestDispatcher rd = request.getRequestDispatcher("editFilmeAction.jsp");
        rd.forward(request, response);
		
	}

}
