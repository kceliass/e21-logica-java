package br.com.meudiario.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.meudiario.beans.Nota;
import br.com.meudiario.model.NotasModel;

@WebServlet("/notas")
public class NotasController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String action = request.getParameter("action");
		switch(action) {
		case "list":
			listAction(request, response);
			break;
		
		case "cad":
			cadAction(request, response);
			break;
			
		default:
			notFoundAction(request, response);
			break;
		}
	}

	private void cadAction(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher rd = request.getRequestDispatcher("cadNotaAction.jsp");
		rd.forward(request, response);
		
	}

	private void notFoundAction(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		PrintWriter out = response.getWriter();
		out.println("<html><body>");
		out.println("<h1>Página não encontrada</h1>");
		out.println("</html></body>");
	}

	private void listAction(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<Nota> listaNotas = NotasModel.getListNotas();
		
		request.setAttribute("listaNotas", listaNotas);
		RequestDispatcher rd = request.getRequestDispatcher("listNotaAction.jsp");
		rd.forward(request, response);
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String assunto = request.getParameter("assunto");
		String dtNota = request.getParameter("dt_nota");
		String texto = request.getParameter("texto");
		int id = (request.getParameter("id") != null) ? Integer.parseInt(request.getParameter("id")) : 0;
		int retorno = 0;
		
		if (id > 0) {
			//editar
		} else {
			retorno = NotasModel.cadNota(assunto, dtNota, texto);
		}
	}

}
