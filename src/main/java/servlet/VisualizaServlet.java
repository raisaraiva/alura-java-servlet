package servlet;

import model.Banco;
import model.Empresa;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/visualiza")
public class VisualizaServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Integer id = Integer.valueOf(request.getParameter("id"));
		
		Banco banco = new Banco();
		
		Empresa empresa = banco.buscaEmpresa(id);
		
		System.out.println(empresa.getNome());

		request.setAttribute("empresa", empresa);
		
		RequestDispatcher requestDispatcher = request.getRequestDispatcher("view/altera.jsp");

		requestDispatcher.forward(request, response);
	}
}
