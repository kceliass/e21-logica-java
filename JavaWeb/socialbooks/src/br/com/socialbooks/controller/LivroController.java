package br.com.socialbooks.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.google.gson.Gson;

import br.com.socialbooks.beans.Categoria;
import br.com.socialbooks.beans.Livro;
import br.com.socialbooks.model.CategoriaModel;
import br.com.socialbooks.model.LivroModel;

@WebServlet("/livro")
public class LivroController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		if(session.getAttribute("usuarioLogado") != null && "1".equals(session.getAttribute("usuarioLogado"))) {
			String action = (request.getParameter("action") != null) ? request.getParameter("action") : "list";
			switch (action) {
				case "list":
					listAction(request,response, session);
					break;
				case "cad":
					cadAction(request,response, session);
					break;
				case "ver":
					verAction(request,response, session);
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
	}

	private void notFoundAction(HttpServletRequest request, HttpServletResponse response) throws IOException {
		PrintWriter out = response.getWriter();
		out.println("<html><body>");
		out.println("<h1>P�gina N�o Encontrada</h1>");
		out.println("</html></body>");
		
	}

	private void delAction(HttpServletRequest request, HttpServletResponse response, HttpSession session) {
		int id = (request.getParameter("id") != null)? Integer.parseInt(request.getParameter("id")) : 0;
		int retorno;
		String textoResponse = "Ocorreu m Erro ao Apagar a Nota";
		
		if(id > 0) {
			retorno = LivroModel.delLivro(id);
			if(retorno > 0) {
				textoResponse = "Nota Apagada com Sucesso!";
			}
		}
		
		request.setAttribute("mensagem", textoResponse);
		RequestDispatcher rd = request.getRequestDispatcher("pageSuccess.jsp");
	}

	private void editAction(HttpServletRequest request, HttpServletResponse response, HttpSession session) throws IOException {
		int id = (request.getParameter("id") != null)? Integer.parseInt(request.getParameter("id")) : 0;
		Livro livro = new Livro();
		
		if(id > 0) {
			livro = LivroModel.getLivroById(id);
		}
		
		Gson gson = new Gson();
		response.getWriter().print(gson.toJson(livro));
	}


	private void verAction(HttpServletRequest request, HttpServletResponse response, HttpSession session) throws ServletException, IOException {
		int id = Integer.parseInt(request.getParameter("id"));
		Livro livro = LivroModel.getLivroById(id);
		
		request.setAttribute("livro", livro);
		RequestDispatcher rd = request.getRequestDispatcher("verLivro.jsp");
		rd.forward(request, response);
		
	}

	private void listAction(HttpServletRequest request, HttpServletResponse response, HttpSession session) throws ServletException, IOException {
		List<Livro> listaLivros = LivroModel.getListLivros();
		
		request.setAttribute("listaLivros", listaLivros);
		request.setAttribute("listSize", listaLivros.size());
		RequestDispatcher rd = request.getRequestDispatcher("livros/listLivros.jsp");
		rd.forward(request, response);
	}

	private void cadAction(HttpServletRequest request, HttpServletResponse response, HttpSession session) throws ServletException, IOException {
		List<Categoria> listaCategoria = CategoriaModel.getListCategorias();
		
		request.setAttribute("listaCategoria", listaCategoria);
		request.setAttribute("usuarioNome", session.getAttribute("nome"));
		RequestDispatcher rd = request.getRequestDispatcher("livros/cadLivros.jsp");
		rd.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher rd;
		String titulo = request.getParameter("titulo");
		String autor = request.getParameter("autor");
		int idCategoria = Integer.parseInt(request.getParameter("categoria_id"));
		Categoria categoria = new Categoria(idCategoria,"");
		int id = (request.getParameter("id") != null)? Integer.parseInt(request.getParameter("id")) : 0;
		int retorno = 0;
		
		try {
			
			if(id > 0) {
				retorno = LivroModel.editLivro(id, titulo, autor, categoria);
			} else {
				retorno = LivroModel.cadLivro(titulo, autor, categoria);
			}
			
			if(retorno > 0) {
				request.setAttribute("mensagem", "Registro Salvo com Sucesso");
				rd = request.getRequestDispatcher("pageSuccess.jsp");
			} else {
				request.setAttribute("mensagem", "Erro ao salvar o Registro");
				rd = request.getRequestDispatcher("pageError.jsp");
			}
			
			rd.forward(request, response);
			
		} catch (Exception e) {
			
		}
	}

}
