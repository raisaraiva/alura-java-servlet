package servlet;

import model.Banco;
import model.Empresa;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/altera")
public class AlteraServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Alterando empresa");
		
		Date data;

		try {
			SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");

			data = simpleDateFormat.parse(request.getParameter("data"));
		} catch (ParseException e) {
			throw new ServletException(e);
		}

		Integer id = Integer.valueOf(request.getParameter("id"));

		System.out.println(id);
		
		Banco banco = new Banco();

		Empresa empresa = banco.buscaEmpresa(id);

		empresa.setNome(request.getParameter("nome"));
		empresa.setDataAbertura(data);
		
		response.sendRedirect("lista");
	}
}
